package homeWork.hw2;
/*Создать класс со следующими статическими методами:
        - Найти минимальное число из 2 чисел, вернуть его
        - Проверить четное число или нечетное, вернуть boolean результат
        - Возвести число в куб, вернуть результат возведения
        - Метод принимает числа a, b, c возвращает строку “a - b – c”
        - Метод принимает массив и сортирует его.(Arrays.sort())

        Все методы должны возвращать значения нужного типа. Примеры использования этих методов привести в main- методе
         текущего класса. Числа для работы генерируется автоматически используя Random или пользователь вводит их с клавиатуры.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Metod1 {
    //  Scanner scanner = new Scanner(System.in);
    //  int z = scanner.nextInt();
    protected static int minNumber() {
        int num1 = (int) (Math.random() * 25);
        int num2 = (int) (Math.random() * 70);
        if (num1 > num2) {
            return num2;
        }
        return num1;
    }

    protected static boolean evenNumber() {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        if (z % 2 == 0) {
            return true;
        }
        return false;
    }

    protected static int numberСube() {
        double cube = (int) (Math.random() * 25);
        return (int) Math.pow(cube, 3);
    }

    protected static void returnString(int a, int b, int c) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String str3 = String.valueOf(c);
        System.out.println(str1+"-"+str2+"-"+str3);
    }

    protected static void arraySort() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int []  c = new int[number];
        System.out.println(Arrays.toString(c));
      Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }


}
