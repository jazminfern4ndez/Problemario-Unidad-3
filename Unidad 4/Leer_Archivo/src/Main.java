import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LectorArchivo lector = new LectorArchivo();

        System.out.print("Introduce el nombre del archivo a leer (por ejemplo datos.txt): ");
        String nombreArchivo = sc.nextLine();

        lector.leerArchivo(nombreArchivo);

        sc.close();
    }
}
