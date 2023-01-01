package Interfaces;

public interface FinanceDepartment {

    public String getSalarySlip();

    default public String getInfo() {
        return "return from finance interface";
    }

    default public String calculateSalary() {
        return "empBasic+alowances";
    }

    /*need to change the design*/
    //public String getCommonInfo();
}
