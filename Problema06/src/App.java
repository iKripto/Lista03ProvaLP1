import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite as tres distancias:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        // Instancia o objeto e obtém resultado
        LancamentoDardo dardo = new LancamentoDardo(d1, d2, d3);
        double maior = dardo.maiorDistancia();

        // Saída
        System.out.printf("MAIOR DISTANCIA = %.2f%n", maior);

        sc.close();
    }
}
