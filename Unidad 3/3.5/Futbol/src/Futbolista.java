public class Futbolista extends SeleccionDeFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(nombre + " " + apellido + " (Dorsal " + dorsal + ") está jugando como " + demarcacion + ".");
    }

    public void entrenar() {
        System.out.println(nombre + " " + apellido + " está entrenando como " + demarcacion + ".");
    }
}
