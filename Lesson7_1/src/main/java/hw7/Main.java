package hw7;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, чем бы Вы хотели покормить животное:\n\n"
                + "1 - Мясо\n"
                + "2 - Зерно\n"
        );
        int number = scanner.nextInt();
    }
}
