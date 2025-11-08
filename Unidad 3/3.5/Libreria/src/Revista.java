public class Revista extends Publicacion {
    private int numerosPorAnio;
    private long circulacion;

    public Revista() {
        super();
        this.numerosPorAnio = 0;
        this.circulacion = 0;
    }

    public void fijarNumerosAnio(int n) {
        this.numerosPorAnio = n;
    }

    public void fijarCirculacion(long n) {
        this.circulacion = n;
    }

    @Override
    public String toString() {
        return "Revista Literaria\nNúmeros por año: " + numerosPorAnio +
                "\nCirculación: " + circulacion + "\nEditor: " + editor;
    }
}
