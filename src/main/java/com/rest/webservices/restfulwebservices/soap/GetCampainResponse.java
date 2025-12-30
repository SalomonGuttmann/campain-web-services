//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.6 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.rest.webservices.restfulwebservices.soap;

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
 *         &lt;element name="campain_res" type="{https://soap.restfulwebservices.webservices.rest.com}campain_res"/&gt;
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
    "campainRes"
})
@XmlRootElement(name = "getCampainResponse")
public class GetCampainResponse {

    @XmlElement(name = "campain_res", required = true)
    protected CampainRes campainRes;

    /**
     * Ruft den Wert der campainRes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CampainRes }
     *     
     */
    public CampainRes getCampainRes() {
        return campainRes;
    }

    /**
     * Legt den Wert der campainRes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CampainRes }
     *     
     */
    public void setCampainRes(CampainRes value) {
        this.campainRes = value;
    }

}
