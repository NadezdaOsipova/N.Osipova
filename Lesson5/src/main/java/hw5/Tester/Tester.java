package hw5.Tester;

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
    private double salaryIncrease() {
        return salary * 2;
    }

    //Написать метод с уровнем доступа только внутри пакета, который будет возвращать количество опыта в месяцах;
    int experienceInMonths() {
        return 3 * 12;
    }

    //Написать метод с уровнем доступа внутри пакета и для наследников в других пакетах, который выводит на экран имя и фамилию;
    protected void fullName() {
        System.out.println(name + " " + surname);
    }

    //Написать метод с уровнем доступа отовсюду, который в одну строку будет выводить всю информацию о пользователе.
    public void info() {
        System.out.println(toString());
    }

    //  Написать для каждого поля get- и set- методы с уровнем доступа только внутри пакета.
    String getName() {
        return name;
    }

    String setName(String name) {
        this.name = name;
        return name;
    }

    String getSurname() {
        return surname;
    }

    String setSurname(String surname) {
        this.surname = surname;
        return surname;
    }

    int getExperienceInYears() {
        return experienceInYears;
    }

    int setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
        return experienceInYears;
    }

    String getEnglishLevel() {
        return englishLevel;
    }

    String setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
        return englishLevel;
    }

    double getSalary() {
        return salary;
    }

    double setSalary(double salary) {
        this.salary = salary;
        return salary;
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
