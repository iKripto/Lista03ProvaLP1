import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de X: ");
        double x = sc.nextDouble();

        System.out.print("Valor de Y: ");
        double y = sc.nextDouble();

        Coordenada ponto = new Coordenada(x, y);
        String localizacao = ponto.verificarLocalizacao();

        System.out.println(localizacao);

        sc.close();
    }
}