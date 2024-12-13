package entities;

public class Planta {
    private int idPlanta;

    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "idPlanta=" + idPlanta +
                '}';
    }
}
