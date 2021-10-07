package lesson;

import java.util.LinkedList;
import java.util.List;

public class Basket<T1> {
    List<T1> list = new LinkedList();

    public void addElement(T1 element) {
        list.add(element);
    }

    public void removeElement(T1 element) {
        list.remove(element);
    }

    public void showBasket(T1 element) {
        System.out.println(list);
    }

}
