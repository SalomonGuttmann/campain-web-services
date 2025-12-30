package com.rest.webservices.restfulwebservices.writexmlrq;

import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

import com.rest.webservices.restfulwebservices.campain.MTImportCampainReq;


@Component
public class GetCampaignSoapRequestBuilder {

    private static final String SOAPENV_NS = "http://schemas.xmlsoap.org/soap/envelope/";
    private static final String GS_NS = "https://soap.restfulwebservices.webservices.rest.com";

    private MTImportCampainReq mtImportCampainReq;


    public String generateXml(MTImportCampainReq mtImportCampainReq) throws Exception {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            // Envelope
            Element envelope = doc.createElementNS(SOAPENV_NS, "soapenv:Envelope");
            envelope.setAttribute("xmlns:soapenv", SOAPENV_NS);
            envelope.setAttribute("xmlns:gs", GS_NS);
            doc.appendChild(envelope);

            // Header
            Element header = doc.createElementNS(SOAPENV_NS, "soapenv:Header");
            envelope.appendChild(header);

            // Body
            Element body = doc.createElementNS(SOAPENV_NS, "soapenv:Body");
            envelope.appendChild(body);

            // getCampainRequest
            Element request = doc.createElementNS(GS_NS, "gs:getCampainRequest");
            body.appendChild(request);


            appendText(doc, request, "gs:QuellSystem", String.valueOf(mtImportCampainReq.getQuell_system()));
            appendText(doc, request, "gs:TransaktionsID", String.valueOf(mtImportCampainReq.getTransaktionsID()));
            appendText(doc, request, "gs:ExtKampagnenid", String.valueOf(mtImportCampainReq.getExt_kampagnenid()));
            appendText(doc, request, "gs:Kampagnentyp", String.valueOf(mtImportCampainReq.getKampagnentyp()));
            appendText(doc, request, "gs:Start", String.valueOf(mtImportCampainReq.getStart()));
            appendText(doc, request, "gs:Ende", String.valueOf(mtImportCampainReq.getEnde()));
            appendText(doc, request, "gs:MABEOnly", String.valueOf(mtImportCampainReq.getmABEOnly()));

            // KampagneName
            Element kampagneName = doc.createElementNS(GS_NS, "gs:KampagneName");
            request.appendChild(kampagneName);
            appendText(doc, kampagneName, "gs:Bezeichnung", String.valueOf(mtImportCampainReq.getKampagnename()));
            appendText(doc, kampagneName, "gs:Sprache", String.valueOf(mtImportCampainReq.getKampagnesprache()));

            // Beschreibung
            Element beschreibung = doc.createElementNS(GS_NS, "gs:Beschreibung");
            request.appendChild(beschreibung);
            appendText(doc, beschreibung, "gs:Bezeichnung", String.valueOf(mtImportCampainReq.getBezeichnung()));
            appendText(doc, beschreibung, "gs:Sprache", String.valueOf(mtImportCampainReq.getBezeichnungsprache()));

            appendText(doc, request, "gs:Erfassergruppe", String.valueOf(mtImportCampainReq.getErfassergruppe()));
            appendText(doc, request, "gs:Projektleiter", String.valueOf(mtImportCampainReq.getProjektleiter()));
            appendText(doc, request, "gs:Planumsatz", String.valueOf(mtImportCampainReq.getPlanumsatz()));
            appendText(doc, request, "gs:Update", String.valueOf(mtImportCampainReq.getUpdate()));

            // Zuordnungsbereiche
            Element zuordnungsbereiche = doc.createElementNS(GS_NS, "gs:Zuordnungsbereiche");
            request.appendChild(zuordnungsbereiche);
            appendText(doc, zuordnungsbereiche, "gs:GM", String.valueOf(mtImportCampainReq.getgM()));

            // Organisationen
            Element organisationen = doc.createElementNS(GS_NS, "gs:Organisationen");
            request.appendChild(organisationen);

            String allorgs = mtImportCampainReq.getOrganisation();

            String allorgsArray[] = allorgs.split(" ");

            for (int i = 0; i < allorgsArray.length; i++) {
                appendText(doc, organisationen, "gs:Organisation", allorgsArray[i]);
            }

            // Industrien
            Element industrien = doc.createElementNS(GS_NS, "gs:Industrien");
            request.appendChild(industrien);
            appendText(doc, industrien, "gs:Industrie", String.valueOf(mtImportCampainReq.getIndustrie()));

            // Marken
            Element marken = doc.createElementNS(GS_NS, "gs:Marken");
            request.appendChild(marken);
            appendText(doc, marken, "gs:Marke", String.valueOf(mtImportCampainReq.getMarke()));

            // Label
            Element label = doc.createElementNS(GS_NS, "gs:Label");
            request.appendChild(label);
            appendText(doc, label, "gs:Label", String.valueOf(mtImportCampainReq.getLabel()));

            // Kundengruppen
            Element kundengruppen = doc.createElementNS(GS_NS, "gs:Kundengruppen");
            request.appendChild(kundengruppen);
            appendText(doc, kundengruppen, "gs:Kundengruppe", String.valueOf(mtImportCampainReq.getKundengruppe()));

            // Profilierungssortimente
            Element profilierung = doc.createElementNS(GS_NS, "gs:Profilierungssortimente");
            request.appendChild(profilierung);
            appendText(doc, profilierung, "gs:Profilierungssortiment", String.valueOf(mtImportCampainReq.getProfilierungssortiment()));

            // Transform to String
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            StringWriter writer = new StringWriter();
            transformer.transform(new DOMSource(doc), new StreamResult(writer));
            return writer.toString();

        } catch (
                Exception e) {
            throw new IllegalStateException("Failed to generate SOAP XML", e);
        }
    }


    private void appendText(Document doc, Element parent, String qName, String value) {
        Element element = doc.createElementNS(GS_NS, qName);
        element.setTextContent(value);
        parent.appendChild(element);
    }
}