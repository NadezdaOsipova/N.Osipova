package homeWork;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите число:");
        int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println(a + "- Вы ввели некорректное число!");
        }

        int[] myArray = new int[a];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        Massive massive = new Massive();
        System.out.println("_____");
        massive.printMassiveAsLine(myArray);
        System.out.println();
        massive.printReverseMassiveAsLine(myArray);
        System.out.println();
        System.out.println("_____");

        System.out.println(massive.getSumOfElements(myArray));
        System.out.println("_____");

        System.out.println(massive.multiplyBy3(myArray));
        System.out.println("_____");
    }
}
