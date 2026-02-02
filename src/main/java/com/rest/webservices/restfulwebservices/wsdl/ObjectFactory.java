
package com.rest.webservices.restfulwebservices.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rest.webservices.restfulwebservices.wsdl package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _MTImportCampaignRes_QNAME = new QName("http://sas.com/customerintelligence", "MT_ImportCampaign_Res");
    private static final QName _MTImportCampaignReq_QNAME = new QName("http://sas.com/customerintelligence", "MT_ImportCampaign_Req");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rest.webservices.restfulwebservices.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTImportCampaignReq }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignReq }
     */
    public DTImportCampaignReq createDTImportCampaignReq() {
        return new DTImportCampaignReq();
    }

    /**
     * Create an instance of {@link DTImportCampaignRes }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignRes }
     */
    public DTImportCampaignRes createDTImportCampaignRes() {
        return new DTImportCampaignRes();
    }

    /**
     * Create an instance of {@link DTBezeichnung }
     * 
     * @return
     *     the new instance of {@link DTBezeichnung }
     */
    public DTBezeichnung createDTBezeichnung() {
        return new DTBezeichnung();
    }

    /**
     * Create an instance of {@link DTImportCampaignReq.Zuordnungsbereiche }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignReq.Zuordnungsbereiche }
     */
    public DTImportCampaignReq.Zuordnungsbereiche createDTImportCampaignReqZuordnungsbereiche() {
        return new DTImportCampaignReq.Zuordnungsbereiche();
    }

    /**
     * Create an instance of {@link DTImportCampaignReq.Organisationen }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignReq.Organisationen }
     */
    public DTImportCampaignReq.Organisationen createDTImportCampaignReqOrganisationen() {
        return new DTImportCampaignReq.Organisationen();
    }

    /**
     * Create an instance of {@link DTImportCampaignReq.Industrien }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignReq.Industrien }
     */
    public DTImportCampaignReq.Industrien createDTImportCampaignReqIndustrien() {
        return new DTImportCampaignReq.Industrien();
    }

    /**
     * Create an instance of {@link DTImportCampaignReq.Marken }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignReq.Marken }
     */
    public DTImportCampaignReq.Marken createDTImportCampaignReqMarken() {
        return new DTImportCampaignReq.Marken();
    }

    /**
     * Create an instance of {@link DTImportCampaignReq.Label }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignReq.Label }
     */
    public DTImportCampaignReq.Label createDTImportCampaignReqLabel() {
        return new DTImportCampaignReq.Label();
    }

    /**
     * Create an instance of {@link DTImportCampaignReq.Kundengruppen }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignReq.Kundengruppen }
     */
    public DTImportCampaignReq.Kundengruppen createDTImportCampaignReqKundengruppen() {
        return new DTImportCampaignReq.Kundengruppen();
    }

    /**
     * Create an instance of {@link DTImportCampaignReq.Profilierungssortimente }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignReq.Profilierungssortimente }
     */
    public DTImportCampaignReq.Profilierungssortimente createDTImportCampaignReqProfilierungssortimente() {
        return new DTImportCampaignReq.Profilierungssortimente();
    }

    /**
     * Create an instance of {@link DTImportCampaignRes.Message }
     * 
     * @return
     *     the new instance of {@link DTImportCampaignRes.Message }
     */
    public DTImportCampaignRes.Message createDTImportCampaignResMessage() {
        return new DTImportCampaignRes.Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTImportCampaignRes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTImportCampaignRes }{@code >}
     */
    @XmlElementDecl(namespace = "http://sas.com/customerintelligence", name = "MT_ImportCampaign_Res")
    public JAXBElement<DTImportCampaignRes> createMTImportCampaignRes(DTImportCampaignRes value) {
        return new JAXBElement<>(_MTImportCampaignRes_QNAME, DTImportCampaignRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTImportCampaignReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTImportCampaignReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://sas.com/customerintelligence", name = "MT_ImportCampaign_Req")
    public JAXBElement<DTImportCampaignReq> createMTImportCampaignReq(DTImportCampaignReq value) {
        return new JAXBElement<>(_MTImportCampaignReq_QNAME, DTImportCampaignReq.class, null, value);
    }

}
