package hw7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parrot extends Bird {//папугай
    private String country;

    public Parrot(String name, String color, double height, double weight, int wings, String eat, String country) {
        super(name, color, height, weight, wings, "Corn");
        this.country = country;
    }
}
