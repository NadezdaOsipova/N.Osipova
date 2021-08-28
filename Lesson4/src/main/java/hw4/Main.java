package hw4;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван","Иванов",18,1234567);
        Person person1 = new Person("Федор","Федоров",12,1234567);

        person.printAllInformation();
        person.printName();
        person.isAdult();

        person1.printAllInformation();
        person1.printName();
        person1.isAdult();
    }
}
