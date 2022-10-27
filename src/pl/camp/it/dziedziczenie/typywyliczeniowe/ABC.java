package pl.camp.it.dziedziczenie.typywyliczeniowe;

public class ABC {

    static int a;

    public enum Role {
        ADMIN,
        USER
    }

    public static class KlasaWewnetrzna {
        public int i;

        public KlasaWewnetrzna(int i) {
            this.i = i;
        }
    }
}
