package Ejercicio1.script;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("Bienvenido al sistema de gestión de Notas");


    

        System.out.println("-----------------------------------------");
        Administrador admin = new Administrador("Daniel", 1, "adminpass");
        admin.logear();
        admin.crearNota();
        admin.editarNotas();
        admin.eliminarNota();
        admin.agregarUsuario();
        admin.eliminarUsuario();
        admin.ver_lista_usuarios();
        admin.asignarPermisos();

        System.out.println("-----------------------------------------");
        Profesor profe = new Profesor("Smith", 456, "profepass", lector);
        profe.logear();
        profe.administrarNotas();
        profe.crearNota();
        profe.editarNotas();
        profe.eliminarNotas();

        System.out.println("-----------------------------------------");
        estudiante estudiante1 = new estudiante("Maria", 789, "estupass");
        estudiante1.logear();
        estudiante1.subir_trabajos();
        estudiante1.actualizar_informacion();
        System.out.println("-----------------------------------------");
        lector.close();
    }
    
}
