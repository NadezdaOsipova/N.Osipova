package hw6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork6 {
    /* Все задания выполнить в отдельных классах
     Строки:
 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины. (Посмотреть способы сортировки)
 3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину.
 4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
 5. Ввести 3 строки с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром. Если таких слов больше одного, найти второе из них.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любые 3 слова:");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();
        // String[] words = {word1, word2, word3};
        int а = word1.length();
        int b = word2.length();
        int c = word3.length();

        if (a > word2.length()) {
            if (word1.length() > word3.length()) {
                System.out.println(word1);
            } else {
                if (word2.length() > word3.length()) {
                    System.out.println(word2);
                } else {
                    System.out.println(word3);
                }

            }
        }


        // System.out.println("5. Среди слов, состоящих только из цифр, найти слово-палиндром. Если таких слов больше одного, найти второе из них:");
        // System.out.println("Введите любые 3 слова, состоящие из цифр:");
        // int number1 = scanner.nextInt();
        // int number2 = scanner.nextInt();
        // int number3 = scanner.nextInt();
//
        // int[] numbers = {number1, number2, number3};
        // for (int i = 0; i < numbers.length; i++) {
        //     String result = new StringBuilder(String.valueOf(numbers[i])).reverse().toString();
        //     if (result.equalsIgnoreCase(String.valueOf(numbers[i]))) {
        //         System.out.println(numbers[i] + " - является словом-палиндромом");
        //     }
        // }

    }
}
