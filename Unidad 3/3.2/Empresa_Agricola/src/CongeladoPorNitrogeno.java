public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;

    public CongeladoPorNitrogeno(int numeroLote, String paisOrigen, double temperatura, String metodo) {
        super(numeroLote, paisOrigen, temperatura);
        this.metodoCongelacion = metodo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Método de congelación: " + metodoCongelacion);
    }
}
