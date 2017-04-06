package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lt.vtvpmc.ems.pw.entities.Student;
import org.hibernate.validator.constraints.Email;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


public class NewStudentBean {

    @PersistenceContext
    private EntityManager entityManager;

    @NotNull
    @Size(min = 3, max = 20, message = "Vardas turi būti 3 - 20 simbolių ilgio!")
    private String studentFirstName;

    @NotNull
    @Size(min = 3, max = 20, message = "Pavardė turi būti 3 - 20 simbolių ilgio!")
    private String studentLastName;

    @NotNull
    @Email(message = "El. pašto adresas turi būti veikiantis!")
    @Pattern(regexp=".+@.+\\..+", message = "El. pašto adresas turi būti veikiantis!")
    @Size(min = 10, max = 30, message = "El. pašto adresas turi būti 10 - 30 simbolių ilgio!")
    private String studentEmail;

    private Date dateOfBirth;

    private long studentPhone;

    private String maritalStatus;

    private String school;

    private Date dateOfSchoolGraduation;


    @Transactional
    public String save() {
        Student student = new Student(studentFirstName, studentLastName, dateOfBirth, studentEmail, studentPhone,
        maritalStatus, school, dateOfSchoolGraduation);
        entityManager.persist(student);
        return "main";
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
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
