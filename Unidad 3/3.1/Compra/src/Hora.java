public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public String mostrarHora() {
        return hora + ":" + (minuto < 10 ? "0" + minuto : minuto);
    }
}
