package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_persona", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("persona")
public class Persona {
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Id
    @Column(name = "DNI", nullable = false, length = 9)
    private String DNI;

    @Column(name = "NSS", nullable = false, length = 8)
    private String NSS;
//    private Direccion direccion;
//    private List<String> telefono;

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

//    public Direccion getDireccion() {
//        return direccion;
//    }
//
//    public void setDireccion(Direccion direccion) {
//        this.direccion = direccion;
//    }
//
//    public List<String> getTelefono() {
//        return telefono;
//    }
//
//    public void setTelefono(List<String> telefono) {
//        this.telefono = telefono;
//    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", NSS='" + NSS + '\'' +
//                ", direccion=" + direccion +
//                ", telefono=" + telefono +
                '}';
    }
}
