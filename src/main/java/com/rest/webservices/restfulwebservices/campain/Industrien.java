package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Embeddable
public class Industrien {

    @JsonProperty("Industrie")
    @Column(length = 10, nullable = false)
    private String industrie;

    protected Industrien() {
        // JPA
    }
    public Industrien(String industrie) {
        this.industrie = industrie;
    }

    public String getIndustrie() {
        return industrie;
    }

    public void setIndustrie(String industrie) {
        this.industrie = industrie;
    }

}
