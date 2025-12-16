
package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="campain_details")
public class MTImportCampainReq {
    @Id
    @GeneratedValue
    private Integer id;
    @JsonProperty("QuellSystem")
    private String quell_system;
    @JsonProperty("TransaktionsID")
    private String transaktionsID;
    @JsonProperty("ExtKampagnenID")
    private String ext_kampagnenid;
    @JsonProperty("Kampagnentyp")
    private String kampagnentyp;
    @JsonProperty("Start")
    private String start;
    @JsonProperty("Ende")
    private String ende;
    @JsonProperty("MABEOnly")
    private String mABEOnly;
    @JsonProperty("KampagneName")
    private String kampagnename;
    @JsonProperty("KampagneSprache")
    private String kampagnesprache;
    @JsonProperty("Bezeichnung")
    private String bezeichnung;
    @JsonProperty("Sprache")
    private String bezeichnungsprache;
    @JsonProperty("Erfassergruppe")
    private String erfassergruppe;
    @JsonProperty("Projektleiter")
    private String projektleiter;
    @JsonProperty("Planumsatz")
    private String planumsatz;
    @JsonProperty("Update")
    private String update;
    @JsonProperty("GM")
    private String gM;
    @JsonProperty("Organisation")
    private String organisation;
    @JsonProperty("Industrie")
    private String industrie;
    @JsonProperty("Marke")
    private String marke;
    @JsonProperty("Label")
    private String label;
    @JsonProperty("Kundengruppe")
    private String kundengruppe;
    @JsonProperty("Profilierungssortiment")
    private String profilierungssortiment;

    protected MTImportCampainReq() {
    }

    public MTImportCampainReq(Integer id, String profilierungssortiment, String kundengruppe, String label, String marke, String industrie, String organisation, String gM, String update, String planumsatz, String projektleiter, String erfassergruppe, String bezeichnungsprache, String bezeichnung, String kampagnesprache, String kampagnename, String mABEOnly, String ende, String start, String kampagnentyp, String ext_kampagnenid, String transaktionsID, String quell_system) {
        this.id = id;
        this.profilierungssortiment = profilierungssortiment;
        this.kundengruppe = kundengruppe;
        this.label = label;
        this.marke = marke;
        this.industrie = industrie;
        this.organisation = organisation;
        this.gM = gM;
        this.update = update;
        this.planumsatz = planumsatz;
        this.projektleiter = projektleiter;
        this.erfassergruppe = erfassergruppe;
        this.bezeichnungsprache = bezeichnungsprache;
        this.bezeichnung = bezeichnung;
        this.kampagnesprache = kampagnesprache;
        this.kampagnename = kampagnename;
        this.mABEOnly = mABEOnly;
        this.ende = ende;
        this.start = start;
        this.kampagnentyp = kampagnentyp;
        this.ext_kampagnenid = ext_kampagnenid;
        this.transaktionsID = transaktionsID;
        this.quell_system = quell_system;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuell_system() {
        return quell_system;
    }

    public void setQuell_system(String quellSystem) {
        this.quell_system = quellSystem;
    }

    public String getTransaktionsID() {
        return transaktionsID;
    }

    public void setTransaktionsID(String transaktionsID) {
        this.transaktionsID = transaktionsID;
    }

    public String getExt_kampagnenid() {
        return ext_kampagnenid;
    }

    public void setExt_kampagnenid(String extKampagnenID) {
        this.ext_kampagnenid = extKampagnenID;
    }

    public String getKampagnentyp() {
        return kampagnentyp;
    }

    public void setKampagnentyp(String kampagnentyp) {
        this.kampagnentyp = kampagnentyp;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnde() {
        return ende;
    }

    public void setEnde(String ende) {
        this.ende = ende;
    }

    public String getmABEOnly() {
        return mABEOnly;
    }

    public void setmABEOnly(String mABEOnly) {
        this.mABEOnly = mABEOnly;
    }

    public String getKampagnename() {
        return kampagnename;
    }

    public void setKampagnename(String kampagnename) {
        this.kampagnename = kampagnename;
    }

    public String getKampagnesprache() {
        return kampagnesprache;
    }

    public void setKampagnesprache(String kampagnesprache) {
        this.kampagnesprache = kampagnesprache;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnungsprache() {
        return bezeichnungsprache;
    }

    public void setBezeichnungsprache(String campainsprache) {
        this.bezeichnungsprache = campainsprache;
    }

    public String getErfassergruppe() {
        return erfassergruppe;
    }

    public void setErfassergruppe(String erfassergruppe) {
        this.erfassergruppe = erfassergruppe;
    }

    public String getProjektleiter() {
        return projektleiter;
    }

    public void setProjektleiter(String projektleiter) {
        this.projektleiter = projektleiter;
    }

    public String getPlanumsatz() {
        return planumsatz;
    }

    public void setPlanumsatz(String planumsatz) {
        this.planumsatz = planumsatz;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getgM() {
        return gM;
    }

    public void setgM(String gM) {
        this.gM = gM;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getIndustrie() {
        return industrie;
    }

    public void setIndustrie(String industrie) {
        this.industrie = industrie;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getKundengruppe() {
        return kundengruppe;
    }

    public void setKundengruppe(String kundengruppe) {
        this.kundengruppe = kundengruppe;
    }

    public String getProfilierungssortiment() {
        return profilierungssortiment;
    }

    public void setProfilierungssortiment(String profilierungssortiment) {
        this.profilierungssortiment = profilierungssortiment;
    }


}