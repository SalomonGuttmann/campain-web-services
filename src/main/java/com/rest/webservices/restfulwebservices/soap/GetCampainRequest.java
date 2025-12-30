//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.6 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.rest.webservices.restfulwebservices.soap;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="QuellSystem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransaktionsID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExtKampagnenid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Kampagnentyp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Ende" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MABEOnly" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="KampagneName"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Sprache" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Beschreibung"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Sprache" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Erfassergruppe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Projektleiter" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Planumsatz" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Update" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Zuordnungsbereiche"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="GM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Organisationen"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Organisation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Industrien"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Industrie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Marken"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Marke" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Label"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kundengruppen"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Kundengruppe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Profilierungssortimente"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Profilierungssortiment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "quellSystem",
    "transaktionsID",
    "extKampagnenid",
    "kampagnentyp",
    "start",
    "ende",
    "mabeOnly",
    "kampagneName",
    "beschreibung",
    "erfassergruppe",
    "projektleiter",
    "planumsatz",
    "update",
    "zuordnungsbereiche",
    "organisationen",
    "industrien",
    "marken",
    "label",
    "kundengruppen",
    "profilierungssortimente"
})
@XmlRootElement(name = "getCampainRequest")
public class GetCampainRequest {

    protected int id;
    @XmlElement(name = "QuellSystem")
    protected int quellSystem;
    @XmlElement(name = "TransaktionsID")
    protected int transaktionsID;
    @XmlElement(name = "ExtKampagnenid", required = true)
    protected String extKampagnenid;
    @XmlElement(name = "Kampagnentyp", required = true)
    protected String kampagnentyp;
    @XmlElement(name = "Start")
    protected int start;
    @XmlElement(name = "Ende")
    protected int ende;
    @XmlElement(name = "MABEOnly")
    protected int mabeOnly;
    @XmlElement(name = "KampagneName", required = true)
    protected GetCampainRequest.KampagneName kampagneName;
    @XmlElement(name = "Beschreibung", required = true)
    protected GetCampainRequest.Beschreibung beschreibung;
    @XmlElement(name = "Erfassergruppe", required = true)
    protected String erfassergruppe;
    @XmlElement(name = "Projektleiter", required = true)
    protected String projektleiter;
    @XmlElement(name = "Planumsatz")
    protected int planumsatz;
    @XmlElement(name = "Update")
    protected int update;
    @XmlElement(name = "Zuordnungsbereiche", required = true)
    protected GetCampainRequest.Zuordnungsbereiche zuordnungsbereiche;
    @XmlElement(name = "Organisationen", required = true)
    protected GetCampainRequest.Organisationen organisationen;
    @XmlElement(name = "Industrien", required = true)
    protected GetCampainRequest.Industrien industrien;
    @XmlElement(name = "Marken", required = true)
    protected GetCampainRequest.Marken marken;
    @XmlElement(name = "Label", required = true)
    protected GetCampainRequest.Label label;
    @XmlElement(name = "Kundengruppen", required = true)
    protected GetCampainRequest.Kundengruppen kundengruppen;
    @XmlElement(name = "Profilierungssortimente", required = true)
    protected GetCampainRequest.Profilierungssortimente profilierungssortimente;

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
     * Ruft den Wert der quellSystem-Eigenschaft ab.
     * 
     */
    public int getQuellSystem() {
        return quellSystem;
    }

    /**
     * Legt den Wert der quellSystem-Eigenschaft fest.
     * 
     */
    public void setQuellSystem(int value) {
        this.quellSystem = value;
    }

    /**
     * Ruft den Wert der transaktionsID-Eigenschaft ab.
     * 
     */
    public int getTransaktionsID() {
        return transaktionsID;
    }

    /**
     * Legt den Wert der transaktionsID-Eigenschaft fest.
     * 
     */
    public void setTransaktionsID(int value) {
        this.transaktionsID = value;
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
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     */
    public void setStart(int value) {
        this.start = value;
    }

    /**
     * Ruft den Wert der ende-Eigenschaft ab.
     * 
     */
    public int getEnde() {
        return ende;
    }

    /**
     * Legt den Wert der ende-Eigenschaft fest.
     * 
     */
    public void setEnde(int value) {
        this.ende = value;
    }

    /**
     * Ruft den Wert der mabeOnly-Eigenschaft ab.
     * 
     */
    public int getMABEOnly() {
        return mabeOnly;
    }

    /**
     * Legt den Wert der mabeOnly-Eigenschaft fest.
     * 
     */
    public void setMABEOnly(int value) {
        this.mabeOnly = value;
    }

    /**
     * Ruft den Wert der kampagneName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetCampainRequest.KampagneName }
     *     
     */
    public GetCampainRequest.KampagneName getKampagneName() {
        return kampagneName;
    }

    /**
     * Legt den Wert der kampagneName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCampainRequest.KampagneName }
     *     
     */
    public void setKampagneName(GetCampainRequest.KampagneName value) {
        this.kampagneName = value;
    }

    /**
     * Ruft den Wert der beschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetCampainRequest.Beschreibung }
     *     
     */
    public GetCampainRequest.Beschreibung getBeschreibung() {
        return beschreibung;
    }

    /**
     * Legt den Wert der beschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCampainRequest.Beschreibung }
     *     
     */
    public void setBeschreibung(GetCampainRequest.Beschreibung value) {
        this.beschreibung = value;
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
     * Ruft den Wert der planumsatz-Eigenschaft ab.
     * 
     */
    public int getPlanumsatz() {
        return planumsatz;
    }

    /**
     * Legt den Wert der planumsatz-Eigenschaft fest.
     * 
     */
    public void setPlanumsatz(int value) {
        this.planumsatz = value;
    }

    /**
     * Ruft den Wert der update-Eigenschaft ab.
     * 
     */
    public int getUpdate() {
        return update;
    }

    /**
     * Legt den Wert der update-Eigenschaft fest.
     * 
     */
    public void setUpdate(int value) {
        this.update = value;
    }

    /**
     * Ruft den Wert der zuordnungsbereiche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetCampainRequest.Zuordnungsbereiche }
     *     
     */
    public GetCampainRequest.Zuordnungsbereiche getZuordnungsbereiche() {
        return zuordnungsbereiche;
    }

    /**
     * Legt den Wert der zuordnungsbereiche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCampainRequest.Zuordnungsbereiche }
     *     
     */
    public void setZuordnungsbereiche(GetCampainRequest.Zuordnungsbereiche value) {
        this.zuordnungsbereiche = value;
    }

    /**
     * Ruft den Wert der organisationen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetCampainRequest.Organisationen }
     *     
     */
    public GetCampainRequest.Organisationen getOrganisationen() {
        return organisationen;
    }

    /**
     * Legt den Wert der organisationen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCampainRequest.Organisationen }
     *     
     */
    public void setOrganisationen(GetCampainRequest.Organisationen value) {
        this.organisationen = value;
    }

    /**
     * Ruft den Wert der industrien-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetCampainRequest.Industrien }
     *     
     */
    public GetCampainRequest.Industrien getIndustrien() {
        return industrien;
    }

    /**
     * Legt den Wert der industrien-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCampainRequest.Industrien }
     *     
     */
    public void setIndustrien(GetCampainRequest.Industrien value) {
        this.industrien = value;
    }

    /**
     * Ruft den Wert der marken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetCampainRequest.Marken }
     *     
     */
    public GetCampainRequest.Marken getMarken() {
        return marken;
    }

    /**
     * Legt den Wert der marken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCampainRequest.Marken }
     *     
     */
    public void setMarken(GetCampainRequest.Marken value) {
        this.marken = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetCampainRequest.Label }
     *     
     */
    public GetCampainRequest.Label getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCampainRequest.Label }
     *     
     */
    public void setLabel(GetCampainRequest.Label value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der kundengruppen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetCampainRequest.Kundengruppen }
     *     
     */
    public GetCampainRequest.Kundengruppen getKundengruppen() {
        return kundengruppen;
    }

    /**
     * Legt den Wert der kundengruppen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCampainRequest.Kundengruppen }
     *     
     */
    public void setKundengruppen(GetCampainRequest.Kundengruppen value) {
        this.kundengruppen = value;
    }

    /**
     * Ruft den Wert der profilierungssortimente-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetCampainRequest.Profilierungssortimente }
     *     
     */
    public GetCampainRequest.Profilierungssortimente getProfilierungssortimente() {
        return profilierungssortimente;
    }

    /**
     * Legt den Wert der profilierungssortimente-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCampainRequest.Profilierungssortimente }
     *     
     */
    public void setProfilierungssortimente(GetCampainRequest.Profilierungssortimente value) {
        this.profilierungssortimente = value;
    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Sprache" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bezeichnung",
        "sprache"
    })
    public static class Beschreibung {

        @XmlElement(name = "Bezeichnung", required = true)
        protected String bezeichnung;
        @XmlElement(name = "Sprache", required = true)
        protected String sprache;

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
         * Ruft den Wert der sprache-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSprache() {
            return sprache;
        }

        /**
         * Legt den Wert der sprache-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSprache(String value) {
            this.sprache = value;
        }

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Industrie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "industrie"
    })
    public static class Industrien {

        @XmlElement(name = "Industrie", required = true)
        protected String industrie;

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

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Sprache" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bezeichnung",
        "sprache"
    })
    public static class KampagneName {

        @XmlElement(name = "Bezeichnung", required = true)
        protected String bezeichnung;
        @XmlElement(name = "Sprache", required = true)
        protected String sprache;

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
         * Ruft den Wert der sprache-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSprache() {
            return sprache;
        }

        /**
         * Legt den Wert der sprache-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSprache(String value) {
            this.sprache = value;
        }

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Kundengruppe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kundengruppe"
    })
    public static class Kundengruppen {

        @XmlElement(name = "Kundengruppe", required = true)
        protected String kundengruppe;

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

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "label"
    })
    public static class Label {

        @XmlElement(name = "Label", required = true)
        protected String label;

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

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Marke" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "marke"
    })
    public static class Marken {

        @XmlElement(name = "Marke", required = true)
        protected String marke;

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

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Organisation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "organisation"
    })
    public static class Organisationen {

        @XmlElement(name = "Organisation")
        protected List<String> organisation;

        /**
         * Gets the value of the organisation property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the organisation property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOrganisation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * </p>
         * 
         * 
         * @return
         *     The value of the organisation property.
         */
        public List<String> getOrganisation() {
            if (organisation == null) {
                organisation = new ArrayList<>();
            }
            return this.organisation;
        }

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Profilierungssortiment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "profilierungssortiment"
    })
    public static class Profilierungssortimente {

        @XmlElement(name = "Profilierungssortiment", required = true)
        protected String profilierungssortiment;

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

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.&lt;/p&gt;
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="GM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gm"
    })
    public static class Zuordnungsbereiche {

        @XmlElement(name = "GM", required = true)
        protected String gm;

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

    }

}
