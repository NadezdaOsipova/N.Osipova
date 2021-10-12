package hw.hw2;

import java.util.LinkedList;
import java.util.List;

public class AnimalList {

    List<Animal> animalList = new LinkedList<>();

    public void addAnimal(Animal animal) {
        animalList.add(animalList.size(), animal);
    }

    public void removeAnimal() {
        animalList.remove(0);
    }
}
