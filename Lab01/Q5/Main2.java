
package com.mycompany.main2;

public class Main2 
{

    public static void main(String[] args) 
    {
       char grade = 'A';
      switch (grade) {
      case 'A':
        System.out.println("Excellent!");
       
      case 'D':
        System.out.println("You passed");
        break;
      case 'F':
        System.out.println("Better try again");
        break;
      default:
        System.out.println("Invalid grade");
    }
    System.out.println("Your grade is " + grade);
    }
}
