//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.6 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package com.rest.webservices.restfulwebservices.soap;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rest.webservices.restfulwebservices.soap package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rest.webservices.restfulwebservices.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCampainRequest }
     * 
     * @return
     *     the new instance of {@link GetCampainRequest }
     */
    public GetCampainRequest createGetCampainRequest() {
        return new GetCampainRequest();
    }

    /**
     * Create an instance of {@link GetCampainResponse }
     * 
     * @return
     *     the new instance of {@link GetCampainResponse }
     */
    public GetCampainResponse createGetCampainResponse() {
        return new GetCampainResponse();
    }

    /**
     * Create an instance of {@link Campain }
     * 
     * @return
     *     the new instance of {@link Campain }
     */
    public Campain createCampain() {
        return new Campain();
    }

}
