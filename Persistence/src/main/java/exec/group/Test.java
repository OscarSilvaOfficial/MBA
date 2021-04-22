package exec.group;

import model.Group;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Test {
    public static void main(String[] args) {
        EntityManager manager = Persistence.createEntityManagerFactory("test").createEntityManager();

        Group group = new Group("grupoteste");

        manager.getTransaction().begin();
        manager.persist(group);
        manager.getTransaction().commit();

        manager.close();
    }
}
