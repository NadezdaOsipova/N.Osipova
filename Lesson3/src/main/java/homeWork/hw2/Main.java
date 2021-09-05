package homeWork.hw2;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Проверить четное число или нечетное, вернуть boolean результат:");
        System.out.println(Metod1.evenNumber());
        System.out.println("2.Метод принимает массив и сортирует его.(Arrays.sort()");
        Metod1.arraySort();
        System.out.println("3.Найти минимальное число из 2 чисел, вернуть его");
        System.out.println(Metod1.minNumber());
        System.out.println("4.Возвести число в куб, вернуть результат возведения");
        System.out.println(Metod1.numberСube());
        System.out.println("5.Метод принимает числа a, b, c возвращает строку “a - b – c”");
        Metod1.returnString(2, 56, 78);
    }
}
