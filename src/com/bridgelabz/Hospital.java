package com.bridgelabz;

public class Hospital {

//    HospitalMain obj =new HospitalMain();
    //instance variables
    String hName;
    String hLocation;
    String hDepartment;
    Patient patient;

    void addHospital(String hName,String hLocation,String hDepartment) {
//        Patient patient = new Patient();
        this.hName = hName;
        this.hLocation = hLocation;
        this.hDepartment = hDepartment;
        System.out.println("Name Of The Hospital : " + hName);
        System.out.println("Hospital Location: " + hLocation);
        System.out.println("Department : " + hDepartment);
        System.out.println("");
    }
    void setPatientAddHospital(Patient patient,Hospital hospital) {
        hospital.patient = patient;
        HospitalMain.listOfHospitals.add(hospital);
    }
}
