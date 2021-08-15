import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
       /*Scanner scanner = new Scanner(System.in);
          int i = 0;
           while (true) {
            System.out.println("Введите число:");
            i = scanner.nextInt();
            if (i == 5) {
                break;
            }
        }


        int x = scanner.nextInt();
        double[] mas_double = new double[x];
        for (int j = 0; j < mas_double.length; j++) {
            mas_double[j] = Math.random();
            System.out.println(mas_double[j]);
            mas_double[j] = Math.pow(mas_double[j], 2);
            System.out.println(mas_double[j]);
        }*/
        HY(new int[]{2, 4, 7});
        HY1("jhfjuy","ftyjfjh","ghcdhg");
    }


    public static void HY(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }
        System.out.println(summ);
    }



    public static void HY1(String ... args) {
        for (String animals:args) {
            System.out.print(animals + ", ");
        }
            }


}
