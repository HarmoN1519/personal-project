package pl.pw;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerService {

    protected static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa.hibernate");

    public static javax.persistence.EntityManager getEntityManager() {

        return
    }
}





