package hw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PaperSheet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(25);
        //метод add
        //1)вариант Обычное добавление
        list.add(10);
        list.add(15);
        System.out.println(list);
        //2 вариант Добавление в начало и конец списка
        list.add(0, 5);
        list.add(list.size(), 20);
        System.out.println(list);
        //метод addAll
        ArrayList<Integer> list2 = new ArrayList<>();
        //1)вариант Добавление элементов в конец списка из предыдущего ArrayList
        list2.add(0);
        list2.addAll(list);
        System.out.println("list2" + list2);
        //2 вариант Добавление ArrayList в определенную позицию
        list2.add(6);
        list.addAll(0, list);
        System.out.println("list2 + list1 " + list2);

        Integer[] arrInt = {1, 2, 3};
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, arrInt);//добавляем массив
        list3.addAll(3, list2);
        Collections.addAll(list3, 7, 8, 9);
        System.out.println("list3" + list3);
        // Collections.copy(list, list3);
        //System.out.println(list);
        list3.subList(0, 5).clear();
        System.out.println("subList" + list3);
        list3.clear();
        System.out.println("clear list3" + list3);
        System.out.println("list2" + list2);
        list2.remove(3);
        System.out.println("remove [index 3] list2" + list2);
        System.out.println("remove удаление элемента, соответсвующего объекту" + " " + list2.remove(Integer.valueOf(2)));
        System.out.println(list2);
        System.out.println("remove удаление элемента, соответсвующего объекту" + " " + list2.remove(Integer.valueOf("6")));
        System.out.println(list2);

    }

}
