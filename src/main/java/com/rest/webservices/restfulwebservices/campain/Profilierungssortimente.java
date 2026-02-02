package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Embeddable
public class Profilierungssortimente {

    @JsonProperty("Profilierungssortiment")
    @Column(length = 2, nullable = false)
    private String profilierungssortiment;

    protected Profilierungssortimente() {
        // JPA
    }

    public Profilierungssortimente(String profilierungssortiment) {
        this.profilierungssortiment = profilierungssortiment;
    }

    public String getProfilierungssortiment() {
        return profilierungssortiment;
    }

    public void setProfilierungssortiment(String profilierungssortiment) {
        this.profilierungssortiment = profilierungssortiment;
    }
}
