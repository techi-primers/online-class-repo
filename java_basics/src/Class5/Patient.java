package Class5;

import java.util.List;

public class Patient {

    private String patientName;
    private String disease;
    private Integer age;
    private String registeredNo;

    // CONSTRUCTOR OVERLOADING
    public Patient(String patientName, String disease, Integer age, String registeredNo) {
        this.patientName = patientName;
        this.disease = disease;
        this.age = age;
        this.registeredNo = registeredNo;
    }
    public Patient(String patientName, String disease) {
        this.patientName = patientName;
        this.disease = disease;
    }

    public Patient(String patientName) {
        this.patientName = patientName;
    }

    public Patient(Integer age, String registeredNo) {
        this.age = age;
        this.registeredNo = registeredNo;
    }

    public Patient() {
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDisease() {
        return disease;
    }

    public Integer getAge() {
        return age;
    }

    public String getRegisteredNo() {
        return registeredNo;
    }

    public void register() {


    }

    // METHOD OVERLOADING

    public void doChanelDoctor(String date, String docname, String contact, String location) {

        System.out.println("Method with all arguments");

    }

    public void doChanelDoctor(String date, String docname) {
        System.out.println("Method with two arguments");

    }

    public void doChanelDoctor(String date) {
        System.out.println("Method with one arguments");

    }


}

