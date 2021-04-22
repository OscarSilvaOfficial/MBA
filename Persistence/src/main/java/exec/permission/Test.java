package exec.permission;

import model.Permission;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Test {

    public static void main(String[] args) {
        EntityManager manager = Persistence.createEntityManagerFactory("test").createEntityManager();

        Permission permission = new Permission("admin");

        manager.getTransaction().begin();
        manager.persist(permission);
        manager.getTransaction().commit();

        manager.close();
    }

}
