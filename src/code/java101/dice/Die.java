package code.java101.dice;

import java.util.Random;

/**
 * Die represents a six-sided die.
 *
 * @author BCIT
 * @version 2020
 */
public class Die {

    /**
     * The number of sides.
     */
    public static final int SIDES = 6;

    private int faceValue;
    private final Random randomNumberGenerator;

    /**
     * Constructs a Die object.
     */
    public Die() {
        faceValue = 1;
        randomNumberGenerator = new Random();
    }

    /**
     * Rolls this Die and returns the result.
     *
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = randomNumberGenerator.nextInt(SIDES) + 1;
        return faceValue;
    }

    /**
     * Returns the face value of this Die as an int.
     *
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     *
     * @param value an int
     */
    public void setFaceValue(final int value) {
        if (value > 0 && value <= SIDES) {
            faceValue = value;
        }
    }


    /**
     * Returns a String representation of this Die.
     *
     * @return toString description
     */
    @Override
    public String toString() {
        return "Die{" + "faceValue=" + faceValue + "}";
    }

    /**
     * Demonstrates the use of this class.
     *
     * @param args
     */
    public static void main(final String[] args) {
        Die testDie = new Die();
        int roll = testDie.roll();
        int faceValue = testDie.getFaceValue();
        System.out.println(roll == faceValue);
        System.out.println(testDie.toString());
    }
}

