
package com.rest.webservices.restfulwebservices.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DT_ImportCampaign_Req complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="DT_ImportCampaign_Req">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QuellSystem">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TransaktionsID">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="32"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ExtKampagnenID">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="30"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Kampagnentyp">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Start">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Ende">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MABEOnly" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="KampagneName" type="{http://sas.com/customerintelligence}DT_Bezeichnung" maxOccurs="unbounded"/>
 *         <element name="Beschreibung" type="{http://sas.com/customerintelligence}DT_Bezeichnung" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Erfassergruppe">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="10"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Projektleiter">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="60"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Planumsatz" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="24"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Update">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Zuordnungsbereiche">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="GM" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="10"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Organisationen">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Organisation" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Industrien" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Industrie" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="10"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Marken" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Marke" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="3"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Label" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Label" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="3"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Kundengruppen" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Kundengruppe" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Profilierungssortimente" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Profilierungssortiment" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ImportCampaign_Req", propOrder = {
    "quellSystem",
    "transaktionsID",
    "extKampagnenID",
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
public class DTImportCampaignReq {

    @XmlElement(name = "QuellSystem", required = true)
    protected String quellSystem;
    @XmlElement(name = "TransaktionsID", required = true)
    protected String transaktionsID;
    @XmlElement(name = "ExtKampagnenID", required = true)
    protected String extKampagnenID;
    @XmlElement(name = "Kampagnentyp", required = true)
    protected String kampagnentyp;
    @XmlElement(name = "Start", required = true)
    protected String start;
    @XmlElement(name = "Ende", required = true)
    protected String ende;
    @XmlElement(name = "MABEOnly")
    protected String mabeOnly;
    @XmlElement(name = "KampagneName", required = true)
    protected List<DTBezeichnung> kampagneName;
    @XmlElement(name = "Beschreibung")
    protected List<DTBezeichnung> beschreibung;
    @XmlElement(name = "Erfassergruppe", required = true)
    protected String erfassergruppe;
    @XmlElement(name = "Projektleiter", required = true)
    protected String projektleiter;
    @XmlElement(name = "Planumsatz")
    protected String planumsatz;
    @XmlElement(name = "Update", required = true)
    protected String update;
    @XmlElement(name = "Zuordnungsbereiche", required = true)
    protected DTImportCampaignReq.Zuordnungsbereiche zuordnungsbereiche;
    @XmlElement(name = "Organisationen", required = true)
    protected DTImportCampaignReq.Organisationen organisationen;
    @XmlElement(name = "Industrien")
    protected DTImportCampaignReq.Industrien industrien;
    @XmlElement(name = "Marken")
    protected DTImportCampaignReq.Marken marken;
    @XmlElement(name = "Label")
    protected DTImportCampaignReq.Label label;
    @XmlElement(name = "Kundengruppen")
    protected DTImportCampaignReq.Kundengruppen kundengruppen;
    @XmlElement(name = "Profilierungssortimente")
    protected DTImportCampaignReq.Profilierungssortimente profilierungssortimente;

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
     * Ruft den Wert der extKampagnenID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtKampagnenID() {
        return extKampagnenID;
    }

    /**
     * Legt den Wert der extKampagnenID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtKampagnenID(String value) {
        this.extKampagnenID = value;
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
     * Gets the value of the kampagneName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kampagneName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKampagneName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTBezeichnung }
     * </p>
     * 
     * 
     * @return
     *     The value of the kampagneName property.
     */
    public List<DTBezeichnung> getKampagneName() {
        if (kampagneName == null) {
            kampagneName = new ArrayList<>();
        }
        return this.kampagneName;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beschreibung property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBeschreibung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTBezeichnung }
     * </p>
     * 
     * 
     * @return
     *     The value of the beschreibung property.
     */
    public List<DTBezeichnung> getBeschreibung() {
        if (beschreibung == null) {
            beschreibung = new ArrayList<>();
        }
        return this.beschreibung;
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
     * Ruft den Wert der zuordnungsbereiche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DTImportCampaignReq.Zuordnungsbereiche }
     *     
     */
    public DTImportCampaignReq.Zuordnungsbereiche getZuordnungsbereiche() {
        return zuordnungsbereiche;
    }

    /**
     * Legt den Wert der zuordnungsbereiche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DTImportCampaignReq.Zuordnungsbereiche }
     *     
     */
    public void setZuordnungsbereiche(DTImportCampaignReq.Zuordnungsbereiche value) {
        this.zuordnungsbereiche = value;
    }

    /**
     * Ruft den Wert der organisationen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DTImportCampaignReq.Organisationen }
     *     
     */
    public DTImportCampaignReq.Organisationen getOrganisationen() {
        return organisationen;
    }

    /**
     * Legt den Wert der organisationen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DTImportCampaignReq.Organisationen }
     *     
     */
    public void setOrganisationen(DTImportCampaignReq.Organisationen value) {
        this.organisationen = value;
    }

    /**
     * Ruft den Wert der industrien-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DTImportCampaignReq.Industrien }
     *     
     */
    public DTImportCampaignReq.Industrien getIndustrien() {
        return industrien;
    }

    /**
     * Legt den Wert der industrien-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DTImportCampaignReq.Industrien }
     *     
     */
    public void setIndustrien(DTImportCampaignReq.Industrien value) {
        this.industrien = value;
    }

    /**
     * Ruft den Wert der marken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DTImportCampaignReq.Marken }
     *     
     */
    public DTImportCampaignReq.Marken getMarken() {
        return marken;
    }

    /**
     * Legt den Wert der marken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DTImportCampaignReq.Marken }
     *     
     */
    public void setMarken(DTImportCampaignReq.Marken value) {
        this.marken = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DTImportCampaignReq.Label }
     *     
     */
    public DTImportCampaignReq.Label getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DTImportCampaignReq.Label }
     *     
     */
    public void setLabel(DTImportCampaignReq.Label value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der kundengruppen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DTImportCampaignReq.Kundengruppen }
     *     
     */
    public DTImportCampaignReq.Kundengruppen getKundengruppen() {
        return kundengruppen;
    }

    /**
     * Legt den Wert der kundengruppen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DTImportCampaignReq.Kundengruppen }
     *     
     */
    public void setKundengruppen(DTImportCampaignReq.Kundengruppen value) {
        this.kundengruppen = value;
    }

    /**
     * Ruft den Wert der profilierungssortimente-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DTImportCampaignReq.Profilierungssortimente }
     *     
     */
    public DTImportCampaignReq.Profilierungssortimente getProfilierungssortimente() {
        return profilierungssortimente;
    }

    /**
     * Legt den Wert der profilierungssortimente-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DTImportCampaignReq.Profilierungssortimente }
     *     
     */
    public void setProfilierungssortimente(DTImportCampaignReq.Profilierungssortimente value) {
        this.profilierungssortimente = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Industrie" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="10"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "industrie"
    })
    public static class Industrien {

        @XmlElement(name = "Industrie", required = true)
        protected List<String> industrie;

        /**
         * Gets the value of the industrie property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the industrie property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getIndustrie().add(newItem);
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
         *     The value of the industrie property.
         */
        public List<String> getIndustrie() {
            if (industrie == null) {
                industrie = new ArrayList<>();
            }
            return this.industrie;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Kundengruppe" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kundengruppe"
    })
    public static class Kundengruppen {

        @XmlElement(name = "Kundengruppe", required = true)
        protected List<String> kundengruppe;

        /**
         * Gets the value of the kundengruppe property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kundengruppe property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getKundengruppe().add(newItem);
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
         *     The value of the kundengruppe property.
         */
        public List<String> getKundengruppe() {
            if (kundengruppe == null) {
                kundengruppe = new ArrayList<>();
            }
            return this.kundengruppe;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Label" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="3"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "label"
    })
    public static class Label {

        @XmlElement(name = "Label", required = true)
        protected List<String> label;

        /**
         * Gets the value of the label property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the label property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLabel().add(newItem);
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
         *     The value of the label property.
         */
        public List<String> getLabel() {
            if (label == null) {
                label = new ArrayList<>();
            }
            return this.label;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Marke" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="3"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "marke"
    })
    public static class Marken {

        @XmlElement(name = "Marke", required = true)
        protected List<String> marke;

        /**
         * Gets the value of the marke property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the marke property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMarke().add(newItem);
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
         *     The value of the marke property.
         */
        public List<String> getMarke() {
            if (marke == null) {
                marke = new ArrayList<>();
            }
            return this.marke;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Organisation" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "organisation"
    })
    public static class Organisationen {

        @XmlElement(name = "Organisation", required = true)
        protected List<String> organisation;

        /**
         * Gets the value of the organisation property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organisation property.</p>
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
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Profilierungssortiment" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "profilierungssortiment"
    })
    public static class Profilierungssortimente {

        @XmlElement(name = "Profilierungssortiment", required = true)
        protected List<String> profilierungssortiment;

        /**
         * Gets the value of the profilierungssortiment property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profilierungssortiment property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getProfilierungssortiment().add(newItem);
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
         *     The value of the profilierungssortiment property.
         */
        public List<String> getProfilierungssortiment() {
            if (profilierungssortiment == null) {
                profilierungssortiment = new ArrayList<>();
            }
            return this.profilierungssortiment;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="GM" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="10"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gm"
    })
    public static class Zuordnungsbereiche {

        @XmlElement(name = "GM", required = true)
        protected List<String> gm;

        /**
         * Gets the value of the gm property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gm property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getGM().add(newItem);
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
         *     The value of the gm property.
         */
        public List<String> getGM() {
            if (gm == null) {
                gm = new ArrayList<>();
            }
            return this.gm;
        }

    }

}
