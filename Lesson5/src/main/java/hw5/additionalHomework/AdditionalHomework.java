package hw5.additionalHomework;

/*Дополнительное домашнее задание:
1.	Написать такой конструктор, который запретит создание объекта класса Tester в других классах;
2.	Найти способ вызывать методы класса Tester, который позволит обойти ограничение, наложенное конструктором выше.
3.	Объяснить, как работают оба способа.
*/
public class AdditionalHomework {
    public String name;
    public String surname;
    public int experienceInYears;
    public  String englishLevel;
    public double salary;

    private AdditionalHomework(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
}
