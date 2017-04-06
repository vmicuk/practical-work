package lt.vtvpmc.ems.pw.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;import java.util.Date;

@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;

//    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateOfBirth;
    private String email;
    @OneToOne
    private Priedas priedas;
    @OneToOne
    private Papildoma_informacija papildoma_informacija;
    @OneToOne
    private Mokosi_antra_karta mokosi_antra_karta;
    @OneToOne
    private Prasymas prasymas;

    public Student(String firstName, String lastName, Date dateOfBirth, String email, Priedas priedas, Papildoma_informacija papildoma_informacija, Mokosi_antra_karta mokosi_antra_karta, Prasymas prasymas) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.priedas = priedas;
        this.papildoma_informacija = papildoma_informacija;
        this.mokosi_antra_karta = mokosi_antra_karta;
        this.prasymas = prasymas;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Priedas getPriedas() {
        return priedas;
    }

    public void setPriedas(Priedas priedas) {
        this.priedas = priedas;
    }

    public Papildoma_informacija getPapildoma_informacija() {
        return papildoma_informacija;
    }

    public void setPapildoma_informacija(Papildoma_informacija papildoma_informacija) {
        this.papildoma_informacija = papildoma_informacija;
    }

    public Mokosi_antra_karta getMokosi_antra_karta() {
        return mokosi_antra_karta;
    }

    public void setMokosi_antra_karta(Mokosi_antra_karta mokosi_antra_karta) {
        this.mokosi_antra_karta = mokosi_antra_karta;
    }
}
