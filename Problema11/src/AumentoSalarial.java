public class AumentoSalarial {
    private double salarioAtual;

    public AumentoSalarial(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double getNovoSalario() {
        return salarioAtual + getAumento();
    }

    public double getAumento() {
        return salarioAtual * getPorcentagem() / 100.0;
    }

    public int getPorcentagem() {
        if (salarioAtual <= 1000.00) {
            return 20;
        } else if (salarioAtual <= 3000.00) {
            return 15;
        } else if (salarioAtual <= 8000.00) {
            return 10;
        } else {
            return 5;
        }
    }
}