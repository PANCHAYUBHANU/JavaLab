/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.division;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int numerator = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("The result of the division is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");
        }
    }
}
