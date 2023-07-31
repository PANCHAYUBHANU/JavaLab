
package com.mycompany.main;


public class Main {

    public static void main(String[] args) 
    {
        SavingsAccount savingsAccount = new SavingsAccount("1234567890", 20000000);
CheckingAccount checkingAccount = new CheckingAccount("9876543210", 1000000);

double savingsInterest = savingsAccount.calculateInterest();
double checkingInterest = checkingAccount.calculateInterest();

double totalInterest = savingsInterest + checkingInterest;

System.out.println("The total interest is " + totalInterest);

    }
}
