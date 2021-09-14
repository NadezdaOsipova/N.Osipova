package hw7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wolf extends Predators {

    public Wolf(String name, String color, double height, double weight, String eat, String habitat) {
        super(name, color, height, weight, "Meat", habitat);
    }
}
