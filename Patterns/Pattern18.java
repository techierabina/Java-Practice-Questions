/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
 */

import java.util.Scanner;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (half pattern height): ");
        int rows = sc.nextInt();

        // Upper half
        for (int i = 0; i < rows; i++) {
            // Left stars
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 0; i--) {
            // Left stars
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
