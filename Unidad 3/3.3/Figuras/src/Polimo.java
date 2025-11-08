public class Polimo {
    public static void Imprime(Figura f) {
        f.imprime_Area();
    }

    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        figuras[0] = new Cuadrado();
        figuras[1] = new Triangulo();

        for (Figura f : figuras) {
            System.out.println("\nCreando un " + f.toString());
            f.pide_Datos();      // Polimorfismo: cada figura pide sus datos
            Imprime(f);          // Polimorfismo: cada figura imprime su área
        }
    }
}