package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Embeddable
public class Kundengruppen {

    @JsonProperty("Kundengruppe")
    @Column(length = 1, nullable = false)
    private String kundengruppe;

    protected Kundengruppen() {
        // JPA
    }
    public Kundengruppen(String kundengruppe) {
        this.kundengruppe = kundengruppe;
    }

    public String getKundengruppe() {
        return kundengruppe;
    }

    public void setKundengruppe(String kundengruppe) {
        this.kundengruppe = kundengruppe;
    }
}
