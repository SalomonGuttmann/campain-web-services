package com.rest.webservices.restfulwebservices.campain;

import com.rest.webservices.restfulwebservices.jpa.CampainRepository;
import com.rest.webservices.restfulwebservices.writexmlrq.GetCampaignSoapRequestBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
public class CampainJpaResource {

    private CampainRepository campainRepository;
    private GetCampaignSoapRequestBuilder getCampaignSoapRequestBuilder;

    public CampainJpaResource(CampainRepository campainRepository, GetCampaignSoapRequestBuilder getCampaignSoapRequestBuilder) {
        this.campainRepository = campainRepository;
        this.getCampaignSoapRequestBuilder = getCampaignSoapRequestBuilder;
    }

    @GetMapping("/jpa/campains")
    public List<MTImportCampainReq> retrieveAllCampains() {

        return campainRepository.findAll();
    }

    @GetMapping("/jpa/campains/{id}")
    public EntityModel<MTImportCampainReq> retrieveCampain(@PathVariable int id) {

        Optional<MTImportCampainReq> mtImportCampainReq = campainRepository.findById(id);

        if (mtImportCampainReq == null) {
            throw new CanpainNotFoundException("id:" + id);
        }
        //return mtImportCampainReq;
        //wrapping the user class
        EntityModel<MTImportCampainReq> entityModel = EntityModel.of(mtImportCampainReq.get());
        //crate a link
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllCampains());
        //add the link
        entityModel.add(link.withRel("all-canpains"));

        return entityModel;
    }

    @DeleteMapping("/jpa/campains/{id}")
    public void deleteCampain(@PathVariable int id) {
        campainRepository.deleteById(id);
    }

    @PostMapping("/jpa/campains")
    public ResponseEntity<MTImportCampainReq> createCampain(@Valid @RequestBody MTImportCampainReq mtImportCampainReq) throws Exception {
        MTImportCampainReq savedCampain = campainRepository.save(mtImportCampainReq);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedCampain.getId())
                .toUri();

        // Generate the SOAP request payload
        String xmlPayload = getCampaignSoapRequestBuilder.generateXml(mtImportCampainReq);

        // Speichern der Datei (falls für Debugging noch benötigt)
        saveXmlToFile(xmlPayload);

        /** SOAP REQ/RES an M-PROMO simulieren mittels RestTemplate statt CURL */
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.TEXT_XML);

            HttpEntity<String> request = new HttpEntity<>(xmlPayload, headers);

            // Sende den SOAP Request an den lokalen Endpoint
            String response = restTemplate.postForObject("http://localhost:8080/services", request, String.class);

            System.out.println("SOAP Response erhalten: " + response);

        } catch (Exception ex) {
            System.err.println("Fehler beim Senden des SOAP Requests: " + ex.getMessage());
            ex.printStackTrace();
        }

        return ResponseEntity.created(location).build();
    }

    public static void saveXmlToFile(String xmlSource)
            throws IOException {
        java.io.FileWriter fw = new java.io.FileWriter("MPromoREQ/request.xml");
        fw.write(xmlSource);
        fw.close();
    }
}