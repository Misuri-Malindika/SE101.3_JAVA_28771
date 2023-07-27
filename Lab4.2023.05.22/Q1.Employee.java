/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author Misuri
 */

public class Employee {
    private int empID;
    private String empName;
    private String empDesignation;

    // Constructor
    public Employee(int empID, String empName, String empDesignation) {
        this.empID = empID;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    // Getters
    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    // Setters
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }
}

