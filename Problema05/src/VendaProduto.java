public class VendaProduto {
    private double precoUnitario;
    private int quantidade;
    private double dinheiroRecebido;

    public VendaProduto(double precoUnitario, int quantidade, double dinheiroRecebido) {
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public double calcularTotal() {
        return precoUnitario * quantidade;
    }

    public boolean dinheiroSuficiente() {
        return dinheiroRecebido >= calcularTotal();
    }

    public double calcularTrocoOuFalta() {
        return Math.abs(dinheiroRecebido - calcularTotal());
    }
}