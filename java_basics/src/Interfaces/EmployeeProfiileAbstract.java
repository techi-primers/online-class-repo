package Interfaces;

public class EmployeeProfiileAbstract extends HeadOfHr{
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

    @Override
    public String getCommonInfo() {
        return "common method body from emp rpfilemulti inheritnace commmm....";
    }

    @Override
    public String getFinalApproval() {
        return "get Final Approval";
    }
}
