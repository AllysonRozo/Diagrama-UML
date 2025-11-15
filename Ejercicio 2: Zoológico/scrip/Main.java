
public class    Main {
    public static void main(String[] args) {
         System.out.println("-----------------------------------------");
        System.out.println("Bienvenido al sistema de gestión de Zoológico");

        Reptiles reptil1 = new Reptiles("Cocodrilo", "Reptil", 101, "Río","7");
        reptil1.setListaAnimales("Cocodrilo, Serpiente, Lagarto");
        reptil1.setTipoReptil("Cocodrilo");
        reptil1.setHabitat("Pantano");
        reptil1.setDieta("Carnívoro");
        reptil1.ver_lista_Animales();
         System.out.println("-----------------------------------------");
        Reptiles reptil2 = new Reptiles("Iguana", "Reptil", 104, "Selva","8");
        reptil2.setListaAnimales("Iguana, Tortuga, Camaleón");
        reptil2.setTipoReptil("Iguana");
        reptil2.setHabitat("Bosque Tropical");
        reptil2.setDieta("Herbívoro");
        reptil2.ver_lista_Animales();
        System.out.println("-----------------------------------------");

        Mamifero mamifero1 = new Mamifero("León", "Mamífero", 102, "Sabana","5");
        mamifero1.setTipoMamifero("Felino");
        mamifero1.setDieta("Carnívoro");
        mamifero1.ver_lista_Mamiferos();
        mamifero1.setHabitat("Pradera");
         System.out.println("-----------------------------------------");
        Mamifero mamifero2 = new Mamifero("Elefante", "Mamífero", 103, "Sabana","4");
        mamifero2.setTipoMamifero("Pachyderm");
        mamifero2.setDieta("Herbívoro");
        mamifero2.ver_lista_Mamiferos();
        mamifero2.setHabitat("Selva");
         System.out.println("-----------------------------------------");
    }
}    