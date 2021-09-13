package lesson8;

import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private int age;
    private double salary;
    private Cat cat;

    public Person(String name, int age, double salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.salary, salary) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return 17 * name.hashCode() + 31 * age * name.length();
    }

    @Override
    public String toString() {
        return "lesson8.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", cat=" + cat +
                '}';
    }
}

