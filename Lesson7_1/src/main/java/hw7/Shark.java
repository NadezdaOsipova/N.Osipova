package hw7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shark extends Predators {

    public Shark(String name, String color, double height, double weight, String habitat) {
        super(name, color, height, weight, habitat);
    }

    @Override
    public void feedAnimal() {

    }
}
