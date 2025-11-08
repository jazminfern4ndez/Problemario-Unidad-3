public class SeleccionDeFutbol {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public SeleccionDeFutbol(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println(nombre + " " + apellido + " está concentrándose con la selección.");
    }

    public void viajar() {
        System.out.println(nombre + " " + apellido + " está viajando con la selección.");
    }
}
