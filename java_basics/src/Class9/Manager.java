package Class9;

public class Manager extends Employee{

    private Double allowances = 150000.00;
    private Double managerBonus = 100000.00;
    private Integer woringHours = 9;
    private final Integer extraHours = 4;

    public void getSalary(){
        double calSalary = getBasicSalary() + allowances + managerBonus;
        System.out.println(calSalary);
    }

    public void getWorkingTime() {
        Integer workingTime = woringHours + extraHours;
    }

    @Override
    public void eat() {
        System.out.println("Eat from Manger");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep from Manger");
    }
}
