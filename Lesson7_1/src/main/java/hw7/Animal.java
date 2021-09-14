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

    public Animal(String name, String color, double height, double weight) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public abstract void feedAnimal();

}

