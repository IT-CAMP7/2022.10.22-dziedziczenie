package pl.camp.it.dziedziczenie;

public class App3 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getBrand());
        System.out.println(car.getModel());

        car.drive();
    }
}
