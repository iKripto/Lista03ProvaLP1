public class Multiplos {
    private int numero1;
    private int numero2;

    public Multiplos(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public boolean saoMultiplos() {
        return (numero1 % numero2 == 0) || (numero2 % numero1 == 0);
    }
}