package HomeWork2.builder;

public class Foodstuff {
    private String name;
    private int weight;
    private int quantity;
    private int price;

    public Foodstuff(String name, int weight, int quantity, int price) {
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Продукт: " + "Название = " + name + ";" + " Вес = " + weight + ";" + " Количество=" + quantity + ";" + " Цена= " + price;
    }
}
