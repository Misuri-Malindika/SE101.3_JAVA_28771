
package com.mycompany.q2;

/**
 *
 * @author Misuri
 */

public class Employee {
    private String name;
    private double basicSalary;
    private double bonus;

    // Constructor with bonus parameter
    public Employee(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    // Method to calculate bonus amount
    public double getBonusAmount() {
        return basicSalary + bonus;
    }
}

