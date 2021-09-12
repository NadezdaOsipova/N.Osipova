package hw7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wolf extends Predators {
    private String food = "мясо";
    private int numberOfPaws;

    public Wolf(String name, String color, double height, double weight, String habitat, int numberOfPaws) {
        super(name, color, height, weight, habitat);
        this.numberOfPaws = numberOfPaws;
    }

    @Override
    public void feedAnimal() {

    }
}
