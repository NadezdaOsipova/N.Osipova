package homeWork.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class forgottenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int[] myArray = new int[number];

        for (int i = 0; i < myArray.length; i++) {
            //  myArray[i] = (int) (Math.random() * (40 + 10) - 20);
            myArray[i] = (int) (Math.random() * 20);
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

  //     System.out.println("1. пройти по массиву, вывести все элементы в прямом и в обратном порядке.");
  //     for (int i = 0; i < myArray.length; i++) {
  //         System.out.print(myArray[i] + " ");
  //     }
  //     System.out.println();
  //     for (int i = myArray.length - 1; i >= 0; i--) {
  //         System.out.print(myArray[i] + " ");
  //     }
  //     System.out.println();
////азобраться, выводится херово
  //     System.out.println(" 2. найти минимальный-максимальный элементы и вывести.");
  //     int min, max;
  //     min = max = myArray[0];
  //     for (int i = 0; i < myArray.length; i++) {
  //         if (myArray[i] < min) {
  //             min = myArray[i];
  //             System.out.println("Mинимальноe значениe массива:" + min);
  //         }
  //         if (max < myArray[i]) {
  //             max = myArray[i];
  //             System.out.println("Mаксимальноe значениe массива:" + max);
  //         }
  //     }
  //     System.out.println();
//
  //     System.out.println(" 3. найти индекс минимального-максимального элементов и вывести.");
  //     int min1, max1;
  //     min1 = max1 = myArray[0];
  //     int minIndex, maxIndex;
  //     for (int i = 0; i < myArray.length; i++) {
  //         if (myArray[i] < min1) {
  //             min1 = myArray[i];
  //             minIndex = i;
  //             System.out.println("Индекс минимального значения массива:" + minIndex);
  //         }
  //         if (max1 < myArray[i]) {
  //             max1 = myArray[i];
  //             maxIndex = i;
  //             System.out.println("Индекс максимального значения массива:" + maxIndex);
  //         }
  //     }
  //     System.out.println();

  //     System.out.println("4. найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет");
  //     int count = 0;
  //     for (int i = 0; i < myArray.length; i++) {
  //         if (myArray[i] == 0) {
  //             count++;
  //             System.out.println(count);
  //         }
  //     }
  //     if (count == 0) {
  //         System.out.println("Нулевых элементов в массиве нет");
  //     }
  //     System.out.println();

        System.out.println(" 5. пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.");
        int temp;
        for (int i = myArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
            }
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println();
//
     //   System.out.println("6. проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)");
     //   boolean flag = true;
     //   for (int i = 1; i < myArray.length; i++) {
     //       if (myArray[i] <= myArray[i - 1]) {
     //           flag = false;
     //           break;
     //       }
     //   }
     //   if (flag) {
     //       System.out.println("Заданный масив является возрастающей последовательностью");
     //   } else {
     //       System.out.println("Заданный масив не является возрастающей последовательностью");
     //   }
    }//
}//
//


