package hw4_1;


public class Main {

    public static void main(String[] args) {
        // Person person = new Person();

        Person person = new Person("Иван", "Иванов", 12, "Samsung");
        MetodPerson metodPerson = new MetodPersonImpl(person);
        //   Person person2 = new Person("Петр","Петров",21,"LG");
        //  Person person3 = new Person("Федор","Федоров",18,"Sony");
        metodPerson.printAllInformation();
        metodPerson.printName();
        System.out.println(metodPerson.isAdult());
    }
}
