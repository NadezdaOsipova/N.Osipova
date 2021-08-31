package hw5.StarSystem;

public class Sun extends Star {
    private String name;

    public Sun(int number) {
        super(number);
    }

    void infoSun(String name) {
        System.out.println(name + "— одна из звёзд нашей Галактики (Млечный Путь) и единственная звезда Солнечной системы.");
    }
}
