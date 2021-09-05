package homeWork.hw2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Metod1 {

    protected static int minNumber() {
        int num1 = (int) (Math.random() * 25);
        int num2 = (int) (Math.random() * 70);
        System.out.println("Первое число " + num1);
        System.out.println("Второе число " + num2);
        if (num1 > num2) {
            return num2;
        }
        return num1;
    }

    protected static boolean evenNumber() {
        System.out.println("Введите число от 0 до 50:");
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        if (z % 2 == 0) {
            return true;
        }
        return false;
    }

    protected static int numberСube() {
        double cube = (int) (Math.random() * 25);
        System.out.println(cube + " - число, возводимое в куб");
        return (int) Math.pow(cube, 3);
    }

    protected static void returnString(int a, int b, int c) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String str3 = String.valueOf(c);
        System.out.println(str1 + "-" + str2 + "-" + str3);
    }

    protected static void arraySort() {
        System.out.println("Введите число от 0 до 50:");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = scanner.nextInt();
        int[] c = new int[number];
        for (int i = 0; i < c.length; i++) {
            c[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
