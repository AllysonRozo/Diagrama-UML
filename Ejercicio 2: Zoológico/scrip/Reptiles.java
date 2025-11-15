
public class Reptiles extends Animal {

    private String listaAnimales;
    private String tipoReptil;
    private String dieta;
    public Reptiles(String nombre, String tipo, int id, String habitat, String cantidad) {
         super(nombre, tipo, id, habitat, cantidad);
    }

    public void setListaAnimales(String listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public String getListaAnimales() {
        return listaAnimales;
    }
    public void setTipoReptil(String tipoReptil) {
        this.tipoReptil = tipoReptil;
    }
    public String getTipoReptil() {
        return tipoReptil;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    public void ver_lista_Animales()
    {

        System.out.println("----------Lista de Reptiles----------");
       System.out.println("Nombre: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Tipo de Reptil: " + getTipoReptil());
     }
}