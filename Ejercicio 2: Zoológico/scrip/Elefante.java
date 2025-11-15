
public class Elefante extends Mamifero {
    private String tamanoColmillos;
    private String dieta;
    private String especie;
    private String genero;
    private String fechaIngreso;

    public Elefante(String nombre, String tipo, int id, String habitat, String cantidad) {
        super(nombre, tipo, id, habitat, cantidad);
    }

    public void setTamanoColmillos(String tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getTamanoColmillos() {
        return tamanoColmillos;
    }



    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void mostrarInformacionElefante() {
        System.out.println("----------Lista De Los Elefantes----------");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Especie: " + getEspecie());
        System.out.println("ID: " + getId());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Tamaño de Colmillos: " + getTamanoColmillos());
        System.out.println("Dieta: " + getDieta());
        System.out.println("Género: " + getGenero());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
    }
}