package Interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("......... Employee PRofile");
        EmployeeProfiile employeeProfiile = new EmployeeProfiile();
        System.out.println(employeeProfiile.calculateSalary());
        System.out.println(employeeProfiile.getInfo());
        System.out.println(employeeProfiile.getSalarySlip());

        System.out.println(".........ExampleA");

        ExampleA exampleA = new ExampleA();
        System.out.println(exampleA.calculateSalary());

        System.out.println(".........Employee Profile Support Inheritance");

        EmployeeProfiileSupportMultiInheritance employeeProfiileSupportMultiInheritance = new EmployeeProfiileSupportMultiInheritance();

        System.out.println(employeeProfiileSupportMultiInheritance.getServiceLetter());
        System.out.println(employeeProfiileSupportMultiInheritance.getInfo());

        System.out.println(".........Employee Profile Support Inheritance with common ");

        EmployeeProfiileSupportMultiInheritanceWithCommonInter employeeProfiileSupportMultiInheritanceWithCommonInter
                = new EmployeeProfiileSupportMultiInheritanceWithCommonInter();
        System.out.println(employeeProfiileSupportMultiInheritanceWithCommonInter.getCommonInfo());

        System.out.println(".........Head Of Hr ");

        EmployeeProfiileAbstract employeeProfiileAbstract = new EmployeeProfiileAbstract();
        System.out.println(employeeProfiileAbstract.getFinalApproval());
        System.out.println(employeeProfiileAbstract.getCommonInfo());
    }
}
