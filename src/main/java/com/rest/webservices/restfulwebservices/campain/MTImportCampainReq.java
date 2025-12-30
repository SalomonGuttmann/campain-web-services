package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "campain_details")
public class MTImportCampainReq {
    @Id
    @GeneratedValue
    private Integer id;
    @JsonProperty("QuellSystem")
    private Integer quell_system;
    @JsonProperty("TransaktionsID")
    private Integer transaktionsID;
    @JsonProperty("ExtKampagnenID")
    private String ext_kampagnenid;
    @JsonProperty("Kampagnentyp")
    private String kampagnentyp;
    @JsonProperty("Start")
    private Integer start;
    @JsonProperty("Ende")
    private Integer ende;
    @JsonProperty("MABEOnly")
    private Integer mABEOnly;
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
    private Integer planumsatz;
    @JsonProperty("Update")
    private Integer update;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuell_system() {
        return quell_system;
    }

    public void setQuell_system(Integer quell_system) {
        this.quell_system = quell_system;
    }

    public Integer getTransaktionsID() {
        return transaktionsID;
    }

    public void setTransaktionsID(Integer transaktionsID) {
        this.transaktionsID = transaktionsID;
    }

    public String getExt_kampagnenid() {
        return ext_kampagnenid;
    }

    public void setExt_kampagnenid(String ext_kampagnenid) {
        this.ext_kampagnenid = ext_kampagnenid;
    }

    public String getKampagnentyp() {
        return kampagnentyp;
    }

    public void setKampagnentyp(String kampagnentyp) {
        this.kampagnentyp = kampagnentyp;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnde() {
        return ende;
    }

    public void setEnde(Integer ende) {
        this.ende = ende;
    }

    public Integer getmABEOnly() {
        return mABEOnly;
    }

    public void setmABEOnly(Integer mABEOnly) {
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

    public void setBezeichnungsprache(String bezeichnungsprache) {
        this.bezeichnungsprache = bezeichnungsprache;
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

    public Integer getPlanumsatz() {
        return planumsatz;
    }

    public void setPlanumsatz(Integer planumsatz) {
        this.planumsatz = planumsatz;
    }

    public Integer getUpdate() {
        return update;
    }

    public void setUpdate(Integer update) {
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

    public MTImportCampainReq(Integer id, Integer quell_system, Integer transaktionsID, String ext_kampagnenid, String kampagnentyp, Integer start, Integer ende, Integer mABEOnly, String kampagnename, String kampagnesprache, String bezeichnung, String bezeichnungsprache, String erfassergruppe, String projektleiter, Integer planumsatz, Integer update, String gM, String organisation, String industrie, String marke, String label, String kundengruppe, String profilierungssortiment) {
        this.id = id;
        this.quell_system = quell_system;
        this.transaktionsID = transaktionsID;
        this.ext_kampagnenid = ext_kampagnenid;
        this.kampagnentyp = kampagnentyp;
        this.start = start;
        this.ende = ende;
        this.mABEOnly = mABEOnly;
        this.kampagnename = kampagnename;
        this.kampagnesprache = kampagnesprache;
        this.bezeichnung = bezeichnung;
        this.bezeichnungsprache = bezeichnungsprache;
        this.erfassergruppe = erfassergruppe;
        this.projektleiter = projektleiter;
        this.planumsatz = planumsatz;
        this.update = update;
        this.gM = gM;
        this.organisation = organisation;
        this.industrie = industrie;
        this.marke = marke;
        this.label = label;
        this.kundengruppe = kundengruppe;
        this.profilierungssortiment = profilierungssortiment;
    }


}