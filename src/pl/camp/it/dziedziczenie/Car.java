package pl.camp.it.dziedziczenie;

public class Car extends Vehicle {

    public Car(String brand, String model) {
        super(brand, model);
    }

    public Car() {
        super("default brand", "default model");
    }

    @Override
    public void drive() {
        System.out.println("Na czterech kolach !!");
        super.drive();
        this.cos = 5;
    }
}
