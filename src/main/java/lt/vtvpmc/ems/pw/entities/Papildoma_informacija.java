package lt.vtvpmc.ems.pw.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Vitalij.
 */
@Entity
public class Papildoma_informacija {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_papildoma_informacija;
    private boolean bendrabutis;
    private String is_kur_suzinojote;
    private boolean dokumentai;

    public Papildoma_informacija() {

    }
    public Papildoma_informacija(boolean bendrabutis, String is_kur_suzinojote, boolean dokumentai) {
        this.bendrabutis = bendrabutis;
        this.is_kur_suzinojote = is_kur_suzinojote;
        this.dokumentai = dokumentai;
    }

    public Long getId_papildoma_informacija() {
        return id_papildoma_informacija;
    }

    public void setId_papildoma_informacija(Long id_papildoma_informacija) {
        this.id_papildoma_informacija = id_papildoma_informacija;
    }

    public boolean isBendrabutis() {
        return bendrabutis;
    }

    public void setBendrabutis(boolean bendrabutis) {
        this.bendrabutis = bendrabutis;
    }

    public String getIs_kur_suzinojote() {
        return is_kur_suzinojote;
    }

    public void setIs_kur_suzinojote(String is_kur_suzinojote) {
        this.is_kur_suzinojote = is_kur_suzinojote;
    }

    public boolean isDokumentai() {
        return dokumentai;
    }

    public void setDokumentai(boolean dokumentai) {
        this.dokumentai = dokumentai;
    }
}
