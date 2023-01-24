package com.bridgelabz;

public class HospitalMain {
    public static void main(String[] args) {

        Hospital hospitalOne = new Hospital();
        hospitalOne.multipleHospital("A", "TS","CARDIOLOGY");
        Hospital hospitalTwo = new Hospital();
        hospitalTwo.multipleHospital("B", "AP","NEUROLOGY");


        System.out.println("**************");
        Patient patientOne = new Patient();
        patientOne.addPatient("Prohit", 21, "9182999975", "HYD", "TS", "CARDIOLOGY");

        System.out.println("**************");
        Patient patientTwo = new Patient();
        patientTwo.addPatient("Rohith", 22, "9182998972", "RR", "AP", "NEUROLOGY");
    }
}
