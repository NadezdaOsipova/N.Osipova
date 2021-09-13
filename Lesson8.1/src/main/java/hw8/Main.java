package hw8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("I'm Iron Man!");
        human.setAge(45);
        System.out.println(human.getName() + "I am " + human.getAge() + " years old");

        human.canLiveUnderWater();
        human.passesThroughSolidObjects();
        human.canFly();
        System.out.println(human.toString());//toString()
        System.out.println(human.hashCode());
    }
}
