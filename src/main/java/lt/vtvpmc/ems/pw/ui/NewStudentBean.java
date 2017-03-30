package lt.vtvpmc.ems.pw.ui;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lt.vtvpmc.ems.pw.entities.Student;
import org.hibernate.validator.constraints.Email;
import org.springframework.transaction.annotation.Transactional;


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

    private long dateOfBirth;

    @Transactional
    public String save() {
        Student student = new Student(studentFirstName, studentLastName, dateOfBirth, studentEmail);
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

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
}
