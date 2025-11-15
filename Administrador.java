package Ejercicio1.script;

public class Administrador extends Usuario {

    private String horarioTrabajo;
    public Administrador(String nombre, int id, String password) {
        super(nombre, id, password);
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }
    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }
    
    public void asignarPermisos() {
        System.out.println("Asignando permisos de corregir notas a Profesor Smith...");
    }
    public void editarNotas()
    {
        System.out.println("Editando notas...");
    }

    public void eliminarNota()
    {
        System.out.println("Eliminando nota...");
    }
    public void crearNota()
    {
        System.out.println("Creando nota...");
    }
    public void agregarUsuario()
    {
        System.out.println("Usuario Maria, ID: 789 agregado con exito.");
    }
    public void eliminarUsuario()
    {
        System.out.println("Usuario Juan, ID: 123 eliminado con exito.");
    }
    public void ver_lista_usuarios()
    {
        System.out.println("----------Lista de Usuarios----------");
        System.out.println("Lista de usuarios:");
        System.out.println("1. Daniel, ID: 985");
        System.out.println("2. Maria, ID: 789");
        System.out.println("3. Smith, ID: 456");
    }
}
