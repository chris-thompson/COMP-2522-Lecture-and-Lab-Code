package code.java101.numberformat;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Demonstrates the use of NumberFormat and the if-else statement.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class Wages {

    /**
     * Cues the user for the numbers of hours worked and calculates wages.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        final double rate = 8.25; // regular pay rate
        final double overtimeRate = rate * 1.5;
        final int standard = 40; // standard hours in a work week

        System.out.print("Enter the number of hours worked: ");
        final Scanner scan = new Scanner(System.in);
        final int hours = scan.nextInt();

        // Pays overtime at "time and a half"
        double pay = 0.0;
        if (hours > standard) {
            pay = standard * rate + (hours - standard) * overtimeRate;
        } else {
            pay = hours * rate;
        }

        final NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Gross earnings: " + fmt.format(pay));

        scan.close();
    }
}

