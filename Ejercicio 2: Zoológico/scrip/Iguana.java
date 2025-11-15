
public class Iguana extends Reptiles {
    private String colorEscamas;
    private String dieta;

    public Iguana(String nombre, String tipo, int id, String habitat, String cantidad) {
        super(nombre, tipo, id, habitat, cantidad);
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    public void mostrarInformacionIguana() {
        System.out.println("----------Lista De Las Iguanas----------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println("ID: " + getId());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Color de Escamas: " + getColorEscamas());
        System.out.println("Tipo: " + getTipo());
    }
}
