package com.rest.webservices.restfulwebservices.campain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


import jakarta.persistence.*;

@Entity(name="ImportCampaignReq")
public class MPImportCampaignReq {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    // 🔗 1:1 Beziehung (inverse Seite)
    @OneToOne(
            mappedBy = "importCampaignReq",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = true
    )
    @JsonIgnore
    private InMPromoAngelegteKampagnen mpromoKampagne;

    @JsonProperty("QuellSystem")
    @Column(length=2, nullable=false)
    private String QuellSystem;
    @JsonProperty("TransaktionsID")
    @Column(length=32, nullable=false)
    private String TransaktionsID;
    @JsonProperty("ExtKampagnenID")
    @Column(length=30, nullable=false)
    private String ExtKampagnenID;
    @JsonProperty("Kampagnentyp")
    @Column(length=3, nullable=false)
    private String Kampagnentyp;
    @JsonProperty("Start")
    @Column(length=8, nullable=false)
    private String Start;
    @JsonProperty("Ende")
    @Column(length=8, nullable=false)
    private String Ende;
    @JsonProperty("MABEOnly")
    @Column(length=1)
    private String MABEOnly;
    @JsonProperty("Kamp_mabe_only")
    @Column(length=1)
    private String kamp_mabe_only;
    @JsonProperty("Mpromo_planumsatz")
    @Column(length=1)
    private String mpromo_planumsatz;
    @JsonProperty("Kamp_m_promo_relevant")
    @Column(length=1)
    private String kamp_m_promo_relevant;
    @JsonProperty("In_m_promo_angelegt")
    @Column(length=1)
    private String in_m_promo_angelegt;
    @JsonProperty("In_mabe_plan_angelegt")
    @Column(length=1)
    private String in_mabe_plan_angelegt;
    @JsonProperty("Deleted_flg")
    @Column(length=1)
    private String deleted_flg;

   @ElementCollection
    @CollectionTable(
            name = "kampagne_name",
            joinColumns = @JoinColumn(name = "campaign_id")
    )
   @JsonProperty("KampagneName")
    private List<Bezeichnung> kampagneName = new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "beschreibung",
            joinColumns = @JoinColumn(name = "campaign_id")
    )
    @JsonProperty("Beschreibung")
    private List<Bezeichnung> beschreibung = new ArrayList<>();


    @JsonProperty("Erfassergruppe")
    @Column(length=10, nullable=false)
    private String Erfassergruppe;
    @JsonProperty("Projektleiter")
    @Column(length=60, nullable=false)
    private String Projektleiter;
    @JsonProperty("Planumsatz")
    @Column(length=24)
    private String Planumsatz;
    @JsonProperty("Update")
    @Column(length=1)
    private String Update;

    @ElementCollection
    @CollectionTable(
            name = "zuordnungsbereiche",
            joinColumns = @JoinColumn(name = "campaign_id")
    )
    @JsonProperty("Zuordnungsbereiche")
    private List<Zuordnungsbereiche> zuordnungsbereiche= new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "organisationen",
            joinColumns = @JoinColumn(name = "campaign_id")
    )
    @JsonProperty("Organisationen")
    private List<Organisationen> organisationen = new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "industrien",
            joinColumns = @JoinColumn(name = "campaign_id")
    )
    @JsonProperty("Industrien")
    private List<Industrien> industrien = new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "marken",
            joinColumns = @JoinColumn(name = "campaign_id")
    )
    @JsonProperty("Marken")
    private List<Marken> marken = new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "label",
            joinColumns = @JoinColumn(name = "campaign_id")
    )
    @JsonProperty("Label")
    private List<Label> label = new ArrayList<>();


    @ElementCollection
    @CollectionTable(
            name = "kundengruppen",
            joinColumns = @JoinColumn(name = "campaign_id")
    )
    @JsonProperty("Kundengruppen")
    private List<Kundengruppen> kundengruppen = new ArrayList<>();

    @ElementCollection
    @CollectionTable(
            name = "profilierungssortimente",
            joinColumns = @JoinColumn(name = "campaign_id")
    )
    @JsonProperty("Profilierungssortimente")
    private List<Profilierungssortimente> profilierungssortimente = new ArrayList<>();

    protected MPImportCampaignReq() {
        //JPA
    }

    // ---------- Getter / Setter ----------

    public Long getId() {
        return id;
    }

    public String getQuellSystem() {
        return QuellSystem;
    }

    public void setQuellSystem(String quellSystem) {
        this.QuellSystem = quellSystem;
    }

    public String getTransaktionsID() {
        return TransaktionsID;
    }

    public void setTransaktionsID(String transaktionsId) {
        this.TransaktionsID = TransaktionsID;
    }

    public String getExtKampagnenId() {
        return ExtKampagnenID;
    }

    public void setExtKampagnenId(String extKampagnenId) {
        this.ExtKampagnenID = extKampagnenId;
    }

    public String getKampagnentyp() {
        return Kampagnentyp;
    }

    public void setKampagnentyp(String kampagnentyp) {
        this.Kampagnentyp = kampagnentyp;
    }

    public String getStart() {
        return Start;
    }

    public void setStart(String start) {

        // Eingabeformat: yyyyMMdd
        DateTimeFormatter inputFormatter =
                DateTimeFormatter.ofPattern("yyyyMMdd");

        // Zielformat: ddMMMyyyy:HH:mm:ss
        DateTimeFormatter outputFormatter =
                DateTimeFormatter.ofPattern("ddMMMyyyy:HH:mm:ss", Locale.ENGLISH);

        LocalDate date = LocalDate.parse(start, inputFormatter);

        this.Start = date
                .atStartOfDay() // 00:00:00
                .format(outputFormatter)
                .toUpperCase();
    }

    public String getEnde() {
        return Ende;
    }

    public void setEnde(String ende) {
        this.Ende = ende;
    }

    public String getMABEOnly() {
        return MABEOnly;
    }

    public void setMABEOnly(String mabeOnly) {
        this.MABEOnly = mabeOnly;
    }

    public String getErfassergruppe() {
        return Erfassergruppe;
    }

    public void setErfassergruppe(String erfassergruppe) {
        this.Erfassergruppe = erfassergruppe;
    }

    public String getProjektleiter() {
        return Projektleiter;
    }

    public void setProjektleiter(String projektleiter) {
        this.Projektleiter = projektleiter;
    }

    public String getPlanumsatz() {
        return Planumsatz;
    }

    public void setPlanumsatz(String planumsatz) {
        this.Planumsatz = planumsatz;
    }

    public String getUpdate() {
        return Update;
    }

    public void setUpdate(String update) {
        this.Update = update;
    }

    public List<Bezeichnung> getKampagneName() {
        return kampagneName;
    }

    public void addKampagneName(Bezeichnung b) {
        this.kampagneName.add(b);
    }
    public List<Bezeichnung> getBeschreibung() {
        return beschreibung;
    }

    public void addBeschreibung(Bezeichnung b) {
        this.beschreibung.add(b);
    }

    public List<Zuordnungsbereiche> getZuordnungsbereiche() {
        return zuordnungsbereiche;
    }

    public void addZuordnungsbereich(Zuordnungsbereiche z) {
        this.zuordnungsbereiche.add(z);
    }

    public List<Organisationen> getOrganisationen() {
        return organisationen;
    }

    public void addOrganisationen(Organisationen z) {
        this.organisationen.add(z);
    }

    public List<Industrien> getIndustrien() {
        return industrien;
    }

    public void addIndustrien(Industrien z) {
        this.industrien.add(z);
    }

    public List<Marken> getMarken() {
        return marken;
    }

    public void addMarken(Marken z) {
        this.marken.add(z);
    }

    public List<Label> getLabel() {
        return label;
    }

    public void addLabel(Label z) {
        this.label.add(z);
    }

    public List<Kundengruppen> getKundengruppen() {
        return kundengruppen;
    }

    public void addKundengruppen(Kundengruppen z) {
        this.kundengruppen.add(z);
    }

    public List<Profilierungssortimente> getProfilierungssortimente() {
        return profilierungssortimente;
    }

    public void addProfilierungssortimente(Profilierungssortimente z) {
        this.profilierungssortimente.add(z);
    }

    public String getMpromo_planumsatz() {
        return mpromo_planumsatz;
    }

    public void setMpromo_planumsatz(String mpromo_planumsatz) {
        this.mpromo_planumsatz = mpromo_planumsatz;
    }

    public String getKamp_mabe_only() {
        return kamp_mabe_only;
    }

    public void setKamp_mabe_only(String kamp_mabe_only) {
        this.kamp_mabe_only = kamp_mabe_only;
    }

    public String getKamp_m_promo_relevant() {
        return kamp_m_promo_relevant;
    }

    public void setKamp_m_promo_relevant(String kamp_m_promo_relevant) {
        this.kamp_m_promo_relevant = kamp_m_promo_relevant;
    }

    public String getIn_m_promo_angelegt() {
        return in_m_promo_angelegt;
    }

    public void setIn_m_promo_angelegt(String in_m_promo_angelegt) {
        this.in_m_promo_angelegt = in_m_promo_angelegt;
    }

    public String getIn_mabe_plan_angelegt() {
        return in_mabe_plan_angelegt;
    }

    public void setIn_mabe_plan_angelegt(String in_mabe_plan_angelegt) {
        this.in_mabe_plan_angelegt = in_mabe_plan_angelegt;
    }

    public String getDeleted_flg() {
        return deleted_flg;
    }

    public void setDeleted_flg(String deleted_flg) {
        this.deleted_flg = deleted_flg;
    }


    public InMPromoAngelegteKampagnen getMpromoKampagne() {
        return mpromoKampagne;
    }

    public void setMpromoKampagne(InMPromoAngelegteKampagnen kampagne) {
        this.mpromoKampagne = kampagne;
        if (kampagne != null) {
            kampagne.setImportCampaignReq(this);
        }
    }
}
