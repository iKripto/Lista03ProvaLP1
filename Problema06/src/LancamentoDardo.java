public class LancamentoDardo {
    private double tentativa1;
    private double tentativa2;
    private double tentativa3;

    public LancamentoDardo(double tentativa1, double tentativa2, double tentativa3) {
        this.tentativa1 = tentativa1;
        this.tentativa2 = tentativa2;
        this.tentativa3 = tentativa3;
    }

    public double maiorDistancia() {
        double maior = tentativa1;

        if (tentativa2 > maior) {
            maior = tentativa2;
        }

        if (tentativa3 > maior) {
            maior = tentativa3;
        }

        return maior;
    }
}
