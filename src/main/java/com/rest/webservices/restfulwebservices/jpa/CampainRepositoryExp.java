package com.rest.webservices.restfulwebservices.jpa;

import com.rest.webservices.restfulwebservices.campain.MPImportCampaignReq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampainRepositoryExp extends JpaRepository<MPImportCampaignReq, Long>  {
}
