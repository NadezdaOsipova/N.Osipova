package hw.hw2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AnimalList list = new AnimalList();
        list.addAnimal(new Monkey());
        list.addAnimal(new Elephant());
        list.addAnimal(new Wolf());
        System.out.println(list.toString());

        list.removeAnimal();
        list.removeAnimal();
        System.out.println(list.toString());
    }
}
