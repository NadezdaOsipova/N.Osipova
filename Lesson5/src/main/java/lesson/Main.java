package lesson;

public class Main {
    public static void main(String[] args) {
        HP hp = new HP();
        Mac mac = new Mac("lesson.Mac");
        System.out.println(hp.getCompany());
        System.out.println(mac.getCompany());
    }
}
