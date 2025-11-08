import java.util.Scanner;

public class Triangulo extends Figura {
    private float base;
    private float altura;

    public Triangulo() {
        super("Triángulo");
    }

    @Override
    public void pide_Datos() throws ExceptionFigura {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        base = sc.nextFloat();
        System.out.print("Ingrese la altura del triángulo: ");
        altura = sc.nextFloat();

        if (altura > base) {
            throw new ExceptionFigura("La base debe ser mayor o igual a la altura");
        }
    }

    @Override
    public void imprime_Area() {
        float area = (base * altura) / 2;
        System.out.println("Área del Triángulo = " + area);
    }
}
