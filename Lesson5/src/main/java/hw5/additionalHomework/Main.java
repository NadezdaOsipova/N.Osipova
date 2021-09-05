package hw5.additionalHomework;

public class Main {
    public static void main(String[] args) {
        Tester1 tester1 = Tester1.getInstance("Иван", "Иванов");
        System.out.println(tester1.getName());
        System.out.println(tester1.getSurname());
    }
}
