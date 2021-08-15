import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private int salary;

public double showCleanSalary () {
    return (double) (salary - salary*0.13);
}
}
