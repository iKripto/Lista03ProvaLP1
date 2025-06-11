public class Lanchonete {
    private int codigo;
    private int quantidade;

    public Lanchonete(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        double preco = 0.0;

        switch (codigo) {
            case 1: preco = 5.00; break;
            case 2: preco = 3.50; break;
            case 3: preco = 4.80; break;
            case 4: preco = 8.90; break;
            case 5: preco = 7.32; break;
            default: preco = 0.0;
        }

        return preco * quantidade;
    }
}