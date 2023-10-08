package HomeWork6.decorator;

// Интерфейс для животных
interface IAnimalDiscriber {
    void describe();
}

// Реализация базового интерфейса для животных
class BasicAnimal implements IAnimalDiscriber {
    private String description;

    public BasicAnimal(String description) {
        this.description = description;
    }

    @Override
    public void describe() {
        System.out.println(description);
    }
}

// Декоратор для добавления цвета животным
class ColorDecorator implements IAnimalDiscriber {
    private IAnimalDiscriber animal;
    private String color;

    public ColorDecorator(IAnimalDiscriber animal, String color) {
        this.animal = animal;
        this.color = color;
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("Цвет: " + color);
    }
}

// Декоратор для добавления размера животным
class SizeDecorator implements IAnimalDiscriber {
    private IAnimalDiscriber animal;
    private String size;

    public SizeDecorator(IAnimalDiscriber animal, String size) {
        this.animal = animal;
        this.size = size;
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("Размер: " + size);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем базового животного
        IAnimalDiscriber basicAnimal = new BasicAnimal("Это животное");

        // Декорируем его цветом и размером
        IAnimalDiscriber coloredAnimal = new ColorDecorator(basicAnimal, "красный");
        IAnimalDiscriber sizedAnimal = new SizeDecorator(coloredAnimal, "большой");

        // Выводим описание животного с учетом декораций
        sizedAnimal.describe();
    }
}