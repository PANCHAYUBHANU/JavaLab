/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeDB {

    private JFrame frame;
    private JPanel mainPanel, insertPanel, searchPanel;
    private JTextField nameField, idField, ageField, genderField, departmentField;
    private JButton insertButton, searchButton, updateButton, deleteButton;
    private Connection connection;

    public EmployeeDB() {
        frame = new JFrame("Employee DB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        insertPanel = new JPanel();
        insertPanel.setLayout(new GridLayout(5, 2));
        insertPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        insertPanel.add(nameField);
        insertPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        insertPanel.add(idField);
        insertPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        insertPanel.add(ageField);
        insertPanel.add(new JLabel("Gender:"));
        genderField = new JTextField();
        insertPanel.add(genderField);
        insertPanel.add(new JLabel("Department:"));
        departmentField = new JTextField();
        insertPanel.add(departmentField);
        insertPanel.add(insertButton);

        searchPanel = new JPanel();
        searchPanel.setLayout(new GridLayout(2, 2));
        searchPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        searchPanel.add(idField);
        searchPanel.add(searchButton);
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        searchPanel.add(updateButton);
        searchPanel.add(deleteButton);

        mainPanel.add(insertPanel);
        mainPanel.add(searchPanel);

        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int id = Integer.parseInt(idField.getText());
                int age = Integer.parseInt(ageField.getText());
                String gender = genderField.getText();
                int department = Integer.parseInt(departmentField.getText());

                try {
                    Statement statement = connection.createStatement();
                    String sql = "INSERT INTO employee (name, id, age, gender, department) VALUES ('" + name + "', " + id + ", " + age + ", '" + gender + "', " + department + ")";
                    statement.executeUpdate(sql);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());

                try {
                    Statement statement = connection.createStatement();
                    String sql = "SELECT * FROM employee WHERE id = " + id;
                    ResultSet resultSet = statement.executeQuery(sql);

                    if (resultSet.next()) {
                        nameField.setText(resultSet.getString("name"));
                        ageField.setText(String.valueOf(resultSet.getInt("age")));
                        genderField.setText(resultSet.getString("gender"));
                        departmentField.setText(String.valueOf(resultSet.getInt("department")));
                    }
                
                } 
                
                catch(SQLException e)
                {
                    System.out.println(e.getMessage());
                }
            }
