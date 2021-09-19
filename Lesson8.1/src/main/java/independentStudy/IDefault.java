package independentStudy;

public interface IDefault {
    default void print() {
        System.out.println("Привет, медвед Вася");
    }
}
