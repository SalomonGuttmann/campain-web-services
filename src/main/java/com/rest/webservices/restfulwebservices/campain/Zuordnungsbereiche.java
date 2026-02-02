package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Embeddable
public class Zuordnungsbereiche {

    @JsonProperty("GM")
    @Column(length = 10, nullable = false)
    private String gm;

    protected Zuordnungsbereiche() {
        // JPA
    }
    public Zuordnungsbereiche(String gm) {
        this.gm = gm;
    }

    public String getGM() {
        return gm;
    }

    public void setGM(String value) {
        this.gm = value;
    }

}


/*
*
* @Embeddable
public class Zuordnungsbereiche {

    @JsonProperty("GM")
    @Column(length = 10, nullable = false)
    private String gm;

    protected Zuordnungsbereiche() {}

    public String getGm() {
        return gm;
    }
}
* */