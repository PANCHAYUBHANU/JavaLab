/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testinheritance;

/**
 *
 * @author asus
 */
public class TestInheritance {

    public static void main(String[] args) {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println(b.returnIt()); // 9

        SuperC c = new SuperC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println(c.returnIt()); // 6
    }
}
