package entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Celadores extends Persona{
//    private Enum<Turnos> turno;

//    public Enum<Turnos> getTurno() {
//        return turno;
//    }

//    public void setTurno(Enum<Turnos> turno) {
//        this.turno = turno;
//    }

//    @Override
//    public String toString() {
//        return "Celadores{" +
//                "turno=" + turno +
//                '}';
//    }

}
