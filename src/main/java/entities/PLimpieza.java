package entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("3")
public class PLimpieza extends Persona{
//    private Planta plantaAsignada;

//    public Planta getPlantaAsignada() {
//        return plantaAsignada;
//    }

//    public void setPlantaAsignada(Planta plantaAsignada) {
//        this.plantaAsignada = plantaAsignada;
//    }

//    @Override
//    public String toString() {
//        return "PLimpieza{" +
//                "plantaAsignada=" + plantaAsignada +
//                '}';
//    }
}
