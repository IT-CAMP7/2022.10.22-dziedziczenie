package pl.camp.it.dziedziczenie;

public class Final {
    public static void main(String[] args) {
        final int a = 5;
        System.out.println(a);
        //a = 10;
        //System.out.println(a);

        final Car car = new Car("BMW", "5");
        System.out.println(car.getBrand());
        System.out.println(car.getModel());

        car.setBrand("Audi");
        car.setModel("A5");

        System.out.println(car.getBrand());
        System.out.println(car.getModel());

        //Car car1 = new Car();
        //car = car1;
    }
}
