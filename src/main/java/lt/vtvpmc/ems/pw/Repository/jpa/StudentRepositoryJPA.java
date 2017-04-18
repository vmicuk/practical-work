package lt.vtvpmc.ems.pw.Repository.jpa;

import lt.vtvpmc.ems.pw.Repository.StudentRepository;
import lt.vtvpmc.ems.pw.entities.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

/**
 * Created by Vitalij.
 */
public class StudentRepositoryJPA implements StudentRepository {
    static final Logger log = LoggerFactory.getLogger(StudentRepositoryJPA.class);
    private EntityManagerFactory entityManagerFactory;

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    private EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public void save(Student student) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            if (!entityManager.contains(student))
                student = entityManager.merge(student);
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Student student) {
        EntityManager entityManager = getEntityManager();
        try {
            entityManager.getTransaction().begin();
            student = entityManager.merge(student);
            entityManager.remove(student);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<Student> findAll() {
        EntityManager entityManager = getEntityManager();
        try {
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<Student> cq = cb.createQuery(Student.class);
            Root<Student> root = cq.from(Student.class);
            cq.select(root);
            TypedQuery<Student> q = entityManager.createQuery(cq);
            return q.getResultList();
        } finally {
            entityManager.close();
        }

    }

    @Override
    public List<Student> findByNotNull(String firstName, String lastName, Date dateOfBirth) {

        return null;
    }
}
