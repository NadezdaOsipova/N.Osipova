package lesson;
import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.");
        System.out.println("Введите 3 строки:");
        String line = scanner.nextLine();
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String[] lins = {line, line1, line2};
        String minValue = lins[0];
        String maxValue = lins[0];

        for (int i = 0; i < lins.length; i++) {
            if (lins[i].length() >= maxValue.length()) {
                maxValue = lins[i];
            }
            if (lins[i].length() <= minValue.length()) {
                minValue = lins[i];
            }
        }
        System.out.println(maxValue);
        System.out.println(minValue);

        System.out.println("2. Упорядочить и вывести строки в порядке возрастания значений их длины. (Посмотреть способы сортировки)");
        System.out.println("Введите 3 строки:");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        String[] strings = {string1, string2, string3};

        for (int i = strings.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("3. Вывести на консоль те строки, длина которых меньше средней, а также их длину.");
        System.out.println("Введите 3 строки:");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();
        String[] words = {word1, word2, word3};

        double mean = 0;
        for (int i = 0; i < words.length; i++) {
            mean = (mean + ((double) words[i].length()));
        }
        mean = mean / words.length;
        for (String word : words) {
            if (word.length() > mean) {
                System.out.println(word);
                System.out.println(word.length());
            }
        }

        System.out.println("4. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.");
        String[] arrWords = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите слово:");
            words[i] = scanner.nextLine();
        }
        for (String word : arrWords) {
            boolean flag = true;
            for (int i = 0; i < arrWords.length - 1; i++) {
                for (int j = i + 1; j < arrWords.length; j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(word);
                break;
            }
        }

        System.out.println("5. Среди слов, состоящих только из цифр, найти слово-палиндром. Если таких слов больше одного, найти" +
                " второе из них.\n");
        System.out.println("Введите 3 строки, состоящие из цифр:");
        String number1 = String.valueOf(scanner.nextInt());
        String number2 = String.valueOf(scanner.nextInt());
        String number3 = String.valueOf(scanner.nextInt());
        String[] numbers = {number1, number2, number3};

        for (int i = 0; i < numbers.length; i++) {
            String reverseString = new StringBuilder(numbers[i]).reverse().toString();
            if (reverseString.equalsIgnoreCase(numbers[i])) {
                System.out.println(numbers[i] + "- слово-палиндром");
            }
        }
    }
}
