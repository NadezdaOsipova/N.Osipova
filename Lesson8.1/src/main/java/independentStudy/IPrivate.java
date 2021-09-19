package independentStudy;

public interface IPrivate {
    default void test() {
        print();
    }

    private void print() {
        System.out.println("ПРИВЕТИКИ");
    }
}
