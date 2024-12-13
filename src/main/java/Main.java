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
        persona.setDireccion(new Direccion("Calle Falsa", 123, "12345", "1º"));


        Medico medico = new Medico();
        medico.setNombre("Dr. House");
        medico.setDNI("87654321B");
        medico.setNSS("87654321");
        medico.setDireccion(new Direccion("Calle Noria", 23, "33345", "2º"));

        Enfermero enfermero = new Enfermero();
        enfermero.setNombre("Nurse Ratched");
        enfermero.setDNI("12348765C");
        enfermero.setNSS("12348765");
        enfermero.setDireccion(new Direccion("Calle Real", 3, "54345", "3º"));

        Celadores celadores = new Celadores();
        celadores.setNombre("John Coffey");
        celadores.setDNI("12345678D");
        celadores.setNSS("12345678");
        celadores.setDireccion(new Direccion("Calle Mayor", 13, "12345", "4º"));


        PLimpieza pLimpieza = new PLimpieza();
        pLimpieza.setNombre("Dolores Claiborne");
        pLimpieza.setDNI("12345678E");
        pLimpieza.setNSS("12345678");
        pLimpieza.setDireccion(new Direccion("Calle Nueva", 33, "12345", "5º"));


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("defau");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(persona);
        entityManager.persist(medico);
        entityManager.persist(enfermero);
        entityManager.persist(celadores);
        entityManager.persist(pLimpieza);

        persona.addTelefonos("123456789");
        persona.addTelefonos("987654321");
        medico.addTelefonos("533456789");
        medico.addTelefonos("987654533");
        enfermero.addTelefonos("123456543");
        enfermero.addTelefonos("987654321");
        celadores.addTelefonos("234734789");
        celadores.addTelefonos("987554321");
        pLimpieza.addTelefonos("129877589");

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
