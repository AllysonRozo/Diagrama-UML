public class Cuidador extends Usuario {

   private String areaResponsable;

   public Cuidador(String nombre, int id, String password, String areaResponsable) {
       super(nombre, id, password);
       this.areaResponsable = areaResponsable;
   }

   public String getAreaResponsable() {
       return areaResponsable;
   }

   public void cuidarAnimales() {
       System.out.println("Cuidando animales en el área: " + areaResponsable);
   }
}
