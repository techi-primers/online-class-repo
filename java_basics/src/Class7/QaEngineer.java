package Class7;

public class QaEngineer extends Engineer{

    public QaEngineer(Integer experienceLevel, Integer allowances, Integer basicSalary) {
        super(experienceLevel, allowances, basicSalary);
    }

    public void doTesting() {
        System.out.println("Im doing testing");
    }

    public Integer calculateSalary() {
        return super.getBasicSalary() + super.getAllowances();
    }

    public void markAttendance() {
        System.out.println("Mark Attendance by Software Engineer");
    }

}
