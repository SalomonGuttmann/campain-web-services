package com.rest.webservices.restfulwebservices.campain;


import com.rest.webservices.restfulwebservices.soap.CampainRes;
import com.rest.webservices.restfulwebservices.soap.GetCampainRequest;
import com.rest.webservices.restfulwebservices.soap.GetCampainResponse;


import org.springframework.util.Assert;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.HashMap;
import java.util.Map;

@Endpoint
public class CampainEndpoint {

    private static final String NAMESPACE_URI = "https://soap.restfulwebservices.webservices.rest.com";

    private static final Map<String, CampainRes> res_campains = new HashMap<>();

    /*Damit das SOAP RES simulliert werden kann*/
    static {
        CampainRes campain_1 = new CampainRes();

        campain_1.setQuellSystem(2);
        campain_1.setTransaktionsID(001);
        campain_1.setExtKampagnenid("KAMP_40355");

        CampainRes.Message campain_1_message = new CampainRes.Message();

        campain_1_message.setType("S");
        campain_1_message.setText("Massnahme 38495 wurde erfolgreich aus KMS angelegt.");
        campain_1.setMessage(campain_1_message);

        res_campains.put(campain_1.getExtKampagnenid(), campain_1);

    }

    public CampainRes findCampain(String name) {
        Assert.notNull(name, "The campain's name must not be null");
        return res_campains.get(name);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCampainRequest")
    @ResponsePayload
    public GetCampainResponse getCampain(@RequestPayload GetCampainRequest request) {

        GetCampainResponse response = new GetCampainResponse();

        response.setCampainRes(findCampain(request.getExtKampagnenid()));

        if (request.getExtKampagnenid().equals(response.getCampainRes().getExtKampagnenid())) {
            System.out.println("Massnahme konnte erfolgreich in M-PROMO angelegt werden");
        } else
            System.out.println("Massnahme konnte nicht erfolgreich in M-PROMO angelegt werden");

        return response;
    }

}