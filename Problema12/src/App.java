public class DuracaoJogo {
    private int horaInicial;
    private int horaFinal;

    public DuracaoJogo(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public int calcularDuracao() {
        if (horaInicial == horaFinal) {
            return 24;
        } else if (horaInicial < horaFinal) {
            return horaFinal - horaInicial;
        } else {
            return 24 - horaInicial + horaFinal;
        }
    }
}