
public class Mamifero extends Animal {
    private String tipoMamifero;
    private String dieta;   

    public Mamifero(String nombre, String tipo, int id, String habitat, String cantidad) {
        super(nombre, tipo, id, habitat, cantidad);
    }

    public void setTipoMamifero(String tipoMamifero) {
        this.tipoMamifero = tipoMamifero;
    }

    public String getTipoMamifero() {
        return tipoMamifero;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

   

    public void ver_lista_Mamiferos() {
        System.out.println("----------Lista De Los Mamiferos----------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println("ID: " + getId());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Tipo de Mamifero: " + getTipoMamifero());
        System.out.println("Dieta: " + getDieta());
    }
}