/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
        File file = new File("some_file.txt");

        try {
            System.out.println("Reading the file...");
            file.read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
