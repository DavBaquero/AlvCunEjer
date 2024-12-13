import entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setDNI("12345678R");
        persona.setNombre("Juan");
        persona.setNSS("12345678");

        Medico medico = new Medico();
        medico.setDNI("15645678A");
        medico.setNombre("Felipe");
        medico.setNSS("15645678");

        Enfermero enfermero = new Enfermero();
        enfermero.setDNI("32145678T");
        enfermero.setNombre("Sergio");
        enfermero.setNSS("32145678");

        Celadores celadores = new Celadores();
        celadores.setDNI("65445678Y");
        celadores.setNombre("Luis");
        celadores.setNSS("65445678");

        PLimpieza pLimpieza = new PLimpieza();
        pLimpieza.setDNI("98745678U");
        pLimpieza.setNombre("Maria");
        pLimpieza.setNSS("98745678");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defau");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(persona);
        entityManager.persist(medico);
        entityManager.persist(enfermero);
        entityManager.persist(celadores);
        entityManager.persist(pLimpieza);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
