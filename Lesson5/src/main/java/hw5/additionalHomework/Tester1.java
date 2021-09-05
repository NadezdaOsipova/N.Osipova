package hw5.additionalHomework;

/*Дополнительное домашнее задание:
1.	Написать такой конструктор, который запретит создание объекта класса Tester в других классах;
2.	Найти способ вызывать методы класса Tester, который позволит обойти ограничение, наложенное конструктором выше.
3.	Объяснить, как работают оба способа.
*/
public class Tester1 {
    private String name;
    private String surname;

    private Tester1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static Tester1 getInstance(String name, String surname) {//статический метод, который используется для создания объектов.
        //Возращает объекты приватного класса Tester1
        return new Tester1(name, surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
