package Class9;

public class Assistant extends Employee{

    private Integer woringHours = 9;

    public void getSalary(){
        double calSalary = getBasicSalary();
        System.out.println(calSalary);
    }

    public void getWorkingTime() {
        Integer workingTime = woringHours;
        System.out.println(workingTime);
    }

    @Override
    public void eat() {
        System.out.println("Eat from Assistant");
    }

    @Override
    public void sleep() {
        System.out.println("sleep from Assistant");
    }
}
