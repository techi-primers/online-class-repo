package Class7;

import java.util.PrimitiveIterator;

public class SoftwareEngineer extends Engineer {

    private Integer joiningBonus;

    public SoftwareEngineer(Integer joiningBonus, Integer experienceLevel, Integer allowances, Integer basicSalary) {
        super(experienceLevel, allowances, basicSalary);
        this.joiningBonus = joiningBonus;
    }

    public SoftwareEngineer(Integer joiningBonus, Integer experienceLevel, Integer basicSalary) {
        super(experienceLevel, basicSalary);
        this.joiningBonus = joiningBonus;
    }

    public void doDevelopments() {
        System.out.println("Im doing developments");
    }

    public Integer calculateSalary() {
        return super.getBasicSalary() + super.getAllowances() + this.joiningBonus;
    }

    public void markAttendance() {
        System.out.println("Mark Attendance by Qa Engineer");
    }

}
