/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robillos_javaopp.pkg1;

/**
 *
 * @author ROBILLOS_CPE113
 */
public class PrintAccount {
    private String studentName;
    private int credits;

    // Constructor
    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;

        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    // Add credits
    public boolean addCredits(int amount) {
        if (amount <= 0) {
            return false;
        }

        this.credits += amount;
        return true;
    }

    // Print pages
    public boolean printPages(int pages) {
        if (pages <= 0 || pages > credits) {
            return false;
        }

        this.credits -= pages;
        return true;
    }

    // Get credits
    public int getCredits() {
        return this.credits;
    }

    // Get student name
    public String getStudentName() {
        return this.studentName;
    }
}
