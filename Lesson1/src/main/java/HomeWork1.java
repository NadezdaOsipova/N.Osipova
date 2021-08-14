public class HomeWork1 {
    public static void main(String[] args) {
        // 1. Написать приложение, которое будет вычислять и выводить значение по формуле: a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
        int b = 4;
        int c = 5;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);
        System.out.println("------");

       /* 2. В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n.
                Например: n =26, в результате мы должны получить 8 (2+6).*/
        int n = 26;
        int m = n / 10;
        int l = n % 10;
        System.out.println(m + l);
        System.out.println("------");

       /* 3. В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n.
                Например: n =126, в результате мы должны получить 9 (1+2+6).*/
        int k = 126;
        int first = k / 100;
        int transitional = k % 100;
        int second = transitional / 10;
        int three = transitional % 10;
        System.out.println(first + second + three);
        System.out.println("------");

        // 4. В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
        double pi = 3.14;
        System.out.println((double) Math.round(pi));
        System.out.println("------");
       /* 5. В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
                Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8):  21 / 8 = 2 и 5 в остатке*/
        int q = 21;
        int w = 8;
        int segmentation = q / w;
        int remainder = q % w;
        System.out.println(segmentation);
        System.out.println(remainder);
    }
}
