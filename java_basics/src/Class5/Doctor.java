package Class5;

import java.util.Date;

public class Doctor {

    private String doctorName;
    private String wardNo;
    private Date availableTime;
    private String specifiedField;

    public Doctor(String doctorName, String wardNo, Date availableTime, String specifiedField) {
        this.doctorName = doctorName;
        this.wardNo = wardNo;
        this.availableTime = availableTime;
        this.specifiedField = specifiedField;
    }

    public void inspectPatient() {


    }
}
