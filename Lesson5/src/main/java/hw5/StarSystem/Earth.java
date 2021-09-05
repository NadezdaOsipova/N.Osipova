package hw5.StarSystem;

public class Earth extends Planet {
    public String name;

    public Earth(int number) {
        super(number);
    }

    void infoPlanet(String name) {
        System.out.println(name + " — третья по удалённости от Солнца планета Солнечной системы.");
    }
}
