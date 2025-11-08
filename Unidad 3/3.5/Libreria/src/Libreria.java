import java.util.ArrayList;

public class Libreria {
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        Libro libro1 = new Libro();
        libro1.nombrarEditor("Editorial Planeta");
        libro1.ponerAutor("Johana Marcus");
        libro1.ponerTitulo("Antes de diciembre");
        libro1.ponerISBN("978-84-08-24157-1");

        Libro libro2 = new Libro();
        libro2.nombrarEditor("Editorial Planeta");
        libro2.ponerAutor("Johana Marcus");
        libro2.ponerTitulo("Después de diciembre");
        libro2.ponerISBN("978-84-08-24158-8");

        Libro libro3 = new Libro();
        libro3.nombrarEditor("Editorial Planeta");
        libro3.ponerAutor("Johana Marcus");
        libro3.ponerTitulo("Tres meses");
        libro3.ponerISBN("978-84-08-24159-5");

        Libro libro4 = new Libro();
        libro4.nombrarEditor("Editorial Planeta");
        libro4.ponerAutor("Johana Marcus");
        libro4.ponerTitulo("Luces de febrero");
        libro4.ponerISBN("978-84-08-24160-1");

        
        Revista revista = new Revista();
        revista.nombrarEditor("Editorial Literaria MX");
        revista.fijarNumerosAnio(12);
        revista.fijarCirculacion(8000);

        // Agregar a la lista
        publicaciones.add(libro1);
        publicaciones.add(libro2);
        publicaciones.add(libro3);
        publicaciones.add(libro4);
        publicaciones.add(revista);

        System.out.println("=== LIBRERÍA 'MESES A TU LADO' ===\n");

        for (int i = 0; i < publicaciones.size(); i++) {
            System.out.println(publicaciones.get(i).toString());
            System.out.println("-----------------------------------\n");
        }
    }
}
