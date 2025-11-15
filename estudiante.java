package Ejercicio1.script;

public class estudiante extends Usuario {
     public String horario_clases;
     public String grupo;

      public estudiante(String nombre, int id, String password) {
        super(nombre, id, password);
    }

    public void setHorario_clases(String horario_clases) {
        this.horario_clases = horario_clases;
    }
    public String getHorario_clases() {
        return horario_clases;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public String getGrupo() {
        return grupo;
    }

    public void subir_trabajos() {
        System.out.println("Taller 1 y Taller 2 subidos con exito.");
    }
    public void  actualizar_informacion() {
        System.out.println("Nombre: Maria, ID: 789, Grupo: A1, información actualizada con exito.");
    }

}
