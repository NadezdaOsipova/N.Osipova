public class Main {
    public static void main(String[] args) {
       /* Calculator calculator = new Calculator();
        System.out.println(calculator.summ(2,3));
        calculator.summa(4,5);*/

        Person person = new Person();
        person.setName("Вася");
        person.setAge(18);
        person.setSalary(18000);

        System.out.println(person.getName() + person.getAge() + person.getSalary());
        System.out.println(person.showCleanSalary());

    }
}
