package hw5.StarSystem;

public abstract class Planet extends StarSystem {
    public String name;

    public Planet(int number) {
        super(number);
    }

    void infoPlanet(String name) {
        System.out.println(name + " — небесное тело, вращающееся по орбите вокруг звезды или её остатков");
    }
}
