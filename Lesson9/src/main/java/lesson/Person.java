package lesson;

public class Person {
    public int age;

    public Person(int age) throws MyException {
        if (age < 18) {
            throw new MyException(age);
        }
        this.age = age;
    }
}
