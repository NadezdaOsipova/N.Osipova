package independentStudy;

public interface IStaticPrivate {
    static void test() {
        print();
    }

    private static void print() {
        System.out.println(" Hello!!!!");
    }
}
