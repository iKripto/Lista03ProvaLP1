public class MedidorGlicose {
    private double glicose;

    public MedidorGlicose(double glicose) {
        this.glicose = glicose;
    }

    public String classificar() {
        if (glicose <= 100.0) {
            return "normal";
        } else if (glicose <= 140.0) {
            return "elevado";
        } else {
            return "diabetes";
        }
    }
}