package lt.vtvpmc.ems.pw.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;import java.util.Date;

@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String firstName;

    private String lastName;

//    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String email;


    private long studentPhone;

    private String maritalStatus;

    private String school;

    // @Temporal(TemporalType.DATE)
    private Date dateOfSchoolGraduation;



    public Student(String firstName, String lastName, Date dateOfBirth, String email, long studentPhone,
                   String maritalStatus, String school, Date dateOfSchoolGraduation) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.studentPhone = studentPhone;
        this.maritalStatus = maritalStatus;
        this.school = school;
        this.dateOfSchoolGraduation = dateOfSchoolGraduation;
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

    public long getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(long studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getDateOfSchoolGraduation() {
        return dateOfSchoolGraduation;
    }

    public void setDateOfSchoolGraduation(Date dateOfSchoolGraduation) {
        this.dateOfSchoolGraduation = dateOfSchoolGraduation;
    }
}
