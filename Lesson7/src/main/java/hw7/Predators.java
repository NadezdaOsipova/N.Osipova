package hw7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Predators extends Animal {
    private String habitat; // среда обитания

    public Predators(String name, String color, double height, double weight, String eat, String habitat) {
        super(name, color, height, weight, "Meat");
        this.habitat = habitat;
    }
}
