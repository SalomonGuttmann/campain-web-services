package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Embeddable
public class Bezeichnung {


    @Column(length = 250, nullable = false)
    private String Bezeichnung;


    @Column(length = 1, nullable = false)
    private String Sprache;

    protected Bezeichnung() {
        // JPA
    }

    public Bezeichnung(String bezeichnung, String sprache) {
        this.Bezeichnung = bezeichnung;
        this.Sprache = sprache;
    }

    @JsonProperty("Bezeichnung")
    public String getBezeichnung() {
        return Bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.Bezeichnung = bezeichnung;
    }

    @JsonProperty("Sprache")
    public String getSprache() {
        return Sprache;
    }

    public void setSprache(String sprache) {
        this.Sprache = sprache;
    }

}


