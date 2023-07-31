

package com.mycompany.main;


public class Main 
{

    public static void main(String[] args) 
    {
        Student student = new Student("John Doe", 1256, "Computer Science");
        System.out.println(student.getName()); // John Doe
        System.out.println(student.getId()); // 123456
        System.out.println(student.getCourse()); // Computer Science

        Lecturer lecturer = new Lecturer("Jane Doe", 78902, "Computer Science");
        System.out.println(lecturer.getName()); // Jane Doe
        System.out.println(lecturer.getId()); // 789012
        System.out.println(lecturer.getProgramme()); // Computer Science
    }
}
