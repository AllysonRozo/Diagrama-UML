package Ejercicio1.script;

import java.util.Scanner;

public class Profesor extends Usuario {
    
  
    private Scanner lector;
    private String materiaAsignada;
    private String horarioTrabajo;

    public Profesor(String nombre, int id, String password, Scanner lector) {
        super(nombre, id, password);
        this.lector = lector;
    }

    public void setMateriaAsignada(String materiaAsignada) {
      this.materiaAsignada = materiaAsignada;
    }
    public String getMateriaAsignada() {
        return materiaAsignada;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }
    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }
    
    public void editarNotas() {
        
        
        System.out.println("--- EDITAR NOTAS ---");
        System.out.println("Ingrese el nombre de la actividad a editar:");
        String actividad = lector.nextLine();
        System.out.println("Ingrese la nueva nota");
        float nuevaNota = lector.nextFloat();

        lector.nextLine();  // Limpiar el buffer

        System.out.println("\nNOTA EDITADA CON ÉXITO:");
        System.out.println("Actividad: " + actividad + ", Nueva Nota: " + nuevaNota);
      
    }
    
    public void crearNota() {
      
        
        System.out.println("--- CREAR NUEVA NOTA ---");
        
        System.out.println("Ingrese el nombre de la actividad:");
        String actividad = lector.nextLine();
       
        
        System.out.println("Ingrese el valor de la nota (ej: 3.5):");
        double nota = lector.nextDouble();
        
        System.out.println("Nota creada:");
        System.out.println("Actividad: " + actividad + ", Valor: " + nota);
      }    
    
    public void eliminarNotas() {
        
        
        System.out.println("--- ELIMINAR NOTAS ---");
        System.out.println("Ingrese el nombre de la actividad a eliminar:");
        String actividad = lector.nextLine();

        System.out.println("La nota para '" + actividad + "' ha sido eliminada con éxito.");
        lector.close();
    }
      
    public void administrarNotas() {
        System.out.println("El profesor está administrando notas...");
    }



}