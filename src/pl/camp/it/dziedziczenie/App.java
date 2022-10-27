package pl.camp.it.dziedziczenie;

import pl.camp.it.dziedziczenie.pakiet.Dog;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.setName("Puszek");
        cat.setRace("Dachowiec");
        cat.setAge(10);
        cat.walk();
        cat.setCosKociego("cos kociego");

        dog.setName("Rex");
        dog.setRace("Owczarek");
        dog.setAge(7);
        dog.walk();
        dog.bark();
        dog.setCosPsiego("cos psiego");

        System.out.println(cat.getName());
        System.out.println(cat.getRace());
        System.out.println(cat.getAge());

        System.out.println(dog.getName());
        System.out.println(dog.getRace());
        System.out.println(dog.getAge());

        Jamnik jamnik = new Jamnik();
        jamnik.setName("Janiczek");
        jamnik.setRace("Jamnik");
        jamnik.setCosPsiego("cos psiego");
        jamnik.setCosJamnikowego("cos jamnikowego");
        jamnik.a();

        Pet pet = new Pet();

        Snake snake = new Snake();
        snake.setName("Pyton");
        snake.setRace("Pyton");
        snake.setAge(10);

        snake.walk();

        K k = new K();
    }
}
