public class ProductoFresco extends Producto {
    private int añoEnvasado;

    public ProductoFresco(int numeroLote, String paisOrigen, int añoEnvasado) {
        super(numeroLote, paisOrigen);
        this.añoEnvasado = añoEnvasado;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Año de envasado: " + añoEnvasado);
    }
}
