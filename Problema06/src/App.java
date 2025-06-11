import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double medida = sc.nextDouble();

        MedidorGlicose medidor = new MedidorGlicose(medida);
        String resultado = medidor.classificar();

        System.out.println("Classificacao: " + resultado);

        sc.close();
    }
}
