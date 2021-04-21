package exec.user;

import model.user.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // SELECT
//        User user = entityManager.find(User.class, 16);
//        System.out.println(user.getAge());


        // INSERT
//        User user = new User();
//        user.setFirstName("TESTE");
//        user.setLastName("da Silva");
//        user.setAge(23);

        // ALTER
        User user = entityManager.find(User.class,7);
        user.setLastName("blabla'");

        entityManager.getTransaction().begin();
        entityManager.persist(user); // INSERT e ALTER
        // entityManager.remove(user); # DELETE
        entityManager.getTransaction().commit();

        // Close conn
        entityManager.close();
        entityManagerFactory.close();
    }

}
