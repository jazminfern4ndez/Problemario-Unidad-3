public class VillanoDeUltratumba extends Villano implements SerDeUltratumba {
    private String legion;

    public VillanoDeUltratumba(int edad, String nombre, String legion) {
        super(edad, nombre);
        this.legion = legion;
    }

    @Override
    public void asustar() {
        System.out.println(getNombre() + " dice: buuuuuu!!!!");
    }

    @Override
    public void gritar() {
        System.out.println(getNombre() + " grita: uaaaaaay!!");
    }

    public String getLegion() {
        return legion;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Legión: " + legion);
    }
}