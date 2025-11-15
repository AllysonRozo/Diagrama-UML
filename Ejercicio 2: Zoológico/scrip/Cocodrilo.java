public class Cocodrilo extends Reptiles {

    private String tipoCocodrilo;
    private String dieta;
    public Cocodrilo(String nombre, String tipo, int id, String habitat, String cantidad) {
        super(nombre, tipo, id, habitat, cantidad);
    }
    public void setTipoCocodrilo(String tipoCocodrilo) {
        this.tipoCocodrilo = tipoCocodrilo;
    }
    public String getTipoCocodrilo() {
        return tipoCocodrilo;
    }  
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    public String getDieta() {
        return dieta;
    }
    public void ver_lista_Cocodrilos() {
        System.out.println("----------Lista De Los Cocodrilos----------");
         System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipoCocodrilo ());
        System.out.println("ID: " + getId());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Dieta: " + getDieta());
    }
}