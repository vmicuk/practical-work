package lt.vtvpmc.ems.pw.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Vitalij.
 */
@Entity
public class Prasymas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_prasymas;
    private Date date;
    private String grupe;
    private String pakopa;

    public Prasymas() {
    }

    public Prasymas(Date date, String grupe, String pakopa) {
        this.date = date;
        this.grupe = grupe;
        this.pakopa = pakopa;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGrupe() {
        return grupe;
    }

    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }

    public String getPakopa() {
        return pakopa;
    }

    public void setPakopa(String pakopa) {
        this.pakopa = pakopa;
    }
}
