package Class5;

import java.util.Date;

public class ExHospital {

    public static void main(String[] args) {
        System.out.println("-----------values assigning through public constructors");

        Patient patient1 = new Patient("John","headache",28,"Reg015");
        System.out.println(patient1.getPatientName());
        System.out.println(patient1.getDisease());

        System.out.println("-----------values assigning through getters and setters");

        StaffMember staffMember = new StaffMember();
        staffMember.setStaffMemberName("Jagath");
        staffMember.setDuty("1-5pm");

        System.out.println(staffMember.getStaffMemberName());
        System.out.println(staffMember.getDuty());


        System.out.println("/////// Method Overloading");

        Patient patient = new Patient();
        patient.doChanelDoctor("2022-8-8","John","0783833833","colombo");
        patient.doChanelDoctor("2022-8-8","John");
        patient.doChanelDoctor("2022-8-8");

    }

}





