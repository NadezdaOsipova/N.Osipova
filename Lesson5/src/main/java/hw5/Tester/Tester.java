package hw5.Tester;
/*Создать класс Tester со следующими полями:
-name
-surname
-experienceInYears
-englishLevel
-salary
Самостоятельно решить, какое модификатор доступа будет иметь каждое из полей, при этом использовать все изученные модификаторы.
1. Перегрузить в этом классе 3 конструктора, каждый из которых будет последовательно вызывать другой используя this(...);
Конструктор с наибольшим числом параметров сделать с уровнем доступа отовсюду.

7. В методе main другого класса (любого), лежащего в том же пакете что и Tester, создать объект класса Tester,
 используя любой из перегруженных конструкторов. продемонстрировать последовательный вызов всех методов класса Tester,
 если это возможно. если невозможно – закомментировать и написать почему.
*/

public class Tester {
    protected String name;
    private String surname;
    public int experienceInYears;
    String englishLevel;
    private double salary;

    // перегруженные конструкторы
    public Tester(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname);
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this(name, surname, experienceInYears, englishLevel);
        this.salary = salary;
    }

    //Написать метод с уровнем доступа только внутри класса, который будет возвращать salary*2;
    private double salaryIncrease(double salary) {
        return salary * 2;
    }

    //Написать метод с уровнем доступа только внутри пакета, который будет возвращать количество опыта в месяцах;
    protected int experienceInMonths(int experienceInYears) {
        return experienceInYears * 12;
    }

    //Написать метод с уровнем доступа внутри пакета и для наследников в других пакетах, который выводит на экран имя и фамилию;
    protected void fullName(String name, String surname) {
        System.out.println(name + " " + surname);
    }

    //Написать метод с уровнем доступа отовсюду, который в одну строку будет выводить всю информацию о пользователе.
    public void info() {
        System.out.println(toString());
    }

    //  Написать для каждого поля get- и set- методы с уровнем доступа только внутри пакета.
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getSurname() {
        return surname;
    }

    protected void setSurname(String surname) {
        this.surname = surname;
    }

    protected int getExperienceInYears() {
        return experienceInYears;
    }

    protected void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    protected String getEnglishLevel() {
        return englishLevel;
    }

    protected void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    protected double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experienceInYears=" + experienceInYears +
                ", englishLevel='" + englishLevel + '\'' +
                ", salary=" + salary +
                '}';
    }
}
