package lesson8;

public class Fruit {
    public Pips pips;

    public Fruit() {
        this.pips = new Pips();
    }

    class Pips {
        static final int count = 4;

        //  public int getCount() {
        //      return count;
        //  }
    }
}
