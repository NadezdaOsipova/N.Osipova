package hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalList {
    public static void main(String[] args) {
        List<String> animalList = new ArrayList<>();
        animalList.add("Elephant");
        Collections.addAll(animalList, "Wolf", "Tiger");
        System.out.println(animalList);
        //  animalList.add( "Lion");


    }
}
