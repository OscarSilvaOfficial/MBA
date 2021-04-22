package exec.user;

import model.Permission;
import model.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Test {

    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("test").createEntityManager();
        Permission permission = entityManager.find(Permission.class, 1);

        // SELECT
//        User user = entityManager.find(User.class, 16);
//        System.out.println(user.getAge());


        // INSERT
        User user = new User();
        user.setFirstName("Oscar");
        user.setLastName("da Silva");
        user.setAge(23);
        user.setPermission(permission);

        // ALTER
        //User user = entityManager.find(User.class,7);
        //user.setLastName("blabla");

        entityManager.getTransaction().begin();
        entityManager.persist(user); // INSERT e ALTER
        // entityManager.remove(user); # DELETE
        entityManager.getTransaction().commit();

        // Close conn
        entityManager.close();
    }

}
