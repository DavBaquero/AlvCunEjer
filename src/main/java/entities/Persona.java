package entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
public class Persona {

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Id
    @Column(name = "DNI", nullable = false, length = 9)
    private String DNI;

    @Column(name = "NSS", nullable = false, length = 8)
    private String NSS;


    @Embedded
    private Direccion direccion;

    @ElementCollection
    @CollectionTable(name = "telefonos", joinColumns = @JoinColumn(name = "DNI"),
            foreignKey = @ForeignKey(name = "FK_telefono_persona"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"DNI", "telefono"},
                    name = "telefono_persona_uk"))
    @Column(name = "telefono", nullable = false, length = 9)
    private List<String> listaTelefonos = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<String> getListaTelefonos() {
        return listaTelefonos;
    }

    public void setListaTelefonos(List<String> telefono) {
        this.listaTelefonos = telefono;
    }

    public void addTelefonos(String telefono) {
        this.listaTelefonos.add(telefono);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", NSS='" + NSS + '\'' +
                ", direccion=" + direccion +
                ", telefono=" + listaTelefonos +
                '}';
    }
}
