package com.rest.webservices.restfulwebservices.jpa;

import com.rest.webservices.restfulwebservices.campain.MTImportCampainReq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampainRepository extends JpaRepository<MTImportCampainReq, Integer>{

}
