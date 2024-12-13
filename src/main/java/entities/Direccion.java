package entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion {
    private String calle;
    private int numero;
    private String cp;
    private String piso;

    public Direccion(String calle, int numero, String cp, String piso) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.piso = piso;
    }

    public Direccion() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                ", cp='" + cp + '\'' +
                ", piso='" + piso + '\'' +
                '}';
    }
}
