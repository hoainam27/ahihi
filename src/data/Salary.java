/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author HOAI NAM
 */
public class Salary {
    private float basicSalary;
    private float overtimeRate;
    private float hoursWorked;

    public Salary(float basicSalary, float overtimeRate) {
        this.basicSalary = basicSalary;
        this.overtimeRate = overtimeRate;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(float overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float calculateTotalSalary() {
        float totalSalary = basicSalary;
        if (hoursWorked > 40) {
            float overtimeHours = hoursWorked - 40;
            totalSalary += overtimeHours * overtimeRate;
        }
        return totalSalary;
    }

    @Override
    public String toString() {
        return "Salary: \nBasic Salary: " + basicSalary + "\nOvertime Rate: " + overtimeRate + "\nHours Worked: " + hoursWorked + "\nTotal Salary: " + calculateTotalSalary();
    }
}
