package hw5.StarSystem;

public class Mars extends Planet {
    public String name;

    public Mars(int number) {
        super(number);
    }

    void infoMars(String name) {
        System.out.println(name + "четвёртая по удалённости от Солнца и седьмая по размеру планета " +
                "Солнечной системы; масса планеты составляет 10,7 % массы Земли");
    }
}
