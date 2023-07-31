
package com.mycompany.main;

public class Employee
{
    private String name;
    private int basicSalary;
    private int bonus;

    public Employee(String name, int basicSalary, int bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int calculateBonusAmount() {
        return basicSalary + bonus;
    }
}
