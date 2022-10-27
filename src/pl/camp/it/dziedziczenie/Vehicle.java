package pl.camp.it.dziedziczenie;

public class Vehicle {

    private String brand;
    private String model;

    public int cos;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void drive() {
        System.out.println("Jade !!");
    }
}
