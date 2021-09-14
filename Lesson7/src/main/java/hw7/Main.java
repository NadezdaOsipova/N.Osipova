package hw7;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Scanner;

@Getter
@Setter
public class Main {
    private static Zoo arrayAnimal;

    public static void main(String[] args) {
        Zoo zoo = new Zoo(arrayAnimal);
        System.out.println(zoo);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название еды, которой Вы хотели бы покормить животное:\n\n"
                + "1 - Meat\n"
                + "2 - Corn\n"
        );
        String eat1 = scanner.nextLine();
        zoo.wolf.feedAnimal(eat1);
        zoo.wolf.feedAnimal("Meat");
    }
}
