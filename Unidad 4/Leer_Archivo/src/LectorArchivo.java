import java.io.*;

public class LectorArchivo {

    public void leerArchivo(String nombreArchivo) {
        try {
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);
            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no se encontró.");
        }
        catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
