package hw5.StarSystem;

public class Sirius extends Star {
    private String name;

    public Sirius(int number) {
        super(number);
    }

    void infoSirius(String name) {
        System.out.println(name + " — звезда созвездия Большого Пса.");
    }
}
