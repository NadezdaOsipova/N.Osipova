package lesson;

import java.util.*;

public class W {
    public static void main(String[] args) {
        //    List<String> list = new ArrayList<>();
        //    list.add("Belarus");
        //    list.add("Russia");
        //    list.add("Deutch");

        //   Iterator<String> iterator = list.iterator();
        //   while (iterator.hasNext()) {
        //       System.out.println(iterator.next());
        //       iterator.remove();
        //   }
        //   System.out.println(list.size());


        // list.set(1, "Poland");
        // list.remove(1);
        // list.remove("Deutch");
        // System.out.println(list.indexOf("Belarus"));
        // System.out.println(list.contains("UK"));

        // LinkedList<String> stringLinkedList = new LinkedList<>();
        // stringLinkedList.addFirst("Belarus");
        // stringLinkedList.addFirst("Russia");
        // stringLinkedList.addLast("Deutch");
        // stringLinkedList.addLast("Poland");
        // System.out.println(stringLinkedList);
        // stringLinkedList.removeFirst();
        // stringLinkedList.removeLast();
        // System.out.println(stringLinkedList);
        // System.out.println(stringLinkedList.getFirst());
        // System.out.println(stringLinkedList.getLast());
        // System.out.println(stringLinkedList);
        //HashSet <String> hashSet = new HashSet<>();
        //hashSet.add("Bob");
        //hashSet.add("Tom");
        //hashSet.add("Pol");
        //hashSet.add("Sam");
        //for (String set:hashSet) {
        //    System.out.println(set);
        //}
        //hashSet.remove("Bob");
        //hashSet.remove("Tom");
        //hashSet.remove("Pol");
        //System.out.println(hashSet.size());

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "11");
        map.put(2, "22");
        map.put(3, "33");

        map.remove(1);
        map.remove(2);
        System.out.println(map.get(3));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsValue("44"));
    }
}

