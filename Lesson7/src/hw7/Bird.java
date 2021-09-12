package hw7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Bird extends Animal { //птица
    private int wings;

    public Bird(String name, String color, double height, double weight, int wings) {
        super(name, color, height, weight);
        this.wings = wings;
    }

    @Override
    public void feedAnimal() {

    }
}
