package com.rest.webservices.restfulwebservices.campain;


import com.rest.webservices.restfulwebservices.soap.Campain;
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

    // das https entprich die in countryWs.wsd targetNamespace
    private static final String NAMESPACE_URI = "https://soap.restfulwebservices.webservices.rest.com";

    private static final Map<String, Campain> campains = new HashMap<>();

    static {
        Campain campain_1 = new Campain();

        campain_1.setKampagnename("Salomon");

        campains.put(campain_1.getKampagnename(), campain_1);

    }

    public Campain findCampain(String name) {
        Assert.notNull(name, "The campain's name must not be null");
        return campains.get(name);
    }

    /*
     * Im SOAP Request file @request.xml wird getCountryRequest Methode mit einen Parameter "Spain"
     * gerufen. Das ist das EndPoint welche mit getCountry(@RequestPayload GetCountryRequest request) gemappt ist bzw.
     * diese Methode getCountry(...) macht einen Request
     * mit einen Parameter Objekt GetCountryRequest und gibt einen GetCountryResponse Objekt zurück.
     * Damit das Country zurück gegeben kann musst das country in Object countryRepository gesucht werden.
     * Danach wirt implizit GetCountryResponse.getCountry() gerufen damit das Country zurück geliefert wird.
     * Country Objekt liefert dann Name, population, capital, currency..
     * */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCampainRequest")
    @ResponsePayload
    public GetCampainResponse getCountry(@RequestPayload GetCampainRequest request) {
        GetCampainResponse response = new GetCampainResponse();
        response.setCampain(findCampain(request.getName()));

        return response;
    }

}
