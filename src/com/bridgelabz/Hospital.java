package com.bridgelabz;

public class Hospital {
    //instance variables
    String hName;
    String hLocation;
    String hDepartment;


    void multipleHospital(String hName,String hLocation,String hDepartment) {
        Patient patient = new Patient();
        this.hName = hName;
        this.hLocation = hLocation;
        this.hDepartment = hDepartment;
        System.out.println("Name Of The Hospital : " + hName);
        System.out.println("Name Of The Hospital : " + hLocation);
        System.out.println("Name Of The Hospital : " + hDepartment);
        System.out.println("");
    }

}
