package com.bridgelabz;

import java.util.ArrayList;

/*
HospitalList =[
h1={p1},
h2={p2},
h3={p3},
]
* */
public class HospitalMain {

    static ArrayList<Hospital> listOfHospitals = new ArrayList<>();

    public static void main(String[] args) {

        Hospital hospitalOne = new Hospital();
        hospitalOne.addHospital("Care Hospitals", "TS", String.valueOf(Patient.Department.CARDIOLOGY));

        Hospital hospitalTwo = new Hospital();
        hospitalTwo.addHospital("AIG Hospitals", "AP", String.valueOf(Patient.Department.NEUROLOGY));

        System.out.println("**************");
        Patient patientOne = new Patient();
        patientOne.addPatient("Prohit", 21, "9182999975", "HYD", "TS", String.valueOf(Patient.Department.CARDIOLOGY));

        System.out.println("**************");
        Patient patientTwo = new Patient();
        patientTwo.addPatient("Rohith", 22, "9182998972", "RR", "AP", String.valueOf(Patient.Department.NEUROLOGY));

        hospitalOne.setPatientAddHospital(patientOne, hospitalOne);
        hospitalTwo.setPatientAddHospital(patientTwo, hospitalTwo);

        System.out.println();
        for (Hospital obj : listOfHospitals) {
            System.out.println("Hospital name => " + obj.hName + " Patient name => " + obj.patient.patientName);
        }

    }
}
