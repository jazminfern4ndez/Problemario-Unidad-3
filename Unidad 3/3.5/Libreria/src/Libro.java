public class Libro extends Publicacion {
    private String isbn;
    private String autor;
    private String titulo;

    public Libro() {
        super();
        this.isbn = "";
        this.autor = "";
        this.titulo = "";
    }

    public void ponerISBN(String nota) {
        this.isbn = nota;
    }

    public void ponerAutor(String nombre) {
        this.autor = nombre;
    }

    public void ponerTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nEditor: " + editor;
    }
}
