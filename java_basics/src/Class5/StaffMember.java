package Class5;

public class StaffMember {

    private String staffMemberName;
    private String duty;

    public StaffMember(String staffMemberName, String duty) {
        this.staffMemberName = staffMemberName;
        this.duty = duty;
    }

    public StaffMember() {
    }

    public String getStaffMemberName() {
        return staffMemberName;
    }

    public void setStaffMemberName(String staffMemberName) {
        this.staffMemberName = staffMemberName;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void prepareSalary() {


    }
}
