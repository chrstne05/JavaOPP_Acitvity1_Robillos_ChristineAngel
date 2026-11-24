/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robillos_javaopp.pkg1;

/**
 *
 * @author ROBILLOS_CPE113
 */
public class Robillos_JavaOpp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);

        // Display initial account balances
        System.out.println("Initial Account Balances");
        System.out.println("Mia: " + mia.getCredits());
        System.out.println("Luis: " + luis.getCredits());

        System.out.println();

        // Mia prints 4 pages
        System.out.println("Mia prints 4 pages: " + mia.printPages(4));
        System.out.println("Mia: " + mia.getCredits());

        System.out.println();
            
        // Mia tries to print 7 pages
        System.out.println("Mia tries to print 7 pages: " + mia.printPages(7));
        System.out.println("Mia: " + mia.getCredits());

        System.out.println();

        // Mia tries to add -3 credits
        System.out.println("Mia tries to add -3 credits: " + mia.addCredits(-3));
        System.out.println("Mia: " + mia.getCredits());

        System.out.println();

        // Mia adds 4 credits
        System.out.println("Mia adds 4 credits: " + mia.addCredits(4));

        // Final account balances
        System.out.println("Final Account Balances");
        System.out.println("Mia: " + mia.getCredits());
        System.out.println("Luis: " + luis.getCredits());
    }

}
