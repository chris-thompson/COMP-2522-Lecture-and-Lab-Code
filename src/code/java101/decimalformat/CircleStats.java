package code.java101.decimalformat;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Demonstrates the formatting of decimal values using the DecimalFormat class.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class CircleStats {

    /**
     * Calculates the area and circumference of a circle given its radius.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the circle's radius: ");
        final int radius = scan.nextInt();

        final double area = Math.PI * Math.pow(radius, 2);
        final double circumference = 2 * Math.PI * radius;

        // Round the output to three decimal places
        final DecimalFormat fmt = new DecimalFormat("0.00000");
        System.out.println("The circle's area: " + fmt.format(area));
        System.out.println("The circle's circumference: " + fmt.format(circumference));

        scan.close();
    }
}

