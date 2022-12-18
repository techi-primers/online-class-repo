package Class9;

public abstract class Employee extends Human{
// implement, extend
    private Double basicSalary;
    private Integer employeeId;

    abstract public void getSalary();

    abstract public void getWorkingTime();

    public Integer getEmployeeId() {
       return this.getEmployeeId();
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

}
