package lesson;

import java.util.Scanner;

public class gh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}
