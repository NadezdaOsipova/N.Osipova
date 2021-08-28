package hw4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Person {
    String name;
    String surname;
    int age;
    int phone;

    public Person() {
    }

    public Person(String name, String surname, int age, int phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname=" + surname +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    void printAllInformation() {
        System.out.println(toString());
    }

    void printName() {
        System.out.println(name + " " + surname);
    }

    boolean isAdult() {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}

