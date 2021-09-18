package lesson;

public class MyException extends Exception {
    public int age;

    public MyException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ваш возраст " + age + " ,должен быть больше 18";
    }
}
