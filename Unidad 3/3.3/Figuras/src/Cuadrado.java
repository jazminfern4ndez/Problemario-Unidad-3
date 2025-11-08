import java.util.Scanner;

public class Cuadrado extends Figura {
    private float lado;

    public Cuadrado() {
        super("Cuadrado");
    }

    @Override
    public void pide_Datos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = sc.nextFloat();
    }

    @Override
    public void imprime_Area() {
        float area = lado * lado;
        System.out.println("Área del Cuadrado = " + area);
    }

    @Override
    public String toString() {
        return super.toString() + " | Lado: " + lado;
    }
}