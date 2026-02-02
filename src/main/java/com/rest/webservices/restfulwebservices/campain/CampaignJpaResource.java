package com.rest.webservices.restfulwebservices.campain;

import com.rest.webservices.restfulwebservices.jpa.CampainRepositoryExp;
import com.rest.webservices.restfulwebservices.jpa.InMPromoCampainRepositoryExp;
import com.rest.webservices.restfulwebservices.wsdl.DTImportCampaignRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
public class CampaignJpaResource {

    private final CampainRepositoryExp campainRepository;
    private final InMPromoCampainRepositoryExp campainImMPRepository;
    private final SIOSCampaignClient  siOSCampaignClient;

    private static final Logger LOG = LoggerFactory.getLogger(CampaignJpaResource.class);

    public CampaignJpaResource(CampainRepositoryExp campainRepository, InMPromoCampainRepositoryExp campainImMPRepository, SIOSCampaignClient siOSCampaignClient) {
        this.campainRepository = campainRepository;
        this.siOSCampaignClient = siOSCampaignClient;
        this.campainImMPRepository = campainImMPRepository;
    }

    @GetMapping("/jpa/campains")
    public List<MPImportCampaignReq> retrieveAllCampains() {

        return campainRepository.findAll();
    }

    @GetMapping("/jpa/campains/{id}")
    public EntityModel<MPImportCampaignReq> retrieveCampain(@PathVariable Long id) {

        Optional<MPImportCampaignReq> mtImportCampainReq = campainRepository.findById(id);

        if (mtImportCampainReq == null) {
            throw new CanpainNotFoundException("id:" + id);
        }
        //return mtImportCampainReq;
        //wrapping the user class
        EntityModel<MPImportCampaignReq> entityModel = EntityModel.of(mtImportCampainReq.get());
        //crate a link
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllCampains());
        //add the link
        entityModel.add(link.withRel("all-canpains"));

        return entityModel;
    }

    @DeleteMapping("/jpa/campains/{id}")
    public void deleteCampain(@PathVariable Long id) {
        campainRepository.deleteById(id);
    }

    @PostMapping("/jpa/campains")
    public ResponseEntity<MPImportCampaignReq> createCampain(@Valid @RequestBody MPImportCampaignReq mtImportCampainReq) throws Exception {


        DTImportCampaignRes dTImportCampaignRes = new DTImportCampaignRes();

        /* MABEOnly = 0: Mabeplan UND Kampagne */
        /* MABEOnly = 1: nur Mabeplan */
        /* MABEOnly = 2: nur Kampagne */

        if(mtImportCampainReq.getKamp_mabe_only()==null){
            mtImportCampainReq.setMABEOnly("0");
        }else if(mtImportCampainReq.getKamp_mabe_only()!=null) {
            mtImportCampainReq.setMABEOnly(mtImportCampainReq.getKamp_mabe_only());
        }
        /* Updateflag setzen. */
        if((mtImportCampainReq.getIn_m_promo_angelegt()==null) && (mtImportCampainReq.getIn_mabe_plan_angelegt()==null) && ("N".equals(mtImportCampainReq.getDeleted_flg()))) {
            mtImportCampainReq.setUpdate("0"); //Neunanlage
        }

        if((("1".equals(mtImportCampainReq.getIn_m_promo_angelegt())) || ("1".equals(mtImportCampainReq.getIn_mabe_plan_angelegt()))) && ("N".equals(mtImportCampainReq.getDeleted_flg()))) {
            mtImportCampainReq.setUpdate("1"); //Aenderung
        }

        if((("1".equals(mtImportCampainReq.getIn_m_promo_angelegt())) || ("1".equals(mtImportCampainReq.getIn_mabe_plan_angelegt()))) && ("Y".equals(mtImportCampainReq.getDeleted_flg()))) {
            mtImportCampainReq.setUpdate("2"); // Loeschen
        }

        //Save on import_campaign_req
        MPImportCampaignReq savedCampain = campainRepository.save(mtImportCampainReq);

        // Generate the URL of the created campain
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedCampain.getId())
                .toUri();

        /* SOAP REQ/RES an M-PROMO
        try {
                dTImportCampaignRes = siOSCampaignClient.sendSIOSCampaignReq(mtImportCampainReq);

                if (("S".equals(dTImportCampaignRes.getMessage().getType())) || ("I".equals(dTImportCampaignRes.getMessage().getType())) || ("W".equals(dTImportCampaignRes.getMessage().getType())))
                {
                    LOG.info("Massnahme konnte erfolgreich in M-PROMO angelegt werden");
                } else  LOG.info("Massnahme konnte nicht erfolgreich in M-PROMO angelegt werden");
            }
        catch (Exception ex) {
                LOG.info("Fehler beim Senden des SOAP Requests: " + ex.getMessage());
                ex.printStackTrace();
            }
     */
        //Save on in_mpromo_angelegte_kampagne
        createAngelegteCampain(mtImportCampainReq, dTImportCampaignRes.getMessage().getText(), dTImportCampaignRes.getMessage().getType());

        return ResponseEntity.created(location).build();
    }

    public InMPromoAngelegteKampagnen createAngelegteCampain(MPImportCampaignReq mtImportCampainReq, String mpromo_return_text, String mpromo_return_code) throws Exception {

        //Delete Angelegte Campain if exist
        retrieveAngelegteCampain(mtImportCampainReq.getId())
                .ifPresent(campain -> deleteAngelegteCampain(campain.getId()));

        InMPromoAngelegteKampagnen savedAngelegteCampaign = new InMPromoAngelegteKampagnen();


        savedAngelegteCampaign.setCampaign_sk(mtImportCampainReq.getExtKampagnenId().substring(mtImportCampainReq.getExtKampagnenId().length() - 5));
        savedAngelegteCampaign.setCampaign_cd(mtImportCampainReq.getExtKampagnenId());
        savedAngelegteCampaign.setCampaign_nm(mtImportCampainReq.getKampagneName().getFirst().getBezeichnung());
        savedAngelegteCampaign.setCampaign_desc(mtImportCampainReq.getBeschreibung().getFirst().getBezeichnung());
        savedAngelegteCampaign.setLast_modified_dttm();

        /* Updateflag setzen. */
        if ("0".equals(mtImportCampainReq.getUpdate())) {
            savedAngelegteCampaign.setDeleted_flg("N");
        }
        else if ("1".equals(mtImportCampainReq.getUpdate())) {
            savedAngelegteCampaign.setDeleted_flg("N");
        } else if ("2".equals(mtImportCampainReq.getUpdate())) {
            savedAngelegteCampaign.setDeleted_flg("Y");
        }

        /* Nutze IN_MPROMO_ANGELEGT und IN_MABE_PLAN_ANGELEGT hier basierend
         auf geschickten Anlageoptionen (ex. MABE_ONLY) */

        if ("1".equals(mtImportCampainReq.getKamp_m_promo_relevant())) {
            savedAngelegteCampaign.setIn_m_promo_angelegt("1");

            if ("0".equals(mtImportCampainReq.getKamp_mabe_only())) {
                savedAngelegteCampaign.setIn_mabe_plan_angelegt("0");
            }else savedAngelegteCampaign.setIn_mabe_plan_angelegt("1");

        /* MPROMO_RELEVANT = 0, deswegen muss MABE_ONLY gesetzt sein. */
        }else{
            savedAngelegteCampaign.setIn_m_promo_angelegt("0");
            savedAngelegteCampaign.setIn_mabe_plan_angelegt("1");
             }

        savedAngelegteCampaign.setKamp_kampagnenzeitraum_von(mtImportCampainReq.getStart());
        savedAngelegteCampaign.setKamp_kampagnenzeitraum_bis(mtImportCampainReq.getEnde());
        savedAngelegteCampaign.setKamp_m_promo_relevant(mtImportCampainReq.getKamp_m_promo_relevant());
        savedAngelegteCampaign.setMpromo_erfassergruppe(mtImportCampainReq.getErfassergruppe());
        savedAngelegteCampaign.setMpromo_kamppl("");

        List<Organisationen> jpaOrganisationen = mtImportCampainReq.getOrganisationen();
        StringBuilder allOrg = new StringBuilder();
        for (Organisationen element : jpaOrganisationen) {
            allOrg.append(element.getOrganisation());
        }
        savedAngelegteCampaign.setMpromo_organisation(allOrg.toString());

        savedAngelegteCampaign.setMpromo_planumsatz(mtImportCampainReq.getMpromo_planumsatz());
        savedAngelegteCampaign.setMpromo_planungstart("");
        savedAngelegteCampaign.setMpromo_typ(mtImportCampainReq.getKampagnentyp());

        List<Zuordnungsbereiche> jpaZuordnungsbereiche = mtImportCampainReq.getZuordnungsbereiche();
        StringBuilder allZuordnungsbereiche = new StringBuilder();
        for (Zuordnungsbereiche element : jpaZuordnungsbereiche) {
            allZuordnungsbereiche.append(element.getGM());
        }
        savedAngelegteCampaign.setMpromo_zuordnung(allZuordnungsbereiche.toString());

        savedAngelegteCampaign.setStatus_kampagne("");
        savedAngelegteCampaign.setErfassungsdatum();
        savedAngelegteCampaign.setKamp_mabe_only(mtImportCampainReq.getMABEOnly());

        List<Marken> jpaMarken = mtImportCampainReq.getMarken();
        StringBuilder allMarken = new StringBuilder();
        for (Marken element : jpaMarken) {
            allMarken.append(element.getMarke());
        }
        savedAngelegteCampaign.setMpromo_marke(allMarken.toString());

        List<Label> jpaLabel = mtImportCampainReq.getLabel();
        StringBuilder allLabel = new StringBuilder();
        for (Label element : jpaLabel) {
            allLabel.append(element.getLabel());
        }
        savedAngelegteCampaign.setMpromo_label(allLabel.toString());

        List<Kundengruppen> jpaKundengruppen = mtImportCampainReq.getKundengruppen();
        StringBuilder allKundengruppen = new StringBuilder();
        for (Kundengruppen element : jpaKundengruppen) {
            allKundengruppen.append(element.getKundengruppe());
        }
        savedAngelegteCampaign.setMpromo_kundengruppe(allKundengruppen.toString());

        List<Profilierungssortimente> jpaProfilierungssortimente = mtImportCampainReq.getProfilierungssortimente();
        StringBuilder allProfilierungssortimente = new StringBuilder();
        for (Profilierungssortimente element : jpaProfilierungssortimente) {
            allProfilierungssortimente.append(element.getProfilierungssortiment());
        }
        savedAngelegteCampaign.setMpromo_prof_sortiment(allProfilierungssortimente.toString());

        List<Industrien> jpaIndustrien = mtImportCampainReq.getIndustrien();
        StringBuilder allIndustrien = new StringBuilder();
        for (Industrien element : jpaIndustrien) {
            allIndustrien.append(element.getIndustrie());
        }
        savedAngelegteCampaign.setMpromo_industrie(allIndustrien.toString());
        savedAngelegteCampaign.setKamp_kampagnenprio("");

        savedAngelegteCampaign.setKamp_verantwortlich_ci(mtImportCampainReq.getProjektleiter());
        savedAngelegteCampaign.setKamp_verantwortlich_cu(mtImportCampainReq.getProjektleiter());
        savedAngelegteCampaign.setKamp_verantwortlich_fam(mtImportCampainReq.getProjektleiter());
        savedAngelegteCampaign.setMpromo_return_text(mpromo_return_text);
        savedAngelegteCampaign.setMpromo_return_code(mpromo_return_code);

        //Damit das 1 zu 1 Beziehung zwischen mtImportCampainReq und savedAngelegteCampaign gebildet wird
        mtImportCampainReq.setMpromoKampagne(savedAngelegteCampaign);

        return campainImMPRepository.save(savedAngelegteCampaign);

    }

    public void deleteAngelegteCampain(Long id) {
        campainImMPRepository.deleteById(id);
    }

    public Optional<InMPromoAngelegteKampagnen> retrieveAngelegteCampain(Long id) {

        return campainImMPRepository.findById(id);
    }


}