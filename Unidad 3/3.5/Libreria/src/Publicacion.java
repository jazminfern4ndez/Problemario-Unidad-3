import java.util.GregorianCalendar;

public class Publicacion {
    protected String editor;
    protected GregorianCalendar fecha;

    public Publicacion() {
        this.editor = "";
        this.fecha = new GregorianCalendar();
    }

    public void nombrarEditor(String nomE) {
        this.editor = nomE;
    }

    public void ponerFecha() {
        this.fecha = new GregorianCalendar();
    }

    public String getEditor() {
        return editor;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }
}
