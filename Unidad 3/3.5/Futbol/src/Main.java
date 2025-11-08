import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SeleccionDeFutbol> seleccion = new ArrayList<>();

        seleccion.add(new Futbolista(1, "Lionel", "Messi", 37, 10, "Delantero"));
        seleccion.add(new Entrenador(2, "Luis", "Enrique", 54, "ESP-1234"));
        seleccion.add(new Masajista(3, "Carlos", "Gómez", 45, "Fisioterapeuta Deportivo", 15));

        System.out.println("*** SELECCIÓN DE FÚTBOL ***");

        for (int i = 0; i < seleccion.size(); i++) {
            seleccion.get(i).concentrarse();
            seleccion.get(i).viajar();
            System.out.println();
        }

        // Acciones específicas según el tipo
        for (int i = 0; i < seleccion.size(); i++) {
            SeleccionDeFutbol s = seleccion.get(i);

            if (s instanceof Futbolista) {
                ((Futbolista) s).entrenar();
                ((Futbolista) s).jugarPartido();
            } else if (s instanceof Entrenador) {
                ((Entrenador) s).dirigirEntrenamiento();
                ((Entrenador) s).dirigirPartido();
            } else if (s instanceof Masajista) {
                ((Masajista) s).darMasaje();
            }
            System.out.println();
        }
    }
}
