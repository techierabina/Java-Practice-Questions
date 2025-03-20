/*
***********
 *********
  *******
   *****
    ***
 */

public class Pattern8 {
    public static void main(String[] args) {
        int n = 6; // Number of rows
        
        for (int i = 0; i < n; i++) {
            // Printing leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
