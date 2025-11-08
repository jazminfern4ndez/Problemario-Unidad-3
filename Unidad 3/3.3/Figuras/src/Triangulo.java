import java.util.Scanner;

public class Triangulo extends Figura {
    private float base;
    private float altura;

    public Triangulo() {
        super("Triángulo");
    }

    @Override
    public void pide_Datos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        base = sc.nextFloat();
        System.out.print("Ingrese la altura del triángulo: ");
        altura = sc.nextFloat();
    }

    @Override
    public void imprime_Area() {
        float area = (base * altura) / 2;
        System.out.println("Área del Triángulo = " + area);
    }

    @Override
    public String toString() {
        return super.toString() + " | Base: " + base + ", Altura: " + altura;
    }
}