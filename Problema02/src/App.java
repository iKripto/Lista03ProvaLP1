import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Coeficiente 'a' nao pode ser zero em uma equacao do segundo grau.");
            sc.close();
            return;
        }

        CalcularBhaskara bhaskara = new CalcularBhaskara(a, b, c);

        if (bhaskara.temRaizesReais()) {
            double x1 = bhaskara.calcularX1();
            double x2 = bhaskara.calcularX2();

            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        } else {
            System.out.println("Esta equacao nao possui raizes reais");
        }

        sc.close();
    }
}