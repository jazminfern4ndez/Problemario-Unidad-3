public class Malvado extends Villano {
    private boolean extraterrestre;

    public Malvado(int edad, String nombre, boolean extraterrestre) {
        super(edad, nombre);
        this.extraterrestre = extraterrestre;
    }

    public boolean isExtraterrestre() {
        return extraterrestre;
    }
}
