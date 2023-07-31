
package com.mycompany.main;

public class Main 
{

    public static void main(String[] args)
    {
        /*
        Employee e1 = new Employee();
        e1.setName("John Doe");
        e1.setAge(30);
        e1.setSalary(50000.0);

        // Get values using getters
        System.out.println("Name: " + e1.getName());
        System.out.println("Age: " + e1.getAge());
        System.out.println("Salary: " + e1.getSalary());
        */
        
        Employee e2 = new Employee("John", 39, 50000.0);

        // Get values using getters
        System.out.println("Name: " + e2.getName());
        System.out.println("Age: " + e2.getAge());
        System.out.println("Salary: " + e2.getSalary());
    }
}
