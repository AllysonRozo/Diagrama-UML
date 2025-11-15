
public class Animal {
 private String nombre;
 private String tipo;
 private int id;
 private String habitat;
private String cantidad;

 public Animal(String nombre, String tipo, int id, String habitat, String cantidad) {
     this.nombre = nombre;
     this.tipo = tipo;
     this.id = id;
     this.habitat = habitat;
     this.cantidad = cantidad;
   
 }

 public String getNombre() {
     return nombre;
 }

 public String getTipo() {
     return tipo;
 }
    public int getId() {
        return id;
    }
    public String getHabitat() {
        return habitat;
    }

    public String getTipoReptil() {
        return tipo;
    }
    public String getCantidad() {
        return cantidad;
    }
} 

