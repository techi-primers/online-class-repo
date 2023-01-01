package Interfaces;

public class EmployeeProfiile implements FinanceDepartment{
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

}
