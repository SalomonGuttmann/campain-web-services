package com.rest.webservices.restfulwebservices.campain;

import com.rest.webservices.restfulwebservices.jpa.CampainRepository;
import com.rest.webservices.restfulwebservices.writexmlrq.GetCampaignSoapRequestBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
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

        stringToDom(getCampaignSoapRequestBuilder.generateXml(mtImportCampainReq));

        /**CURL vorbereiten und starten um SOAP REQ/RES an M-PROMO zu simulieren*/
        try {
            String command =
                    "curl --header \"Content-Type: text/xml\" -d @request.xml http://localhost:8080/services";

            ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
            processBuilder.directory(new File("testSOAP/"));

            Process process = processBuilder.start();

            InputStream inputStream = process.getInputStream();

            for (int i = 0; i < inputStream.available(); i++) {
                System.out.println("" + inputStream.read());
            }

            Thread.sleep(10000);
            process.destroy();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /***********************CURL ende********************************************************/

        return ResponseEntity.created(location).build();
    }

    public static void stringToDom(String xmlSource)
            throws IOException {
        java.io.FileWriter fw = new java.io.FileWriter("testSOAP/request.xml");
        fw.write(xmlSource);
        fw.close();
    }
}