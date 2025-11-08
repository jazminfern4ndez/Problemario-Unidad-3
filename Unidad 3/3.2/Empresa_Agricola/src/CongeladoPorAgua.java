public class CongeladoPorAgua extends ProductoCongelado {
    private double salinidad;

    public CongeladoPorAgua(int numeroLote, String paisOrigen, double temperatura, double salinidad) {
        super(numeroLote, paisOrigen, temperatura);
        this.salinidad = salinidad;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Salinidad: " + salinidad + " g/L");
    }
}
