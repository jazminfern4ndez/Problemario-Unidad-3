public class ProductoRefrigerado extends Producto {
    private String codigoSupervision;

    public ProductoRefrigerado(int numeroLote, String paisOrigen, String codigoSupervision) {
        super(numeroLote, paisOrigen);
        this.codigoSupervision = codigoSupervision;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Código de supervisión: " + codigoSupervision);
    }
}
