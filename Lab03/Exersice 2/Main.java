
package com.mycompany.main;

public class Main 
{

    public static void main(String[] args) 
    {
        Employee e = new Employee("Bogdan", 50000, 10000);

        System.out.println("Employee Name: " + e.getName());
        System.out.println("Basic Salary: " + e.getBasicSalary());
        System.out.println("Bonus: " + e.getBonus());
        System.out.println("Bonus Amount: " + e.calculateBonusAmount());
    }
}
