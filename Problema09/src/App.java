import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        int codigo = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        Lanchonete pedido = new Lanchonete(codigo, quantidade);
        double total = pedido.calcularTotal();

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
