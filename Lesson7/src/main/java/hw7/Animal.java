package hw7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal {
    private String name;
    private String color;
    private double height;
    private double weight;
    private String eat;

    public Animal(String name, String color, double height, double weight, String eat) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.eat = eat;
    }

    public void feedAnimal(String eat) {
        switch (eat) {
            case "Meat" -> System.out.println("I like meat!");
            case "Corn" -> System.out.println("I like corn!");
            default -> System.out.println("I don't like your food!");
        }
    }


}

