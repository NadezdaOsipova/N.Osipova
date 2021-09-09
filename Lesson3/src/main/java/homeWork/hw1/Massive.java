package homeWork.hw1;

public class Massive {
    /*который принимает в качестве аргументов массив и печатает его в консоли в одну строку,
    ничего не возвращает;*/
    void printMassiveAsLine(int[] array) {
        for (int arr : array) {
            System.out.print(arr);
        }
    }

    /*который принимает в качестве аргументов массив и печатает его в консоли в одну строку
    в обратном порядке, ничего не возвращает;*/
    void printReverseMassiveAsLine(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    //который принимает массив, а возвращает сумму его элементов;
    int getSumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //который принимает массив, умножает каждый элемент массива на 3 и возвращает умноженный массив;
    int[] multiplyBy3(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 3;
        }
        return array;
    }

    void printMassiveAsLine1(int[] multiplyBy3) {
        for (int arr : multiplyBy3) {
            System.out.print(arr + " ");
        }
    }

    void printReverseMassiveAsLine1(int[] multiplyBy3) {
        for (int i = multiplyBy3.length - 1; i >= 0; i--) {
            System.out.print((multiplyBy3[i]) + " ");
        }
    }

}
