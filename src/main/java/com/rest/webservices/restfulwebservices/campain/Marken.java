package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Embeddable
public class Marken {

    @JsonProperty("Marke")
    @Column(length = 3, nullable = false)
    private String marke;

    protected Marken() {
        // JPA
    }
    public Marken(String marke) {
        this.marke = marke;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

}
