public class Polimo {

    public static void Imprime(Figura f) {
        f.imprime_Area();
    }

    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        figuras[0] = new Cuadrado();
        figuras[1] = new Triangulo();

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("\nCreando un " + figuras[i].toString());
            try {
                figuras[i].pide_Datos();  // Puede lanzar ExceptionFigura
                Imprime(figuras[i]);
            } catch (ExceptionFigura e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
