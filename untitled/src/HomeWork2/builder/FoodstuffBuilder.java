package HomeWork2.builder;

public class FoodstuffBuilder {
    private String name;
    private int weight;
    private int quantity;
    private int price;

    public FoodstuffBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FoodstuffBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public FoodstuffBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public FoodstuffBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public Foodstuff build() {
        return new Foodstuff(name, weight, quantity, price);
    }
}
