package entities;

public class PLimpieza extends Persona{
    private Planta plantaAsignada;

    public Planta getPlantaAsignada() {
        return plantaAsignada;
    }

    public void setPlantaAsignada(Planta plantaAsignada) {
        this.plantaAsignada = plantaAsignada;
    }

    @Override
    public String toString() {
        return "PLimpieza{" +
                "plantaAsignada=" + plantaAsignada +
                '}';
    }
}
