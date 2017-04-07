package lt.vtvpmc.ems.pw.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Vitalij.
 */
@Entity
public class Mokosi_antra_karta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mokosi_antra_karta;

    private String igyta_specialybe;
    private String institucijos_pavadinimas;
    private String institucijos_tipas;
    private int baigimo_metai;

    public Mokosi_antra_karta() {
    }

    public Mokosi_antra_karta(String igyta_specialybe, String institucijos_pavadinimas, String institucijos_tipas, int baigimo_metai) {
        this.igyta_specialybe = igyta_specialybe;
        this.institucijos_pavadinimas = institucijos_pavadinimas;
        this.institucijos_tipas = institucijos_tipas;
        this.baigimo_metai = baigimo_metai;
    }

    public Long getId_mokosi_antra_karta() {
        return id_mokosi_antra_karta;
    }

    public void setId_mokosi_antra_karta(Long id_mokosi_antra_karta) {
        this.id_mokosi_antra_karta = id_mokosi_antra_karta;
    }

    public String getIgyta_specialybe() {
        return igyta_specialybe;
    }

    public void setIgyta_specialybe(String igyta_specialybe) {
        this.igyta_specialybe = igyta_specialybe;
    }

    public String getInstitucijos_pavadinimas() {
        return institucijos_pavadinimas;
    }

    public void setInstitucijos_pavadinimas(String institucijos_pavadinimas) {
        this.institucijos_pavadinimas = institucijos_pavadinimas;
    }

    public String getInstitucijos_tipas() {
        return institucijos_tipas;
    }

    public void setInstitucijos_tipas(String institucijos_tipas) {
        this.institucijos_tipas = institucijos_tipas;
    }

    public int getBaigimo_metai() {
        return baigimo_metai;
    }

    public void setBaigimo_metai(int baigimo_metai) {
        this.baigimo_metai = baigimo_metai;
    }
}
