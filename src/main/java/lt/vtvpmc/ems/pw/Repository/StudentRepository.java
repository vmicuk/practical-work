package lt.vtvpmc.ems.pw.Repository;

import lt.vtvpmc.ems.pw.entities.Student;

import java.util.Date;
import java.util.List;

/**
 * Created by Vitalij.
 */
public interface StudentRepository {
    public void create(Student student);

    public void save(Student student);

    public void update(Student student);

    public void delete(Student student);

    public List<Student> findAll();

    public List<Student> findByNotNull(String firstName, String lastName, Date dateOfBirth);

}


