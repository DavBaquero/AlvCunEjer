import entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setDNI("12345678A");
        persona.setNSS("12345678901");

        PLimpieza pLimpieza = new PLimpieza();
        pLimpieza.setNombre("Pedro");
        pLimpieza.setDNI("87654321B");
        pLimpieza.setNSS("09876543210");

        Celadores celadores = new Celadores();
        celadores.setNombre("Pablo");
        celadores.setDNI("12348765C");
        celadores.setNSS("12345678901");

        Enfermero enfermero = new Enfermero();
        enfermero.setNombre("Paco");
        enfermero.setDNI("12345678D");
        enfermero.setNSS("12345678901");

        Medico medico = new Medico();
        medico.setNombre("Pepe");
        medico.setDNI("12345678E");
        medico.setNSS("12345678901");

        EntityManagerFactory entityManagerFactory = jakarta.persistence.Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(persona);
        entityManager.persist(pLimpieza);
        entityManager.persist(celadores);
        entityManager.persist(enfermero);
        entityManager.persist(medico);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
