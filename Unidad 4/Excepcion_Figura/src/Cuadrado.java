import java.util.Scanner;

public class Cuadrado extends Figura {
    private float lado;

    public Cuadrado() {
        super("Cuadrado");
    }

    @Override
    public void pide_Datos() throws ExceptionFigura {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = sc.nextFloat();

        if (lado <= 5) {
            throw new ExceptionFigura("El lado debe ser mayor a 5");
        }
    }

    @Override
    public void imprime_Area() {
        float area = lado * lado;
        System.out.println("Área del Cuadrado = " + area);
    }
}
