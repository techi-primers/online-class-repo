package Class7;

public class BaseClass {

    public static void main(String[] args) {
        QaEngineer qaEngineer = new QaEngineer(4,150000,300000);
        Integer qaSalary = qaEngineer.calculateSalary();
        System.out.println("QA Salary "+qaSalary);

        SoftwareEngineer softwareEngineer = new SoftwareEngineer(100000,5,250000,500000);
        System.out.println(softwareEngineer.calculateSalary());

        SoftwareEngineer softwareEngineer2 = new SoftwareEngineer(100000,5,500000);
        System.out.println(softwareEngineer.calculateSalary());

        //Pholymorphism 1. runtime
        //                2. compilie time
        //QaEngineer qaEngineer1 = new Engineer();
        //dynamic method dispatch
    }
}
