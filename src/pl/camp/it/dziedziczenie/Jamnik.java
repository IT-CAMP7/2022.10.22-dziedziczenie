package pl.camp.it.dziedziczenie;

import pl.camp.it.dziedziczenie.pakiet.Dog;

public class Jamnik extends Dog {

    public Jamnik() {
        super();
        System.out.println("Konstruktor Jamnika !!");
    }

    private String cosJamnikowego;

    public String getCosJamnikowego() {
        return cosJamnikowego;
    }

    public void setCosJamnikowego(String cosJamnikowego) {
        this.cosJamnikowego = cosJamnikowego;
    }
}
