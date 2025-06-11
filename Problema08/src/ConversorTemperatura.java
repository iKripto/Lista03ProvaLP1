public class ConversorTemperatura {
    private char escala;
    private double temperatura;

    public ConversorTemperatura(char escala, double temperatura) {
        this.escala = Character.toUpperCase(escala);
        this.temperatura = temperatura;
    }

    public double converter() {
        if (escala == 'F') {
            return (5.0 / 9.0) * (temperatura - 32.0);
        } else { 
            return (9.0 / 5.0) * temperatura + 32.0;
        }
    }

    public String getEscalaConvertida() {
        return (escala == 'F') ? "Celsius" : "Fahrenheit";
    }
}