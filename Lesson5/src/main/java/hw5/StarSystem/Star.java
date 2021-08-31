package hw5.StarSystem;

public abstract class Star extends StarSystem {
    private String name;

    public Star(int number) {
        super(number);
    }

    void infoStar(String name) {
        System.out.println(name + " - массивное самосветящееся небесное тело, состоящее из газа или плазмы, в котором происходят, " +
                "происходили или будут происходить термоядерные реакции.");
    }
}
