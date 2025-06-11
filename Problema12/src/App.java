import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Hora final: ");
        int fim = sc.nextInt();

        DuracaoJogo jogo = new DuracaoJogo(inicio, fim);
        int duracao = jogo.calcularDuracao();

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
