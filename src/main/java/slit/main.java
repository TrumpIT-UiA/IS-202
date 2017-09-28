package slit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

class main {

    public static void main(String[] args) {
        //Oppretter et Entity manager factory med databasen definert i META-INF\persistence.xml (SlitBase)
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SlitBase");
        //Oppretter en EntityManager ut ifra EntityManager fabrikken, slik at fabrikken tar hånd om denne.
        EntityManager manager = emfactory.createEntityManager();

        //Lager en transaction-variabel som vi bruker senere
        EntityTransaction transaction = null;

        //Lager en transaction utifra EntityManageren og starter den.
        transaction = manager.getTransaction();
        transaction.begin();

            //Oppretter et nytt student-objekt og gjør det klart for lagring (persist) i databasen
            Student test = new Student("javel", "sedetveien 9");
            manager.persist(test);

        //Comitter dataen til databasen og lukker fabrikken + manageren
        transaction.commit();
        manager.close();
        emfactory.close();
    }
}
