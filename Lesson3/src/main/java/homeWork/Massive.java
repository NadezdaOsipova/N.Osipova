package homeWork;

public class Massive {

    void printMassiveAsLine(int[] array) {
        for (int arr : array) {
            System.out.print(arr);
        }
    }

    //который принимает в качестве аргументов массив и печатает его в консоли в одну строку,
    //ничего не возвращает;
    void printReverseMassiveAsLine(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i]);
        }
    }

    //который принимает в качестве аргументов массив и печатает его в консоли в одну строку
    //в обратном порядке, ничего не возвращает;
    int getSumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //который принимает массив, а возвращает сумму его элементов;
    int multiplyBy3(int[] array) {
int element = 0;
        for (int i = 0; i < array.length; i++) {
            element = array[i] * 3;
                              }
        return element;
    }
    //который принимает массив, умножает каждый элемент массива на 3 и возвращает умноженный массив;

}
