package com.assignment.hrapplication;

import java.awt.print.Book;
import java.util.ArrayList;

public class Employee {

    String title;
    String forename;
    String surname;
    String dOB;
    String address1;
    String town;
    String county;
    String postCode;
    String contactNumber;
    String emailAddress;
    int employeeID;
    String position;
    String startDate;

    public static ArrayList<Employee> employees = new ArrayList<>();

    public Employee(){

    }

    public Employee(String title, String forename, String surname, String dOB, String address1, String town, String county, String postCode, String contactNumber, String emailAddress, int employeeID, String position, String startDate) {

        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.dOB = dOB;
        this.address1 = address1;
        this.town = town;
        this.county = county;
        this.postCode = postCode;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.employeeID = employeeID;
        this.position = position;
        this.startDate = startDate;

    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getForename () {
        return forename;
    }

    public void setForename (String forename) {
        this.forename = forename;
    }

    public String getSurname () {
        return surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public String getdOB () {
        return dOB;
    }

    public void setdOB (String dOB) {
        this.dOB = dOB;
    }

    public String getAddress1 () {
        return address1;
    }

    public void setAddress1 (String address1) {
        this.address1 = address1;
    }

    public String getTown () {
        return town;
    }

    public void setTown (String town) {
        this.town = town;
    }

    public String getCounty () {
        return county;
    }

    public void setCounty (String county) {
        this.county = county;
    }

    public String getPostCode () {
        return postCode;
    }

    public void setPostCode (String postCode) {
        this.postCode = postCode;
    }

    public String getContactNumber () {
        return contactNumber;
    }

    public void setContactNumber (String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress () {
        return emailAddress;
    }

    public void setEmailAddress (String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getEmployeeID () {
        return employeeID;
    }

    public void setEmployeeID (int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition () {
        return position;
    }

    public void setPosition (String position) {
        this.position = position;
    }

    public String getStartDate () {
        return startDate;
    }

    public void setStartDate (String startDate) {
        this.startDate = startDate;
    }

    public static void addNewEmployee (Employee employee) {
        if (employees.size() > 0) {
            for (Employee e : employees) {
                if (!employees.contains(employee)) {
                    employees.add(employee);
                    break;
                } else
                    System.out.println("This Employee is already in your list.");

            }
        } else {
            employees.add(employee);
        }
    }


}
