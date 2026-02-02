package com.rest.webservices.restfulwebservices;

import com.rest.webservices.restfulwebservices.campain.SIOSCampaignClient;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles("test")
class RestfulWebServicesApplicationTests {

	@MockBean
	private SIOSCampaignClient sioscampaignClient;

	@Test
	void contextLoads() {
	}

}
