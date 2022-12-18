package Class9;

public class MyMain {

    public static void main(String[] args) {

        /*Employee e = new Employee();
        e.getBasicSalary()*/

        System.out.println("Manager");
        // get Manger Details
        System.out.println("Manager Arun");
        Employee arun = new Manager();
        arun.setBasicSalary(250000.00);
        arun.getSalary();
        arun.getWorkingTime();

        System.out.println("Manager Fer");
        Employee fer = new Manager();
        fer.setBasicSalary(300000.00);
        fer.getSalary();

        fer.eat();
        fer.sleep();


        System.out.println("CEO");
        // get Ceo Details
        Employee ceo = new Ceo();
        ceo.setBasicSalary(350000.00);
        ceo.getSalary();
        ceo.getWorkingTime();
        ceo.eat();
        ceo.sleep();

        System.out.println("Assistant");
        // get Assitant Details
        Employee assistant = new Assistant();
        assistant.setBasicSalary(70000.00);
        assistant.getSalary();

        assistant.getWorkingTime();
        assistant.eat();
        assistant.sleep();

    }
}
