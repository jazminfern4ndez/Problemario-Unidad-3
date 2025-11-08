public class Producto {
    private int numeroLote;
    private String paisOrigen;

    public Producto(int numeroLote, String paisOrigen) {
        this.numeroLote = numeroLote;
        this.paisOrigen = paisOrigen;
    }

    public void mostrarInfo() {
        System.out.println("Lote: " + numeroLote + " | País: " + paisOrigen);
    }
}
