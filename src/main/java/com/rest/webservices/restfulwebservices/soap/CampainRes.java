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
 * &lt;p&gt;Java-Klasse für campain_res complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="campain_res"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuellSystem" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransaktionsID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExtKampagnenid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Message"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "campain_res", propOrder = {
    "quellSystem",
    "transaktionsID",
    "extKampagnenid",
    "message"
})
public class CampainRes {

    @XmlElement(name = "QuellSystem")
    protected int quellSystem;
    @XmlElement(name = "TransaktionsID")
    protected int transaktionsID;
    @XmlElement(name = "ExtKampagnenid", required = true)
    protected String extKampagnenid;
    @XmlElement(name = "Message", required = true)
    protected CampainRes.Message message;

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
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CampainRes.Message }
     *     
     */
    public CampainRes.Message getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CampainRes.Message }
     *     
     */
    public void setMessage(CampainRes.Message value) {
        this.message = value;
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
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "type",
        "text"
    })
    public static class Message {

        @XmlElement(name = "Type", required = true)
        protected String type;
        @XmlElement(name = "Text", required = true)
        protected String text;

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Ruft den Wert der text-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Legt den Wert der text-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

    }

}
