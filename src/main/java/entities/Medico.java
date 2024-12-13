package entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
@DiscriminatorValue("4")
public class Medico extends Persona{
//    private List<Citas> historialVisitas;
//    private List<Citas> historialOperaciones;
//    private Consulta consultaAsignada;

//    public List<Citas> getHistorialVisitas() {
//        return historialVisitas;
//    }

//    public void setHistorialVisitas(List<Citas> historialVisitas) {
//        this.historialVisitas = historialVisitas;
//    }

//    public List<Citas> getHistorialOperaciones() {
//        return historialOperaciones;
//    }

//    public void setHistorialOperaciones(List<Citas> historialOperaciones) {
//        this.historialOperaciones = historialOperaciones;
//    }

//    public Consulta getConsultaAsignada() {
//        return consultaAsignada;
//    }

//    public void setConsultaAsignada(Consulta consultaAsignada) {
//        this.consultaAsignada = consultaAsignada;
//    }

//    @Override
//    public String toString() {
//        return "Medico{" +
//                "historialVisitas=" + historialVisitas +
//                ", historialOperaciones=" + historialOperaciones +
//                ", consultaAsignada=" + consultaAsignada +
//                '}';
//    }
}
