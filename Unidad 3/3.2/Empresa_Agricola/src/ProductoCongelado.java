public class ProductoCongelado extends Producto {
    private double temperaturaMantenimiento;

    public ProductoCongelado(int numeroLote, String paisOrigen, double temperaturaMantenimiento) {
        super(numeroLote, paisOrigen);
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Temperatura: " + temperaturaMantenimiento + "°C");
    }
}
