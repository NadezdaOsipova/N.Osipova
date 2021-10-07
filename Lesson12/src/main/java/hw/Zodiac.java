package hw;

import static hw.ZodiacSign.*;

public class Zodiac {

    public void birthdayNumber(double number) {
        if (21.01 <= number && number <= 19.02) {
            System.out.println("Вы рождены под знаком зодиака" + AQUARIUS + " - ВОДОЛЕЙ");
        } else if (20.02 <= number && number <= 20.03) {
            System.out.println("Вы рождены под знаком зодиака" + PISCES + " - РЫБЫ");
        } else if (21.03 <= number && number <= 20.04) {
            System.out.println("Вы рождены под знаком зодиака" + ARIES + " - ОВЕН");
        } else if (21.04 <= number && number <= 20.05) {
            System.out.println("Вы рождены под знаком зодиака" + TAURUS + " - ТЕЛЕЦ");
        } else if (21.05 <= number && number <= 21.06) {
            System.out.println("Вы рождены под знаком зодиака" + GEMINI + " - БЛИЗНЕЦЫ");
        } else if (22.06 <= number && number <= 22.07) {
            System.out.println("Вы рождены под знаком зодиака" + CANCER + " - РАК");
        } else if (23.07 <= number && number <= 23.08) {
            System.out.println("Вы рождены под знаком зодиака" + LEO + " - ЛЕВ");
        } else if (24.08 <= number && number <= 23.09) {
            System.out.println("Вы рождены под знаком зодиака" + VIRGO + " - ДЕВА");
        } else if (24.09 <= number && number <= 23.10) {
            System.out.println("Вы рождены под знаком зодиака" + LIBRA + " - ВЕСЫ");
        } else if (24.10 <= number && number <= 22.11) {
            System.out.println("Вы рождены под знаком зодиака" + SCORPIO + " - СКОРПИОН");
        } else if (23.11 <= number && number <= 21.12) {
            System.out.println("Вы рождены под знаком зодиака" + SAGITTARIUS + " - СТРЕЛЕЦ");
        } else if (22.12 <= number && number <= 20.01) {
            System.out.println("Вы рождены под знаком зодиака" + CAPRICORN + " - КОЗЕРОГ");
        } else {
            System.out.println("Проверьте правильность введения даты рождения!");
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