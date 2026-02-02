package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Entity(name="in_mpromo_angelegte_kampagne")
public class InMPromoAngelegteKampagnen {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    // 🔗 FK-Spalte
    @OneToOne(optional = false)
    @JoinColumn(
            name = "import_campaign_req_id",
            nullable = false,
            unique = true
    )
    @JsonIgnore
    private MPImportCampaignReq importCampaignReq;

    @JsonProperty("Campaign_sk")
    @Column(length=30, nullable=false)
    private String campaign_sk;
    @JsonProperty("Campaign_cd")
    @Column(length=60, nullable=false)
    private String campaign_cd;
    @JsonProperty("Campaign_nm")
    @Column(length = 250, nullable = false)
    private String campaign_nm;
    @JsonProperty("Campaign_desc")
    @Column(length = 250)
    private String campaign_desc;
    @JsonProperty("Deleted_flg")
    @Column(length = 2, nullable = false)
    private String deleted_flg;
    @JsonProperty("Erfassungsdatum")
    @Column(length = 30, nullable = false)
    private String erfassungsdatum;
    @JsonProperty("In_m_promo_angelegt")
    @Column(length = 8)
    private String in_m_promo_angelegt;
    @JsonProperty("In_mabe_plan_angelegt")
    @Column(length = 8)
    private String in_mabe_plan_angelegt;
    @JsonProperty("Kamp_kampagnenzeitraum_bis")
    @Column(length = 30, nullable = false)
    private String kamp_kampagnenzeitraum_bis;
    @JsonProperty("Kamp_kampagnenzeitraum_von")
    @Column(length = 30, nullable = false)
    private String kamp_kampagnenzeitraum_von;
    @JsonProperty("Kamp_m_promo_relevant")
    @Column(length = 8)
    private String kamp_m_promo_relevant;
    @JsonProperty("Last_modified_dttm")
    @Column(length = 30, nullable = false)
    private String last_modified_dttm;
    @JsonProperty("Mpromo_erfassergruppe")
    @Column(length = 400, nullable = false)
    private String mpromo_erfassergruppe;
    @JsonProperty("Mpromo_organisation")
    @Column(length = 2000, nullable = false)
    private String mpromo_organisation;
    @JsonProperty("Mpromo_planumsatz")
    @Column(length = 8)
    private String mpromo_planumsatz;
    @JsonProperty("Mpromo_planungstart")
    @Column(length = 20)
    private String mpromo_planungstart;
    @JsonProperty("Mpromo_typ")
    @Column(length = 400)
    private String mpromo_typ;
    @JsonProperty("Mpromo_zuordnung")
    @Column(length = 2000, nullable = false)
    private String mpromo_zuordnung;
    @JsonProperty("Status_kampagne")
    @Column(length = 400)
    private String status_kampagne;
    @JsonProperty("Kamp_mabe_only")
    @Column(length = 8, nullable = false)
    private String kamp_mabe_only;
    @JsonProperty("Mpromo_marke")
    @Column(length = 2000)
    private String mpromo_marke;
    @JsonProperty("Mpromo_label")
    @Column(length = 2000)
    private String mpromo_label;
    @JsonProperty("Mpromo_kundengruppe")
    @Column(length = 2000, nullable = false)
    private String mpromo_kundengruppe;
    @JsonProperty("Mpromo_prof_sortiment")
    @Column(length = 2000, nullable = false)
    private String mpromo_prof_sortiment;
    @JsonProperty("Mpromo_industrie")
    @Column(length = 2000, nullable = false)
    private String mpromo_industrie;
    @JsonProperty("Mpromo_kamppl")
    @Column(length = 400)
    private String mpromo_kamppl;
    @JsonProperty("Mpromo_return_text")
    @Column(length = 250, nullable = false)
    private String mpromo_return_text;
    @JsonProperty("Mpromo_return_code")
    @Column(length = 3, nullable = false)
    private String mpromo_return_code;
    @JsonProperty("Kamp_kampagnenprio")
    @Column(length = 8)
    private String kamp_kampagnenprio;
    @JsonProperty("Kamp_verantwortlich_ci")
    @Column(length = 400, nullable = false)
    private String kamp_verantwortlich_ci;
    @JsonProperty("Kamp_verantwortlich_cu")
    @Column(length = 400, nullable = false)
    private String kamp_verantwortlich_cu;
    @JsonProperty("Kamp_verantwortlich_fam")
    @Column(length = 400, nullable = false)
    private String kamp_verantwortlich_fam;


    protected InMPromoAngelegteKampagnen() {
        //JPA
    }

    // ---------- Getter / Setter ----------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampaign_sk() {
        return campaign_sk;
    }

    public void setCampaign_sk(String campaign_sk) {
        this.campaign_sk = campaign_sk;
    }

    public String getCampaign_cd() {
        return campaign_cd;
    }

    public void setCampaign_cd(String campaign_cd) {
        this.campaign_cd = campaign_cd;
    }

    public String getCampaign_nm() {
        return campaign_nm;
    }

    public void setCampaign_nm(String campaign_nm) {
        this.campaign_nm = campaign_nm;
    }

    public String getCampaign_desc() {
        return campaign_desc;
    }

    public void setCampaign_desc(String campaign_desc) {
        this.campaign_desc = campaign_desc;
    }

    public String getDeleted_flg() {
        return deleted_flg;
    }

    public void setDeleted_flg(String deleted_flg) {
        this.deleted_flg = deleted_flg;
    }

    public String getErfassungsdatum() {
        return erfassungsdatum;
    }

    public void setErfassungsdatum() {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("ddMMMyyyy", Locale.ENGLISH);
        this.erfassungsdatum = LocalDateTime.now().format(formatter).toUpperCase();
    }

    public String getIn_m_promo_angelegt() {
        return in_m_promo_angelegt;
    }

    public void setIn_m_promo_angelegt(String in_m_promo_angelegt) {
        this.in_m_promo_angelegt = in_m_promo_angelegt;
    }

    public String getKamp_kampagnenzeitraum_bis() {
        return kamp_kampagnenzeitraum_bis;
    }

    public void setKamp_kampagnenzeitraum_bis(String kamp_kampagnenzeitraum_bis) {
        this.kamp_kampagnenzeitraum_bis = kamp_kampagnenzeitraum_bis;
    }

    public String getKamp_kampagnenzeitraum_von() {
        return kamp_kampagnenzeitraum_von;
    }

    public void setKamp_kampagnenzeitraum_von(String kamp_kampagnenzeitraum_von) {
        this.kamp_kampagnenzeitraum_von = kamp_kampagnenzeitraum_von;
    }

    public String getKamp_m_promo_relevant() {
        return kamp_m_promo_relevant;
    }

    public void setKamp_m_promo_relevant(String kamp_m_promo_relevant) {
        this.kamp_m_promo_relevant = kamp_m_promo_relevant;
    }

    public String getLast_modified_dttm() {
        return last_modified_dttm;
    }

    public void setLast_modified_dttm() {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("ddMMMyyyy:HH:mm:ss", Locale.ENGLISH);
        this.last_modified_dttm = LocalDateTime.now().format(formatter).toUpperCase();

    }

    public String getMpromo_erfassergruppe() {
        return mpromo_erfassergruppe;
    }

    public void setMpromo_erfassergruppe(String mpromo_erfassergruppe) {
        this.mpromo_erfassergruppe = mpromo_erfassergruppe;
    }

    public String getMpromo_organisation() {
        return mpromo_organisation;
    }

    public void setMpromo_organisation(String mpromo_organisation) {
        this.mpromo_organisation = mpromo_organisation;
    }

    public String getMpromo_planumsatz() {
        return mpromo_planumsatz;
    }

    public void setMpromo_planumsatz(String mpromo_planumsatz) {
        this.mpromo_planumsatz = mpromo_planumsatz;
    }

    public String getMpromo_planungstart() {
        return mpromo_planungstart;
    }

    public void setMpromo_planungstart(String mpromo_planungstart) {
        this.mpromo_planungstart = mpromo_planungstart;
    }

    public String getMpromo_typ() {
        return mpromo_typ;
    }

    public void setMpromo_typ(String mpromo_typ) {
        this.mpromo_typ = mpromo_typ;
    }

    public String getMpromo_zuordnung() {
        return mpromo_zuordnung;
    }

    public void setMpromo_zuordnung(String mpromo_zuordnung) {
        this.mpromo_zuordnung = mpromo_zuordnung;
    }

    public String getStatus_kampagne() {
        return status_kampagne;
    }

    public void setStatus_kampagne(String status_kampagne) {
        this.status_kampagne = status_kampagne;
    }

    public String getKamp_mabe_only() {
        return kamp_mabe_only;
    }

    public void setKamp_mabe_only(String kamp_mabe_only) {
        this.kamp_mabe_only = kamp_mabe_only;
    }

    public String getMpromo_marke() {
        return mpromo_marke;
    }

    public void setMpromo_marke(String mpromo_marke) {
        this.mpromo_marke = mpromo_marke;
    }

    public String getMpromo_label() {
        return mpromo_label;
    }

    public void setMpromo_label(String mpromo_label) {
        this.mpromo_label = mpromo_label;
    }

    public String getMpromo_kundengruppe() {
        return mpromo_kundengruppe;
    }

    public void setMpromo_kundengruppe(String mpromo_kundengruppe) {
        this.mpromo_kundengruppe = mpromo_kundengruppe;
    }

    public String getMpromo_prof_sortiment() {
        return mpromo_prof_sortiment;
    }

    public void setMpromo_prof_sortiment(String mpromo_prof_sortiment) {
        this.mpromo_prof_sortiment = mpromo_prof_sortiment;
    }

    public String getMpromo_industrie() {
        return mpromo_industrie;
    }

    public void setMpromo_industrie(String mpromo_industrie) {
        this.mpromo_industrie = mpromo_industrie;
    }

    public String getMpromo_kamppl() {
        return mpromo_kamppl;
    }

    public void setMpromo_kamppl(String mpromo_kamppl) {
        this.mpromo_kamppl = mpromo_kamppl;
    }

    public String getIn_mabe_plan_angelegt() {
        return in_mabe_plan_angelegt;
    }

    public void setIn_mabe_plan_angelegt(String in_mabe_plan_angelegt) {
        this.in_mabe_plan_angelegt = in_mabe_plan_angelegt;
    }

    public String getMpromo_return_text() {
        return mpromo_return_text;
    }

    public void setMpromo_return_text(String mpromo_return_text) {
        this.mpromo_return_text = mpromo_return_text;
    }

    public String getMpromo_return_code() {
        return mpromo_return_code;
    }

    public void setMpromo_return_code(String mpromo_return_code) {
        this.mpromo_return_code = mpromo_return_code;
    }

    public String getKamp_kampagnenprio() {
        return kamp_kampagnenprio;
    }

    public void setKamp_kampagnenprio(String kamp_kampagnenprio) {
        this.kamp_kampagnenprio = kamp_kampagnenprio;
    }

    public String getKamp_verantwortlich_ci() {
        return kamp_verantwortlich_ci;
    }

    public void setKamp_verantwortlich_ci(String kamp_verantwortlich_ci) {
        this.kamp_verantwortlich_ci = kamp_verantwortlich_ci;
    }

    public String getKamp_verantwortlich_cu() {
        return kamp_verantwortlich_cu;
    }

    public void setKamp_verantwortlich_cu(String kamp_verantwortlich_cu) {
        this.kamp_verantwortlich_cu = kamp_verantwortlich_cu;
    }

    public String getKamp_verantwortlich_fam() {
        return kamp_verantwortlich_fam;
    }

    public void setKamp_verantwortlich_fam(String kamp_verantwortlich_fam) {
        this.kamp_verantwortlich_fam = kamp_verantwortlich_fam;
    }


    public MPImportCampaignReq getImportCampaignReq() {
        return importCampaignReq;
    }

    public void setImportCampaignReq(MPImportCampaignReq importCampaignReq) {
        this.importCampaignReq = importCampaignReq;
    }

}