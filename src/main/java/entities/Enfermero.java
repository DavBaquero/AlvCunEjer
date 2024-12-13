package entities;

public class Enfermero extends Persona{
    private Enum<Turnos> turno;
    private Planta planta;

    public Enum<Turnos> getTurno() {
        return turno;
    }

    public void setTurno(Enum<Turnos> turno) {
        this.turno = turno;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    @Override
    public String toString() {
        return "Enfermero{" +
                "turno=" + turno +
                ", planta=" + planta +
                '}';
    }
}
