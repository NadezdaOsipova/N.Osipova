package hw4;
import static hw4.Person.*;
import static hw4.MetodPersonImpl.*;
import static hw4.MetodPerson.*;


public class Main {

    public static void main(String[] args) {
       // Person person = new Person();

       Person person = new Person("Иван","Иванов",12,"Samsung");
        MetodPerson metodPerson = new MetodPersonImpl(person);
     //   Person person2 = new Person("Петр","Петров",21,"LG");
        //  Person person3 = new Person("Федор","Федоров",18,"Sony");
metodPerson.printAllInformation();
metodPerson.printName();
metodPerson.isAdult();//почему не выводится true|false
    }
}
