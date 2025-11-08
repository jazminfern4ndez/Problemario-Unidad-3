public class Compra {
    private String clave;
    private Fecha fecha; // Composición
    private Hora hora;   // Composición

    public Compra(String clave, Fecha fecha, Hora hora) {
        this.clave = clave;
        this.fecha = fecha;
        this.hora = hora;
    }

    public void mostrarInfo() {
        System.out.println("Compra #" + clave);
        System.out.println("Fecha: " + fecha.mostrarFecha());
        System.out.println("Hora: " + hora.mostrarHora());
    }
}
