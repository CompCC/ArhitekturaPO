package HomeWork2.builder;

public class Main {
    public static void main(String[] args) {
        Foodstuff no1 = new FoodstuffBuilder()
                .setName("Сыр")
                .setWeight(500)
                .setQuantity(10)
                .setPrice(250)
                .build();
        Foodstuff no2 = new FoodstuffBuilder()
                .setName("Вода")
                .setWeight(1000)
                .setQuantity(1)
                .setPrice(42)
                .build();

        System.out.println(no1);
        System.out.println(no2);
    }
}
