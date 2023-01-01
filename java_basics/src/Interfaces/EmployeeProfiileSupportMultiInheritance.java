package Interfaces;

/*can replace Finance and Hr Department Interface with common interface*/
public class EmployeeProfiileSupportMultiInheritance implements FinanceDepartment, HrDepartments{
    @Override
    public String getSalarySlip() {
        return "this is the salary slip for jun";
    }

    @Override
    public String getInfo() {
       return "return get info from Emp  profile";
    }

    @Override
    public String calculateSalary() {
        return "aowances+basic+dollarrate";
    }

    @Override
    public String getServiceLetter() {
        return "get Serice letter from Employee Profile Multi Inheritance";
    }
}
