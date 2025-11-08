public class Entrenador extends SeleccionDeFutbol {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(nombre + " " + apellido + " (ID Federación: " + idFederacion + ") está dirigiendo el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " " + apellido + " está dirigiendo el entrenamiento.");
    }
}
