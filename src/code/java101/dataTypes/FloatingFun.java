package code.java101.dataTypes;

/**
 * Demonstrates some floating point number properties.
 *
 * @author BCIT
 * @version 2022
 */
public class FloatingFun {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        final double aValue = 1.0 / 0;
        System.out.println(aValue);

        final double anotherValue = -1.0 / 0;
        System.out.println(anotherValue);

        // This will throw an Arithmetic Exception
        // double yetAnotherValue = 0 / 0;
        // System.out.println(yetAnotherValue);
    }
}
