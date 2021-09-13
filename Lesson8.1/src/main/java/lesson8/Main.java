package lesson8;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //     lesson8.Cat cat = new lesson8.Cat();
        //     lesson8.Dog dog = new lesson8.Dog();

        //     cat.doVoice();
        //     dog.doVoice();

        Person person = new Person("ВАся", 45, 456.87, new Cat());
        Person person1 = (Person) person.clone();
        person1.setName("Федя");
        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());
    }
}
