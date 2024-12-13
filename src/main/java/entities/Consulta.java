package entities;

import java.util.List;

public class Consulta {
    private long id;
    private List<Medico> medicos;
    private List<Enfermero> enfermero;
    private Planta planta;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Enfermero> getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(List<Enfermero> enfermero) {
        this.enfermero = enfermero;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", medicos=" + medicos +
                ", enfermero=" + enfermero +
                ", planta=" + planta +
                '}';
    }
}
