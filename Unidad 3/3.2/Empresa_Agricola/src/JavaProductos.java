import java.util.ArrayList;

public class JavaProductos {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        // Agregar productos frescos
        productos.add(new ProductoFresco(101, "México", 2025));
        productos.add(new ProductoFresco(102, "Chile", 2024));

        // Agregar productos refrigerados
        productos.add(new ProductoRefrigerado(201, "España", "COD-45A"));
        productos.add(new ProductoRefrigerado(202, "Brasil", "COD-12B"));
        productos.add(new ProductoRefrigerado(203, "Argentina", "COD-90C"));

        // Agregar productos congelados
        productos.add(new CongeladoPorAgua(301, "México", -10, 15.5));
        productos.add(new CongeladoPorAgua(302, "Perú", -8, 10.2));
        productos.add(new CongeladoPorNitrogeno(303, "Ecuador", -20, "Inmersión rápida"));

        
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Producto #" + (i + 1));
            productos.get(i).mostrarInfo();
            System.out.println("-----------------------------");
        }
    }
}
