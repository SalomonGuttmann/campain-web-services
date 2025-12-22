//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.6 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.rest.webservices.restfulwebservices.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für campain complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="campain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="profilierungssortiment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kundengruppe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="marke" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="industrie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="organisation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="update" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="planumsatz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="projektleiter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="erfassergruppe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bezeichnungsprache" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kampagnesprache" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kampagnename" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mABEOnly" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ende" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kampagnentyp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ext_kampagnenid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transaktionsID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quell_system" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "campain", propOrder = {
    "id",
    "profilierungssortiment",
    "kundengruppe",
    "label",
    "marke",
    "industrie",
    "organisation",
    "gm",
    "update",
    "planumsatz",
    "projektleiter",
    "erfassergruppe",
    "bezeichnungsprache",
    "bezeichnung",
    "kampagnesprache",
    "kampagnename",
    "mabeOnly",
    "ende",
    "start",
    "kampagnentyp",
    "extKampagnenid",
    "transaktionsID",
    "quellSystem"
})
public class Campain {

    protected int id;
    @XmlElement(required = true)
    protected String profilierungssortiment;
    @XmlElement(required = true)
    protected String kundengruppe;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String marke;
    @XmlElement(required = true)
    protected String industrie;
    @XmlElement(required = true)
    protected String organisation;
    @XmlElement(name = "gM", required = true)
    protected String gm;
    @XmlElement(required = true)
    protected String update;
    @XmlElement(required = true)
    protected String planumsatz;
    @XmlElement(required = true)
    protected String projektleiter;
    @XmlElement(required = true)
    protected String erfassergruppe;
    @XmlElement(required = true)
    protected String bezeichnungsprache;
    @XmlElement(required = true)
    protected String bezeichnung;
    @XmlElement(required = true)
    protected String kampagnesprache;
    @XmlElement(required = true)
    protected String kampagnename;
    @XmlElement(name = "mABEOnly", required = true)
    protected String mabeOnly;
    @XmlElement(required = true)
    protected String ende;
    @XmlElement(required = true)
    protected String start;
    @XmlElement(required = true)
    protected String kampagnentyp;
    @XmlElement(name = "ext_kampagnenid", required = true)
    protected String extKampagnenid;
    @XmlElement(required = true)
    protected String transaktionsID;
    @XmlElement(name = "quell_system", required = true)
    protected String quellSystem;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der profilierungssortiment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilierungssortiment() {
        return profilierungssortiment;
    }

    /**
     * Legt den Wert der profilierungssortiment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilierungssortiment(String value) {
        this.profilierungssortiment = value;
    }

    /**
     * Ruft den Wert der kundengruppe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKundengruppe() {
        return kundengruppe;
    }

    /**
     * Legt den Wert der kundengruppe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKundengruppe(String value) {
        this.kundengruppe = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der marke-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarke() {
        return marke;
    }

    /**
     * Legt den Wert der marke-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarke(String value) {
        this.marke = value;
    }

    /**
     * Ruft den Wert der industrie-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustrie() {
        return industrie;
    }

    /**
     * Legt den Wert der industrie-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustrie(String value) {
        this.industrie = value;
    }

    /**
     * Ruft den Wert der organisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisation() {
        return organisation;
    }

    /**
     * Legt den Wert der organisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisation(String value) {
        this.organisation = value;
    }

    /**
     * Ruft den Wert der gm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGM() {
        return gm;
    }

    /**
     * Legt den Wert der gm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGM(String value) {
        this.gm = value;
    }

    /**
     * Ruft den Wert der update-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdate() {
        return update;
    }

    /**
     * Legt den Wert der update-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdate(String value) {
        this.update = value;
    }

    /**
     * Ruft den Wert der planumsatz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanumsatz() {
        return planumsatz;
    }

    /**
     * Legt den Wert der planumsatz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanumsatz(String value) {
        this.planumsatz = value;
    }

    /**
     * Ruft den Wert der projektleiter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjektleiter() {
        return projektleiter;
    }

    /**
     * Legt den Wert der projektleiter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjektleiter(String value) {
        this.projektleiter = value;
    }

    /**
     * Ruft den Wert der erfassergruppe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErfassergruppe() {
        return erfassergruppe;
    }

    /**
     * Legt den Wert der erfassergruppe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErfassergruppe(String value) {
        this.erfassergruppe = value;
    }

    /**
     * Ruft den Wert der bezeichnungsprache-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnungsprache() {
        return bezeichnungsprache;
    }

    /**
     * Legt den Wert der bezeichnungsprache-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnungsprache(String value) {
        this.bezeichnungsprache = value;
    }

    /**
     * Ruft den Wert der bezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Legt den Wert der bezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Ruft den Wert der kampagnesprache-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKampagnesprache() {
        return kampagnesprache;
    }

    /**
     * Legt den Wert der kampagnesprache-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKampagnesprache(String value) {
        this.kampagnesprache = value;
    }

    /**
     * Ruft den Wert der kampagnename-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKampagnename() {
        return kampagnename;
    }

    /**
     * Legt den Wert der kampagnename-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKampagnename(String value) {
        this.kampagnename = value;
    }

    /**
     * Ruft den Wert der mabeOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMABEOnly() {
        return mabeOnly;
    }

    /**
     * Legt den Wert der mabeOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMABEOnly(String value) {
        this.mabeOnly = value;
    }

    /**
     * Ruft den Wert der ende-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnde() {
        return ende;
    }

    /**
     * Legt den Wert der ende-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnde(String value) {
        this.ende = value;
    }

    /**
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Ruft den Wert der kampagnentyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKampagnentyp() {
        return kampagnentyp;
    }

    /**
     * Legt den Wert der kampagnentyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKampagnentyp(String value) {
        this.kampagnentyp = value;
    }

    /**
     * Ruft den Wert der extKampagnenid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtKampagnenid() {
        return extKampagnenid;
    }

    /**
     * Legt den Wert der extKampagnenid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtKampagnenid(String value) {
        this.extKampagnenid = value;
    }

    /**
     * Ruft den Wert der transaktionsID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaktionsID() {
        return transaktionsID;
    }

    /**
     * Legt den Wert der transaktionsID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaktionsID(String value) {
        this.transaktionsID = value;
    }

    /**
     * Ruft den Wert der quellSystem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuellSystem() {
        return quellSystem;
    }

    /**
     * Legt den Wert der quellSystem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuellSystem(String value) {
        this.quellSystem = value;
    }

}
