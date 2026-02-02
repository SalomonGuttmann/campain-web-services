package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Embeddable
public class Organisationen {

    @JsonProperty("Organisation")
    @Column(length = 2, nullable = false)
    private String organisation;

    protected Organisationen() {
        // JPA
    }

    public Organisationen(String organisation) {
        this.organisation = organisation;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

}
