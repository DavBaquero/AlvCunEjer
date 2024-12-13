package entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "plimpieza")
@PrimaryKeyJoinColumn(name = "DNI")
@DiscriminatorValue("personal de limpieza")
public class PLimpieza extends Persona{
//    private Planta plantaAsignada;
//
//    public Planta getPlantaAsignada() {
//        return plantaAsignada;
//    }
//
//    public void setPlantaAsignada(Planta plantaAsignada) {
//        this.plantaAsignada = plantaAsignada;
//    }
//
//    @Override
//    public String toString() {
//        return "PLimpieza{" +
//                "plantaAsignada=" + plantaAsignada +
//                '}';
//    }
}
