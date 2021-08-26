import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

     /* 1. Натуральное положительное число записано в переменную n. Создайте программу, которая будет генерировать и
       выводить на экран целое псевдослучайное число из отрезка [-n; n].*/
        int a = (int) (Math.random() * (40 + 1)) - 20;
        System.out.println(a);
        System.out.println("-----");

        /* 2. Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n,
       чётным либо нечётным.*/
        System.out.println("Введите любое целое число:");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println(x + " - четное число");
        } else {
            System.out.println(x + " - нечетное число");
        }
        System.out.println("-----");

        /* 3. Создать программу, выводящую на экран ближайшее к 10 из двух дробных чисел, записанных в переменные m и n.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/
        double n = 8.5;
        double m = 11.45;

        if (Math.abs(10 - n) <= Math.abs(10 - m)) {
            System.out.println(n + " - ближайшее к 10 число.");
        } else {
            System.out.println(m + " - ближайшее к 10 число.");
        }
        System.out.println("-----");

       /* 4. Создать программу, которая будет проверять попало ли случайно выбранное число из отрезка [5; 155] в интервал
        (25; 100) и сообщить результат на экране.*/
        int k = (int) (5 + Math.random() * 151);
        System.out.println(k);

        if (k > 25 && k < 100) {
            System.out.println("Сгенерированное число входит в промежуток (25;100)");
        } else {
            System.out.println("Сгенерированное число не входит в промежуток (25;100)");
        }
        System.out.println("-----");

        //5. Создать программу, выводящую на экран случайно сгенерированное трёхзначное число и его наибольшую цифру
        int c = random.nextInt(900) + 100;
        System.out.println(c);
        int first = c / 100;
        int transitional = c % 100;
        int second = transitional / 10;
        int third = transitional % 10;
        if ((first > second) && (first > third)) {
            System.out.println(first + " найбольшее из 3 чисел");
        } else if ((second > third) && (second > first)) {
            System.out.println(second + " найбольшее из 3 чисел");
        } else {
            System.out.println(third + " найбольшее из 3 чисел");
        }
        System.out.println("------");


        /* 6. В три переменные a, b и c явно записаны программистом три целых неравных между собой числа. Создать программу,
         которая переставит числа таким образом, чтобы при выводе на экран последовательности a, b и c оказалось строго возрастающей.*/
        int one = 25;
        int two = 7;
        int three = 135;
        int[] array = new int[]{one, two, three};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("------");

        /*7. Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введенных пользователем
        с клавиатуры. Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.*/
        System.out.println("Введите первое число:");
        int s1 = 0;
        if (scanner.hasNextInt()) {
            s1 = scanner.nextInt();
        } else {
            System.out.println(s1 + "число введено некорректно");
        }
        System.out.println("Введите второе число:");
        int s2 = 0;
        if (scanner.hasNextInt()) {
            s2 = scanner.nextInt();
        } else {
            System.out.println(s2 + "число введено некорректно");
        }
        int summ = s1 + s2;
        System.out.println("Сумма введенных чисел:" + summ);
        System.out.println("------");


        //8. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128…
        int j = 1;
        for (int i = 0; i < 20; i++) {
            j = j * 2;
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("------");


        //9. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
        System.out.println("Введите любое целое число:");
        int x1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < x1; i++) {
            if (x1 % i == 0) {
                count++;
                System.out.println(i + " ");
            }
        }
        System.out.println("Делители введенного числа" + count);
        System.out.println("------");


      /* 10. Для введенного пользователя с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно
         сколько цифр будет введено пользователем).*/
        System.out.println("Введите любое целое число:"); //запара с этим заданием
        int a1 = 0;
        int c1 = 0;
                if(scanner.hasNextInt()){
            a1=scanner.nextInt();
            while(a1!=0){
                c1=c1+a1%10;
                a1/=10;
            }
            System.out.println("Сумма всех чисел введенного числа равна "+c1);
        }
        else System.out.println("Ошибка. Вы ввели не число!");
    }

}

