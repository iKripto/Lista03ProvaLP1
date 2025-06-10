import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        PlanoTelefonia plano = new PlanoTelefonia(minutos);
        double valorFinal = plano.calcularValor();

        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);

        sc.close();
    }
}