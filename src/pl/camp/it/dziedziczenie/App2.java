package pl.camp.it.dziedziczenie;

import pl.camp.it.dziedziczenie.pakiet.Dog;

public class App2 {
    public static void main(String[] args) {
        Jamnik jamnik = new Jamnik();
        Dog dog = jamnik;
        Pet pet = dog;
        Object object = pet;

        jamnik.setCosJamnikowego("cos jamnikowego !!");
        jamnik.getCosJamnikowego();
        dog.setCosPsiego("lakjshdgf");
        dog.getCosPsiego();

        Jamnik jamnik2 = (Jamnik) object;
        jamnik2.getCosJamnikowego();


        Snake[] snakes = new Snake[5];
        Cat[] cats = new Cat[5];
        Dog[] dogs = new Dog[5];

        System.out.println("-----------------------");
        Pet[] pets = new Pet[5];

        pets[0] = new Cat();
        pets[1] = new Dog();
        pets[2] = new Snake();
        pets[3] = new Dog();
        pets[4] = new Snake();

        for(Pet element : pets) {
            element.walk();
        }

        System.out.println("-------------------------");

        if(pets[1] instanceof Dog) {
            ((Dog) pets[1]).getCosPsiego();
        }

        /*Cat cat = (Cat) pets[1];
        cat.getCosKociego();*/

        Cat cat = new Cat();
        cat.setCosKociego("abc");

        Pet pet2 = cat;

        Cat cat2 = (Cat) pet2;

        System.out.println(cat2.getCosKociego());

        String s1 = "ABC";
        String s2 = "ABC";

        System.out.println(s1.equals(s2));
    }
}
