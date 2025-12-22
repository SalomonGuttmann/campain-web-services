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
        campain_1.setQuellSystem( (byte) 2);
        campain_1.setTransaktionsID((byte) 001);
        campain_1.setExtKampagnenid("KAMP_40351");
        campain_1.setKampagnentyp("CDM");
        campain_1.setStart(20260205);
        campain_1.setEnde(20260307);
        campain_1.setMABEOnly((byte) 1);

        Campain.KampagneName kampagneName_01 = new Campain.KampagneName();
        kampagneName_01.setBezeichnung("260200-PEMA Migusto NL");
        kampagneName_01.setSprache("D");
        campain_1.setKampagneName(kampagneName_01);

        Campain.Beschreibung beschreibung_01 = new Campain.Beschreibung();
        beschreibung_01.setBezeichnung("Migusto NL");
        beschreibung_01.setSprache("D");
        campain_1.setBeschreibung(beschreibung_01);

        campain_1.setErfassergruppe("MGB");
        campain_1.setProjektleiter("salomonguttmann@gmail.com");
        campain_1.setPlanumsatz("");
        campain_1.setUpdate((byte) 0);

        Campain.Zuordnungsbereiche zuordnungsbereiche_01 = new Campain.Zuordnungsbereiche();
        zuordnungsbereiche_01.setGM("MGB");
        campain_1.setZuordnungsbereiche(zuordnungsbereiche_01);

        Campain.Organisationen organisationen = new Campain.Organisationen();
        organisationen.getOrganisation().add((byte) 02);
        organisationen.getOrganisation().add((byte) 03);
        //organisationen.getOrganisation().add((byte) 09);
        organisationen.getOrganisation().add((byte) 99);
        campain_1.setOrganisationen(organisationen);

        Campain.Industrien industrien = new Campain.Industrien();
        industrien.setIndustrie("");
        campain_1.setIndustrien(industrien);

        Campain.Marken marken = new Campain.Marken();
        marken.setMarke("");
        campain_1.setMarken(marken);

        Campain.Label label = new Campain.Label();
        label.setLabel("");
        campain_1.setLabel(label);

        Campain.Kundengruppen kundengruppen = new Campain.Kundengruppen();
        kundengruppen.setKundengruppe("");
        campain_1.setKundengruppen(kundengruppen);

        Campain.Profilierungssortimente profilierungssortimente = new Campain.Profilierungssortimente();
        profilierungssortimente.setProfilierungssortiment("");
        campain_1.setProfilierungssortimente(profilierungssortimente);


        campains.put(campain_1.getKampagneName().getBezeichnung(), campain_1);

    }

    public Campain findCampain(String name) {
        Assert.notNull(name, "The campain's name must not be null");
        return campains.get(name);
    }

    /*
     * Im SOAP Request file @request.xml wird getCampainRequest Methode mit einen Parameter "name: 260200-PEMA Migusto NL"
     * gerufen. Das ist das EndPoint welche mit getCampain(@RequestPayload GetCountryRequest request) gemappt ist bzw.
     * diese Methode getCampain(...) macht einen Request
     * mit einen Parameter Objekt GetCampainRequest und gibt einen GetCampainResponse Objekt zurück.
     * Damit  Campain zurück gegeben kann musst das campain gesucht werden.
     * Danach wirt implizit GetCampainResponse.getCampain() gerufen damit das Campain zurück geliefert wird.
     * Campain Objekt liefert dann
     *
     * SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
        <SOAP-ENV:Header/>
        <SOAP-ENV:Body><ns2:getCampainResponse xmlns:ns2="https:soap.restfulwebservices.webservices.rest.com">

        <ns2:campain>
            <ns2:id>0</ns2:id>
            <ns2:Update>0</ns2:Update>
            <ns2:KampagneName>
                <ns2:Bezeichnung>260200-PEMA Migusto NL</ns2:Bezeichnung>
                <ns2:Sprache>D</ns2:Sprache>
            </ns2:KampagneName>
                <ns2:Beschreibung>
                    <ns2:Bezeichnung>Migusto NL</ns2:Bezeichnung>
                <ns2:Sprache>D</ns2:Sprache>
                </ns2:Beschreibung>
            <ns2:quell_system>0</ns2:quell_system>
            <ns2:TransaktionsID>0</ns2:TransaktionsID>
            <ns2:Start>0</ns2:Start>
            <ns2:Ende>0</ns2:Ende>
            <ns2:MABEOnly>0</ns2:MABEOnly>
        </ns2:campain>
        </ns2:getCampainResponse>
        </SOAP-ENV:Body>
        </SOAP-ENV:Envelope>
        *
        * Ich muss Campain REQ/RES damit Response so erschein
        *
        *
   <xs:schema attributeFormDefault="unqualified" elementFormDefault="qualified" xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="QuellSystem" type="xs:byte"/>
  <xs:element name="TransaktionsID" type="xs:byte"/>
  <xs:element name="ExtKampagnenID" type="xs:string"/>
  <xs:element name="Message">
    <xs:complexType>
      <xs:sequence>
        <xs:element type="xs:string" name="Type"/>
        <xs:element type="xs:string" name="Text"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>
     * */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCampainRequest")
    @ResponsePayload
    public GetCampainResponse getCampain(@RequestPayload GetCampainRequest request) {
        GetCampainResponse response = new GetCampainResponse();
        response.setCampain(findCampain(request.getName()));

        return response;
    }

}
