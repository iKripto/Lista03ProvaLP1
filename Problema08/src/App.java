import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().charAt(0);
        if (escala == 'C' || escala == 'c') {
            System.out.print("Digite a temperatura em Celsius: ");
        } else {
            System.out.print("Digite a temperatura em Fahrenheit: ");
        }
        double temperatura = sc.nextDouble();

        ConversorTemperatura conversor = new ConversorTemperatura(escala, temperatura);
        double resultado = conversor.converter();

        System.out.printf("Temperatura equivalente em %s: %.2f%n", 
                          conversor.getEscalaConvertida(), resultado);

        sc.close();
    }
}