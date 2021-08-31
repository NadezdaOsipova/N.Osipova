package hw5.Tester;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester("Иван", "Иванов", 3, "В1", 500.5);
        /*метод salaryIncrease() не может вывестись в классе Main, тк имеет модикатор доступа private
        с ним можно работать только в классе Tester*/
        System.out.println(tester.experienceInMonths());// по умолчанию (класс, пакет )
        tester.fullName();//protected  (класс, пакет и наследники)
        tester.info();// public (везде)

        System.out.println(tester.getName()); //protected  (класс, пакет и наследники)
        System.out.println(tester.setName("Алексей"));//protected  (класс, пакет и наследники)

        System.out.println(tester.getSurname());//protected  (класс, пакет и наследники)
        System.out.println(tester.setSurname("Алексеев"));//protected  (класс, пакет и наследники)

        System.out.println(tester.getExperienceInYears());//public (вызывается везде)
        System.out.println(tester.setExperienceInYears(5));//public (вызывается везде)

        System.out.println(tester.getEnglishLevel());//  по умолчанию (класс, пакет )
        System.out.println(tester.setEnglishLevel("A1"));//по умолчанию (класс, пакет )

        System.out.println(tester.getSalary());//private
        System.out.println(tester.setSalary(750.5));//private
    }
}
