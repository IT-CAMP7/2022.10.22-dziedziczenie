package pl.camp.it.dziedziczenie.typywyliczeniowe;

public class User {
    private String login;
    private String password;
    public Role role;
    public Sex sex;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public enum Sex {
        MEN,
        WOMEN,
        OTHER;

        int i = 5;
        String cos;

        Sex() {
            System.out.println("Kostruktor !!!");
        }

        public void metoda() {
            System.out.println("Metoda z typu Sex !!");
        }
    }

    public enum Role {
        ADMIN,
        USER
    }
}
