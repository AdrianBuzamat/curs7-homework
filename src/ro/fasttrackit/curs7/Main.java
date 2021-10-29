package ro.fasttrackit.curs7;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Marian", 33, true);
        Person person2 = new Person("George", 30, false);
        Person person3 = new Person("Silviu", 31, false);

        System.out.println("Nume: " + person1.getName() + " " + "Varsta: " + person1.getAge() + " " + "Stare civila: " + person1.isMarried());
        System.out.println("Nume: " + person2.getName() + " " + "Varsta: " + person2.getAge() + " " + "Stare civila: " + person2.isMarried());
        System.out.println("Nume: " + person3.getName() + " " + "Varsta: " + person3.getAge() + " " + "Stare civila: " + person3.isMarried());

        System.out.println();

        Product product1 = new Product("Lapte", 4.5, 5, "Alimente de baza");
        Product product2 = new Product("Minge de plus", 9.99, 10, "Jucarii");
        Product product3 = new Product("Surubelnita", 11.5, 10, "Unelte si scule");


        System.out.println("Produs: " + product1.getName() + " Pret: " + product1.getPrice() + " Nr pe stoc: " + product1.getQuantity() + " Categorie: " + product1.getCategory());
        System.out.println("In stoc: " + product1.hasStock());
        System.out.println(product3.isCategory("automobile"));

        Bottle bottle = new Bottle(750, 750);
        System.out.println(bottle.hasLiquid());
        System.out.println("Volum gol in sticla: " + bottle.getEmptyVolume());
        bottle.open();
        bottle.volumeConsumed(230);
        bottle.close();
        bottle.volumeConsumed(250);
        bottle.open();
        bottle.volumeConsumed(250);
        System.out.println("Volum gol in sticla: " + bottle.getEmptyVolume());
    }
}
