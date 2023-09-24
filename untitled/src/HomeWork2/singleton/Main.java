package HomeWork2.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getDog();
        Singleton singleton1 = Singleton.getDog();
        singleton.dogBarks();
        singleton1.dogBarks();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
