import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        CalcularMedia media = new CalcularMedia(nota1, nota2);

        double notaFinal = media.calcularNotaFinal();
        System.out.printf("NOTA FINAL = %.1f%n", notaFinal);

        if (media.isReprovado()) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
