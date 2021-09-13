package hw8;

/*Создать класс Human с полями имени и возраста, и 3 интерфейса с суперспособностями. Создать супергероя имплементируя
интерфейсы в Human. Переопределить методы toString,equals,hashCode и написать геттеры и сеттеры для полей имени/возраста.
 В классе Main создать объект Human, через сеттеры задать имя и возраст. Вызвать методы суперспособностей, toString(),
  и показать hashCode объекта Human.
 */
public class Human implements Aquaman, FireStorm, Namor {
    private String name;
    private int age;

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

    @Override
    public void canLiveUnderWater() {
        System.out.println(" Могу жить под водой!");
    }

    @Override
    public void passesThroughSolidObjects() {
        System.out.println(" Могу проходить сквозь твердые объекты!");
    }

    @Override
    public void canFly() {
        System.out.println(" Умею летать!");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
