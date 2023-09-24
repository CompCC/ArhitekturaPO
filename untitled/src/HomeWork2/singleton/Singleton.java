package HomeWork2.singleton;

public class Singleton {
    private static Singleton dog;

    private Singleton(){
        System.out.println("Собака появилась на свет!");
    };

    public static Singleton getDog() {
        if ( dog == null){
            dog = new Singleton();
        }
        return dog;
    }

    public void dogBarks(){
        System.out.println("Собака лает.");
    }
}
