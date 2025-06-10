public class CalcularBhaskara {
    private double a;
    private double b;
    private double c;

    public CalcularBhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean temRaizesReais() {
        return calcularDelta() >= 0;
    }

    private double calcularDelta() {
        return b * b - 4 * a * c;
    }

    public double calcularX1() {
        double delta = calcularDelta();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double calcularX2() {
        double delta = calcularDelta();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}