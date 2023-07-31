/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();

        
        mrBogdan.setEmpID(101);
        mrBogdan.setEmpName("Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");

        msBird.setEmpID(102);
        msBird.setEmpName("Bird");
        msBird.setEmpDesignation("Product Manager");

       
        System.out.println("Mr. Bogdan:");
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println();

        System.out.println("Ms. Bird:");
        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
}
