package com.rest.webservices.restfulwebservices.campain;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import com.rest.webservices.restfulwebservices.jpa.CampainRepository;
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
public class CampainJpaResource {

    private CampainRepository campainRepository;

    public CampainJpaResource(CampainRepository campainRepository)
    {
        this.campainRepository = campainRepository;
    }

    @GetMapping("/jpa/campains")
    public List<MTImportCampainReq> retrieveAllCampains() {

        return campainRepository.findAll();
    }

    @GetMapping("/jpa/campains/{id}")
    public EntityModel<MTImportCampainReq>  retrieveCampain(@PathVariable int id) {

        Optional<MTImportCampainReq> mtImportCampainReq = campainRepository.findById(id);

        if (mtImportCampainReq == null) {
            throw new CanpainNotFoundException("id:" + id);
        }
        //return mtImportCampainReq;
        //wrapping the user class
        EntityModel<MTImportCampainReq> entityModel = EntityModel.of(mtImportCampainReq.get());
        //crate a link
        WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).retrieveAllCampains());
        //add the link
        entityModel.add(link.withRel("all-canpains"));

        return entityModel;
    }

    @DeleteMapping("/jpa/campains/{id}")
    public void deleteCampain(@PathVariable int id) {
        campainRepository.deleteById(id);
    }

    @PostMapping("/jpa/campains")
    public ResponseEntity<MTImportCampainReq> createCampain(@Valid @RequestBody MTImportCampainReq mtImportCampainReq) {
        MTImportCampainReq savedCampain=campainRepository.save(mtImportCampainReq);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedCampain.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
