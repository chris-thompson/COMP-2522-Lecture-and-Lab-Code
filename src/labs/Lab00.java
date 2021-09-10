package labs;

import java.util.ArrayList;

/**
 * Some sample code we generated during Lab 0.
 *
 * @author BCIT
 * @version 2021
 */
public class Lab00 {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        int boundary = 10;
        while (boundary > 0) {
            System.out.println(boundary--);
        }

        double pi = Math.PI;
        do {
            System.out.println("This is a positive number");
            pi -= 1;
        } while (pi > 0);

        for (int i = 0; i < 100; ++i) {
            System.out.println(i);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Marti");
        names.add("April");
        names.add("Sally");
        names.add("Joel");
        for (String studentName : names) {
            System.out.println(studentName);
        }

        String name = "Kaz";
        String anotherName = name.toLowerCase();
        System.out.println(name);
        System.out.println(anotherName);
        System.out.println(name.toUpperCase());
    }
}
