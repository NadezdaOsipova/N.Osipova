package hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeterminationOfTheZodiacSign {
    public static void main(String[] args) {
        System.out.println("Введите месяц и дату рождения:" +
                "например, 27.03");
        Scanner scanner = new Scanner(System.in);
        try {
            double number = scanner.nextDouble();
            Zodiac zodiac = new Zodiac();
            zodiac.birthdayNumber(number);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Введено некорректное число!");
        }
    }
}
/* Овен (Aries) 21 марта – 20 апреля
Телец (Taurus) 21 апреля – 20 мая
Близнецы (Gemini) 21 мая – 21 июня
Рак (Cancer) 22 июня – 22 июля
Лев (Leo) 23 июля – 23 августа
Дева (Virgo) 24 августа – 23 сентября
Весы (Libra) 24 сентября – 23 октября
Скорпион (Scorpio) 24 октября – 22 ноября
Стрелец (Sagittarius) 23 ноября – 21 декабря
Козерог (Capricorn) 22 декабря – 20 января
Водолей (Aquarius) 21 января – 20 февраля
Рыбы (Pisces) 21 февраля – 20 марта*/