package com.rest.webservices.restfulwebservices.campain;

import com.rest.webservices.restfulwebservices.utilities.TlsConfigurer;
import com.rest.webservices.restfulwebservices.wsdl.*;
import jakarta.xml.ws.BindingProvider;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.List;
import java.util.Map;

@Component
@Profile("!test")
public class SIOSCampaignClient {

    private static final  QName SERVICE_NAME = new QName("http://sas.com/customerintelligence", "SI_OS_CampaignService");
    private static final URL wsdlURL = SIOSCampaignService.WSDL_LOCATION;
    private final SIOSCampaignService ss;
    private final SIOSCampaign port;

    private static final Logger LOG = LoggerFactory.getLogger(SIOSCampaignClient.class);



    public SIOSCampaignClient() {

        TlsConfigurer.setupTruststore();
        this.ss = new SIOSCampaignService(wsdlURL, SERVICE_NAME);
        this.port = this.ss.getSIOSCampaignPort();

        Client client = ClientProxy.getClient(port);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());

        BindingProvider bp = (BindingProvider) port;
        Map<String, Object> ctx = bp.getRequestContext();

        ctx.put(BindingProvider.USERNAME_PROPERTY, "HTTP_KMS");
        ctx.put(BindingProvider.PASSWORD_PROPERTY, "2020KMSmaaPiojo");

    }

    public DTImportCampaignRes sendSIOSCampaignReq(MPImportCampaignReq importCampaignReq) {

        LOG.info("Invoking siOSCampaign...");

        DTImportCampaignReq _siOSCampaign_mtImportCampaignReq = new DTImportCampaignReq();

        _siOSCampaign_mtImportCampaignReq.setQuellSystem(importCampaignReq.getQuellSystem());

        _siOSCampaign_mtImportCampaignReq.setTransaktionsID(importCampaignReq.getTransaktionsID());
        _siOSCampaign_mtImportCampaignReq.setExtKampagnenID(importCampaignReq.getExtKampagnenId());
        _siOSCampaign_mtImportCampaignReq.setKampagnentyp(importCampaignReq.getKampagnentyp());
        _siOSCampaign_mtImportCampaignReq.setStart(importCampaignReq.getStart());
        _siOSCampaign_mtImportCampaignReq.setEnde(importCampaignReq.getEnde());
        _siOSCampaign_mtImportCampaignReq.setMABEOnly(importCampaignReq.getMABEOnly());

        DTBezeichnung kampagneName = new DTBezeichnung();
        List<Bezeichnung> jpaKampagneName = importCampaignReq.getKampagneName();

        for (Bezeichnung element : jpaKampagneName) {
            kampagneName.setBezeichnung(element.getBezeichnung());
            kampagneName.setSprache(element.getSprache());
        }

        _siOSCampaign_mtImportCampaignReq.getKampagneName().add(kampagneName);


        DTBezeichnung beschreibung = new DTBezeichnung();

        List<Bezeichnung> jpaKampagneBeschreibung = importCampaignReq.getBeschreibung();

        for (Bezeichnung element : jpaKampagneBeschreibung) {
            beschreibung.setBezeichnung(element.getBezeichnung());
            beschreibung.setSprache(element.getSprache());
        }

        _siOSCampaign_mtImportCampaignReq.getBeschreibung().add(beschreibung);

        _siOSCampaign_mtImportCampaignReq.setErfassergruppe(importCampaignReq.getErfassergruppe());
        _siOSCampaign_mtImportCampaignReq.setProjektleiter(importCampaignReq.getProjektleiter());
        _siOSCampaign_mtImportCampaignReq.setPlanumsatz(importCampaignReq.getPlanumsatz());
        _siOSCampaign_mtImportCampaignReq.setUpdate(importCampaignReq.getUpdate());


        DTImportCampaignReq.Zuordnungsbereiche zuordnungsbereiche = new DTImportCampaignReq.Zuordnungsbereiche();
        List<Zuordnungsbereiche> jpaZuordnungsbereiche = importCampaignReq.getZuordnungsbereiche();

        for (Zuordnungsbereiche element : jpaZuordnungsbereiche) {
            zuordnungsbereiche.getGM().add(element.getGM());
        }
        _siOSCampaign_mtImportCampaignReq.setZuordnungsbereiche(zuordnungsbereiche);

        DTImportCampaignReq.Organisationen organisationen = new DTImportCampaignReq.Organisationen();
        List<Organisationen> jpaOrganisationen = importCampaignReq.getOrganisationen();

        for (Organisationen element : jpaOrganisationen) {
            organisationen.getOrganisation().add(element.getOrganisation());
        }
        _siOSCampaign_mtImportCampaignReq.setOrganisationen(organisationen);


        DTImportCampaignReq.Industrien industrien = new DTImportCampaignReq.Industrien();
        List<Industrien> jpaIndustrien = importCampaignReq.getIndustrien();

        for (Industrien element : jpaIndustrien) {
            industrien.getIndustrie().add(element.getIndustrie());
        }
        _siOSCampaign_mtImportCampaignReq.setIndustrien(industrien);

        DTImportCampaignReq.Marken marken = new DTImportCampaignReq.Marken();
        List<Marken> jpaMarken = importCampaignReq.getMarken();

        for (Marken element : jpaMarken) {
            marken.getMarke().add(element.getMarke());
        }
        _siOSCampaign_mtImportCampaignReq.setMarken(marken);

        DTImportCampaignReq.Label label = new DTImportCampaignReq.Label();
        List<Label> jpaLabel = importCampaignReq.getLabel();

        for (Label element : jpaLabel) {
            label.getLabel().add(element.getLabel());
        }
        _siOSCampaign_mtImportCampaignReq.setLabel(label);

        DTImportCampaignReq.Kundengruppen kundengruppen = new DTImportCampaignReq.Kundengruppen();
        List<Kundengruppen> jpaKundengruppen = importCampaignReq.getKundengruppen();

        for (Kundengruppen element : jpaKundengruppen) {
            kundengruppen.getKundengruppe().add(element.getKundengruppe());
        }
        _siOSCampaign_mtImportCampaignReq.setKundengruppen(kundengruppen);

        DTImportCampaignReq.Profilierungssortimente profilierungssortimente = new DTImportCampaignReq.Profilierungssortimente();
        List<Profilierungssortimente> jpaProfilierungssortimente = importCampaignReq.getProfilierungssortimente();

        for (Profilierungssortimente element : jpaProfilierungssortimente) {
            profilierungssortimente.getProfilierungssortiment().add(element.getProfilierungssortiment());
        }
        _siOSCampaign_mtImportCampaignReq.setProfilierungssortimente(profilierungssortimente);

        com.rest.webservices.restfulwebservices.wsdl.DTImportCampaignRes _siOSCampaign__return = this.port.siOSCampaign(_siOSCampaign_mtImportCampaignReq);

        LOG.info("siOSCampaign.result=" + _siOSCampaign__return);

        return _siOSCampaign__return;
    }
}
