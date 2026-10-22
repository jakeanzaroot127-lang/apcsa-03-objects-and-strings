/**
 * Exercise 4 — CharMath
 *
 * Characters are stored as numbers. Explore that.
 *
 * TODO:
 *   1. Print the numeric value of 'A', 'a', 'Z', '0', and ' '
 *   2. Print what (char)(65) is
 *   3. Print the letter that comes after 'M' using arithmetic
 *   4. Figure out and print the numeric GAP between 'A' and 'a'
 *
 * Hint: to see a char as a number, add 0 or cast to int.
 *       To see a number as a char, cast to char.
 */
public class CharMath {
    public static void main(String[] args) {
        System.out.println((int) 'A');
        System.out.println((int) 'a');
        System.out.println((int) 'Z');
        System.out.println((int) '0');
        System.out.println((int) ' ');

        System.out.println((char)(65));
        System.out.println((char) ('M' + 1));
        System.out.println((int) ('A' - 'a'));
        // Your code here

    }
}
