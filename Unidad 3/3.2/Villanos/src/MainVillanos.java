public class MainVillanos {
    public static void main(String[] args) {
        Villano v1 = new Villano(45, "Mysterio");
        Malvado m1 = new Malvado(500, "Thanos", true);
        Malvado m2 = new Malvado(30, "Loki", true);

        Villano[] villanos = { v1, m1, m2 };

        for (Villano v : villanos) {
            System.out.println("Nombre: " + v.getNombre() + ", Edad: " + v.getEdad());
        }
    }
}
