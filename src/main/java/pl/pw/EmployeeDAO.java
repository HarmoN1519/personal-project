package pl.pw;

import org.hibernate.annotations.Entity;

import javax.persistence.EntityManager;
import java.time.LocalDate;

public class EmployeeDAO {

    protected static void saveEmployee(EntityManager entityManager) {
        Employee employee = new Employee(
                "Patryk",
                "Nowak",
                95053108911L
        );

        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
    }

    protected static void getEmployee(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class, 1L);
        System.out.println(employee.toString());
        entityManager.getTransaction().commit();
    }

    protected static void updateEmployee(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class, 1L);
        employee.setName("Tomek");
        entityManager.getTransaction().commit();
    }

    protected static void refreshEmployee(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class, 1L);
        employee.setName("Stanisław");
        employee.setSurname("Nowak");
        System.out.println(employee.toString());
        entityManager.refresh(employee);
        System.out.println(employee.toString());
        entityManager.getTransaction().commit();
    }

    protected static void deleteEmployee(EntityManager entityManager) {
        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class, 1L);
        entityManager.remove(employee);
        entityManager.getTransaction().commit();
    }
}
