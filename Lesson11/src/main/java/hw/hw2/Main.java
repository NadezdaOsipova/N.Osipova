package hw.hw2;

public class Main {

    public static void main(String[] args) {
        AnimalList list = new AnimalList();
        //   AnimalList animalList = new AnimalList();
        list.addAnimal(Monkey);
        animalList.addAnimal("Tiger");
        animalList.addAnimal("Monkey");
        animalList.addAnimal("Elephant");
        animalList.addAnimal("Leon");
        System.out.println(animalList);
        animalList.removeAnimal();
        animalList.removeAnimal();
        System.out.println(animalList.toString());
    }
}
