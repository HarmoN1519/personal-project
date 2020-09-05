package pl.pw;

import javax.persistence.EntityManagerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

  //      EmployeeDAO.saveEmployee(entityManager);
        EmployeeDAO.getEmployee(EntityManagerService.getEntityManager());
//        EmployeeDAO.updateEmployee(entityManager);
//        EmployeeDAO.refreshEmployee(entityManager);
//        EmployeeDAO.deleteEmployee(entityManager);

        EntityManagerFactory.close();
    }
}
