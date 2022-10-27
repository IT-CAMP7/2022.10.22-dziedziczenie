package pl.camp.it.dziedziczenie;

public class Cat extends Pet {

    private String cosKociego;

    public String getCosKociego() {
        return cosKociego;
    }

    public void setCosKociego(String cosKociego) {
        this.cosKociego = cosKociego;
    }

    public void a() {
        //????
        //????
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cat)) {
            return false;
        }
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return (this.name + this.getRace()).length();
    }

    @Override
    public String toString() {
        return "Rasa: " + this.getRace() + " Imie: " + this.getName() + " Wiek: " + this.getAge();
    }
}
