public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(7, 11, 2025);
        Hora hora = new Hora(14, 30);

        Compra compra1 = new Compra("TX123", fecha, hora);
        compra1.mostrarInfo();
    }
}
