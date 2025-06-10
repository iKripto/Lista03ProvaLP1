public class CalcularMedia {
    private double nota1;
    private double nota2;

    public CalcularMedia(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularNotaFinal() {
        return nota1 + nota2;
    }

    public boolean isReprovado() {
        return calcularNotaFinal() < 60.0;
    }
}
