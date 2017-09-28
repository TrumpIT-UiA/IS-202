package slit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

class slit {

    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SlitBase");
        EntityManager manager = emfactory.createEntityManager();
        EntityTransaction transaction = null;
        transaction = manager.getTransaction();
        transaction.begin();
        Student test = new Student("javel", "sedetveien 9");
        manager.persist(test);
        transaction.commit();
        manager.close();
        emfactory.close();
    }
}
