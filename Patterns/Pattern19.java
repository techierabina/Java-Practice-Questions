/*
*     *
**   **
*** ***
*******
*** ***
**   **
*     *
 */
import java.util.Scanner;
public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd number for the pattern size: ");
        int size = sc.nextInt();

        if (size % 2 == 0) {
            System.out.println("Please enter an odd number for symmetry.");
            return;
        }

        // Upper half of the pattern
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = 0; j < size; j++) {
                if (j <= i || j >= size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the pattern
        for (int i = size / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                if (j <= i || j >= size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}