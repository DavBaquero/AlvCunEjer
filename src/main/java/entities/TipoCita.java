package entities;

public enum TipoCita {
    OPERACION ("Operación"),
    VISITA ("Visita");

    private String cita;

    TipoCita(String cita) {
        this.cita = cita;
    }

    public String getCita() {
        return cita;
    }

    public static TipoCita fromString(String text) {
        for (TipoCita b : TipoCita.values()) {
            if (b.cita.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return cita;
    }

}
