import entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Juan Perez");
        persona.setDNI("12345678A");
        persona.setNSS("12345678");

        Medico medico = new Medico();
        medico.setNombre("Dr. House");
        medico.setDNI("87654321B");
        medico.setNSS("87654321");

        Enfermero enfermero = new Enfermero();
        enfermero.setNombre("Nurse Ratched");
        enfermero.setDNI("12348765C");
        enfermero.setNSS("12348765");

        Celadores celadores = new Celadores();
        celadores.setNombre("John Coffey");
        celadores.setDNI("12345678D");
        celadores.setNSS("12345678");

        PLimpieza pLimpieza = new PLimpieza();
        pLimpieza.setNombre("Dolores Claiborne");
        pLimpieza.setDNI("12345678E");
        pLimpieza.setNSS("12345678");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
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
