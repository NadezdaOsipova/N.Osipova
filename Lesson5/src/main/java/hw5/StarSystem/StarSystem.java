package hw5.StarSystem;

import lombok.AllArgsConstructor;

/*Создать следующую иерархию наследования классов:
   Звездная система
	       |
Планета          Звезда
       |		     |
Земля  Марс    Солнце Сириус

Каждый из классов должен содержать хотя бы одно поле и один метод (отличающихся! от родительского) на ваш выбор.
*/
@AllArgsConstructor
public abstract class StarSystem { //родительский класс
    private int number;

    static int starLeftOrbit(int number) {
        return number - 1;
    }

}
