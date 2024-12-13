package entities;

import java.time.LocalDate;

public class Citas {
    private long id;
    private String descripcion;
    private String fecha;
    private String DNIMedico;
    private Enum<TipoCita> tipocita;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDNIMedico() {
        return DNIMedico;
    }

    public void setDNIMedico(String DNIMedico) {
        this.DNIMedico = DNIMedico;
    }

    public Enum<TipoCita> getTipocita() {
        return tipocita;
    }

    public void setTipocita(Enum<TipoCita> tipocita) {
        this.tipocita = tipocita;
    }

    @Override
    public String toString() {
        return "Citas{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", DNIMedico='" + DNIMedico + '\'' +
                ", tipocita=" + tipocita +
                '}';
    }
}
