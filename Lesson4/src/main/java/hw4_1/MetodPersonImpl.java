package hw4_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MetodPersonImpl implements MetodPerson {
    private final Person person;

    @Override
    public void printAllInformation() {
        System.out.println(person.toString());
    }

    @Override
    public void printName() {
        System.out.println(person.getName() + " "+person.getSurname());
    }

    @Override
    public boolean isAdult() {
        if (person.age >= 18) {
            return true;
        }
        return false;
    }
}
