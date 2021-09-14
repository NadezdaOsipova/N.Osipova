package hw7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Crow extends Bird { //ворона
    private String country;

    public Crow(String name, String color, double height, double weight, int wings, String country) {
        super(name, color, height, weight, wings);
        this.country = country;
    }
}
