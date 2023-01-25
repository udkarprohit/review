package com.bridgelabz;

public class Patient {

    String patientName;
    int patientAge;
    String patientPhoneNumber;
    String patientCity;
    String patientState;
    String patientDepartment;

    //adding patient(non-static method)
    void addPatient(String pName,int pAge,String pPhoneNumber,String pCity,String pState,String pDepartment) {
        patientName = pName;
        patientAge = pAge;
        patientPhoneNumber = pPhoneNumber;
        patientCity = pCity;
        patientState = pState;
        patientDepartment = pDepartment;
        System.out.println("Name Of The Patient : " + patientName);
        System.out.println("Age Of The Patient : " + patientAge);
        System.out.println("Phone Number Of The Patient : " + patientPhoneNumber);
        System.out.println("City Of The Patient : " + patientCity);
        System.out.println("State Of The Patient : " + patientState);
        System.out.println("Department : " + patientDepartment);
    }

    enum Department {
        ONCOLOGY,
        NEUROLOGY,
        CARDIOLOGY,
        GYNOCOLOGY;
    }


}
