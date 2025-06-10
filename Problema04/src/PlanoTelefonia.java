public class PlanoTelefonia {
    private int minutos;
    private static final double VALOR_BASICO = 50.0;
    private static final int FRANQUIA = 100;
    private static final double VALOR_POR_MINUTO_EXCEDENTE = 2.0;

    public PlanoTelefonia(int minutos) {
        this.minutos = minutos;
    }

    public double calcularValor() {
        if (minutos <= FRANQUIA) {
            return VALOR_BASICO;
        } else {
            int excedente = minutos - FRANQUIA;
            return VALOR_BASICO + excedente * VALOR_POR_MINUTO_EXCEDENTE;
        }
    }
}