package hw.hw1;

import java.util.LinkedList;
import java.util.List;

public class AnimalList {

    List<String> animalList = new LinkedList<>();

    public void addAnimal(String str) {
        animalList.add(animalList.size(), str);
    }

    public void removeAnimal() {
        animalList.remove(0);
    }
}
