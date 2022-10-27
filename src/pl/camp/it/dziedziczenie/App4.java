package pl.camp.it.dziedziczenie;

public class App4 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.setName("Puszek");
        cat1.setRace("Jakas");
        cat1.setAge(10);
        cat1.setCosKociego("cos");

        cat2.setName("Puszek2345");
        cat2.setRace("Jakas");
        cat2.setAge(10);
        cat2.setCosKociego("cos");


        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

        System.out.println(cat1);
    }
}
