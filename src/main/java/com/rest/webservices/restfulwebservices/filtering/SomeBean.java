package com.rest.webservices.restfulwebservices.filtering;


import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

//@JsonIgnoreProperties("field1") endlich wie @JsonIgnore
//@JsonIgnoreProperties({"field1","field2","field3"})
//damit in FilteringController.filtering() und FilteringController.filteringList() filters benutzt werden können
@JsonFilter("SomeBeanFilter")
public class SomeBean {
    private String field1;

    //@JsonIgnore //so wird das Feld in JSON Response nicht angezeigt
    private String field2;
    private String field3;

    public SomeBean(String field1, String field2, String field3) {
        super();
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
    public String getField1() {
        return field1;
    }
    public String getField2() {
        return field2;
    }
    public String getField3() {
        return field3;
    }
    @Override
    public String toString() {
        return "SomeBean [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + "]";
    }



}
