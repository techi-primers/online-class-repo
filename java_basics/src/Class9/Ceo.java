package Class9;

public class Ceo extends Employee{

    private final Double ceoBonus = 100000.00;
    private Integer woringHours = 9;
    private Integer hoursForCnference = 2;


    public void getSalary(){
        double calCSalary = getBasicSalary() + ceoBonus;
        System.out.println(calCSalary);
    }

    public void getWorkingTime() {
        Integer workingTime = woringHours + hoursForCnference;
    }


    @Override
    public void eat() {
        System.out.println("Eat from Ceo");
    }

    @Override
    public void sleep() {
        System.out.println("sleep from Ceo");
    }
}
