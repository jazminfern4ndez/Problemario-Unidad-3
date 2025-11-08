public class Masajista extends SeleccionDeFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " " + apellido + " está dando un masaje. (" + titulacion + ", " + aniosExperiencia + " años de experiencia)");
    }
}
