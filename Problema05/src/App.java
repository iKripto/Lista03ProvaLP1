import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double recebido = sc.nextDouble();

        VendaProduto venda = new VendaProduto(preco, quantidade, recebido);

        if (venda.dinheiroSuficiente()) {
            System.out.printf("TROCO = %.2f%n", venda.calcularTrocoOuFalta());
        } else {
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", venda.calcularTrocoOuFalta());
        }

        sc.close();
    }
}