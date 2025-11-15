public class Administrador extends Usuario{
    public Administrador(String nombre, int id, String password) {
        super(nombre, id, password);
    }

    public void agregarAnimal() {
        System.out.println("Animal agregado con éxito.");
    }

    public void eliminarAnimal() {
        System.out.println("Animal eliminado con éxito.");
    }
    
}
