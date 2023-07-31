/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main2;

/**
 *
 * @author asus
 */
public class Main2 {

    public static void main(String[] args) {
      int[] numbers = {10, 20, 30, 40, 50};
    for (int x : numbers) {
      if (x == 30) {
        continue;
      }
      System.out.println(x);
      System.out.println("\n");
    }
    System.out.println("I'm out of the loop now");

    }
}
