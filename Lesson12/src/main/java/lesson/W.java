package lesson;

public class W {
    public static void main(String[] args) {
        System.out.println(summa(123, "rethks"));
    }

    public static <T1, T2> long summa(T1 element1, T2 element2) {
        return element1.hashCode() + element2.hashCode();
    }
}
