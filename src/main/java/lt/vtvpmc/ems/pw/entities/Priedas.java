package lt.vtvpmc.ems.pw.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Vitalij.
 */
@Entity
public class Priedas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_priedas;

    private boolean issilavinimo_dokumentai;
    private boolean sveikatos_pazymejimas;
    private boolean nuotraukos;
    private boolean paso_kopija;
    private boolean sauktinio_liudijimas;
    private boolean stojamasis_mokestis;

    public Priedas() {}

    public Priedas(boolean issilavinimo_dokumentai, boolean sveikatos_pazymejimas, boolean nuotraukos, boolean paso_kopija, boolean sauktinio_liudijimas, boolean stojamasis_mokestis) {
        this.issilavinimo_dokumentai = issilavinimo_dokumentai;
        this.sveikatos_pazymejimas = sveikatos_pazymejimas;
        this.nuotraukos = nuotraukos;
        this.paso_kopija = paso_kopija;
        this.sauktinio_liudijimas = sauktinio_liudijimas;
        this.stojamasis_mokestis = stojamasis_mokestis;
    }

    public Long getId_priedas() {
        return id_priedas;
    }

    public void setId_priedas(Long id_priedas) {
        this.id_priedas = id_priedas;
    }

    public boolean isIssilavinimo_dokumentai() {
        return issilavinimo_dokumentai;
    }

    public void setIssilavinimo_dokumentai(boolean issilavinimo_dokumentai) {
        this.issilavinimo_dokumentai = issilavinimo_dokumentai;
    }

    public boolean isSveikatos_pazymejimas() {
        return sveikatos_pazymejimas;
    }

    public void setSveikatos_pazymejimas(boolean sveikatos_pazymejimas) {
        this.sveikatos_pazymejimas = sveikatos_pazymejimas;
    }

    public boolean isNuotraukos() {
        return nuotraukos;
    }

    public void setNuotraukos(boolean nuotraukos) {
        this.nuotraukos = nuotraukos;
    }

    public boolean isPaso_kopija() {
        return paso_kopija;
    }

    public void setPaso_kopija(boolean paso_kopija) {
        this.paso_kopija = paso_kopija;
    }

    public boolean isSauktinio_liudijimas() {
        return sauktinio_liudijimas;
    }

    public void setSauktinio_liudijimas(boolean sauktinio_liudijimas) {
        this.sauktinio_liudijimas = sauktinio_liudijimas;
    }

    public boolean isStojamasis_mokestis() {
        return stojamasis_mokestis;
    }

    public void setStojamasis_mokestis(boolean stojamasis_mokestis) {
        this.stojamasis_mokestis = stojamasis_mokestis;
    }
}
