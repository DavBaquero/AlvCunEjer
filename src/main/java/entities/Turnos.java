package entities;

public enum Turnos {
    MANHANA ("Mañana"),
    TARDE ("Tarde"),
    NOCHE ("Noche");

    private String turno;

    Turnos(String turno) {
        this.turno = turno;
    }

    public String getCita() {
        return turno;
    }

    public static Turnos fromString(String text) {
        for (Turnos b : Turnos.values()) {
            if (b.turno.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return turno;
    }
}
