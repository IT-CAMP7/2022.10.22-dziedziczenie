package pl.camp.it.dziedziczenie.typywyliczeniowe;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.role = User.Role.ADMIN;
        user.sex = User.Sex.MEN;

        User user2 = new User();
        user2.role = User.Role.USER;
        user2.sex = User.Sex.WOMEN;

        if(user2.sex == User.Sex.WOMEN) {
            System.out.println("Tak to kobieta !!!");
        }

        Console c = Console.PS5;
        System.out.println(c.getBrand());
        System.out.println(c.getModel());
        c.setMemory(5000);



        Console c1 = Console.PS5;
        System.out.println(c1.getMemory());

        User.Role rola = User.Role.USER;

        ABC.Role innaRola = ABC.Role.ADMIN;

        //User.Role jakasRola = ABC.Role.USER;

        /*if(User.Role.USER == ABC.Role.USER)) {
            System.out.println("dziala");
        }*/

        ABC.KlasaWewnetrzna kw = new ABC.KlasaWewnetrzna(6);

        ABC abc = new ABC();
        //ABC.KlasaWewnetrzna kw = abc.new KlasaWewnetrzna(4);

        ABC.a = 5;

        System.out.println(Day.MONDAY);

        Day day = Day.valueOf("MONDAY");
        Day[] values = Day.values();

        for(Day element : values) {
            System.out.println(element);
        }
    }
}
