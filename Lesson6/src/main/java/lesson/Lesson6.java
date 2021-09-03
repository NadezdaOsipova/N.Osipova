package lesson;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
        String x = "небо ";
        String e = "голубое";
        boolean g = true;

        System.out.println(x.concat(e));
        System.out.println(x + " " + e);

        System.out.println(x.equals(e));
        System.out.println(x.equalsIgnoreCase(e));

        System.out.println(x.substring(3));
        System.out.println(x.substring(2, 4));

        System.out.println(x.length());
        System.out.println(e.length());

        System.out.println(x.indexOf("е"));
        System.out.println(e.charAt(0));

        System.out.println(String.valueOf(g));

        System.out.println(x.toUpperCase());
        System.out.println(x.replace("б", "н"));

        System.out.println(x.trim());

        System.out.println(x.isEmpty());

        System.out.println(x.isBlank());

        System.out.println(Arrays.toString(x.split(" ")));

        StringBuilder stringBuilder = new StringBuilder(x);
        System.out.println(stringBuilder.append("xxxx"));
        System.out.println(stringBuilder.insert(5, "y"));
        System.out.println(stringBuilder.delete(3, 6));
        System.out.println(stringBuilder.reverse());


    }
}
