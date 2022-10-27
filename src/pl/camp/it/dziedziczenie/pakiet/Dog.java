package pl.camp.it.dziedziczenie.pakiet;

import pl.camp.it.dziedziczenie.Pet;

public class Dog extends Pet {

    public Dog() {
        super();
        System.out.println("Konstruktor Psa !!!");
    }

    private String cosPsiego;
    public void bark() {
        System.out.println("Hau hau !!");
    }

    public String getCosPsiego() {
        return cosPsiego;
    }

    public void setCosPsiego(String cosPsiego) {
        this.cosPsiego = cosPsiego;
    }

    public void a() {
        this.name = "sdf";
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Macham ogonem !!!");
    }
}
