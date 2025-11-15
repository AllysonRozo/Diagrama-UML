
public class León extends Mamifero {
    private String tamanoMelena;
    private String rugido;
    
    private String dieta;

    public León(String nombre, String tipo, int id, String habitat, String cantidad) {
        super(nombre, tipo, id, habitat, cantidad);
    }

    public void setTamanoMelena(String tamanoMelena) {
        this.tamanoMelena = tamanoMelena;
    }

    public String getTamanoMelena() {
        return tamanoMelena;
    }

    public void setRugido(String rugido) {
        this.rugido = rugido;
    }

    public String getRugido() {
        return rugido;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    public void mostrarInformacionLeon() {
        System.out.println("----------Lista De Los Leones----------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo: " + getTipo());
        System.out.println("ID: " + getId());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Tamaño de Melena: " + getTamanoMelena());
        System.out.println("Rugido: " + getRugido());
        System.out.println("Dieta: " + getDieta());
    }
}