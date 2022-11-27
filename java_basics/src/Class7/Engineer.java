package Class7;

public class Engineer extends Employee {

    private Integer experienceLevel;

    private Integer allowances;

    private Integer basicSalary;

    public Engineer(Integer experienceLevel, Integer allowances, Integer basicSalary) {
        this.experienceLevel = experienceLevel;
        this.allowances = allowances;
        this.basicSalary = basicSalary;
    }

    public Engineer(Integer experienceLevel, Integer basicSalary) {
        this.experienceLevel = experienceLevel;
        this.basicSalary = basicSalary;
    }


    public Integer getExperienceLevel() {
        return experienceLevel;
    }

    public Integer getAllowances() {
        return allowances;
    }

    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void markAttendance() {
        System.out.println("Mark Attendance by Employee");
    }


}
