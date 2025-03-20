/*   *
    ***
   *****
  *******
 *********
*********** */

public class Pattern7 {
    public static void main(String[] args) {
        int n = 6; // Number of rows
        
        for (int i = 0; i < n; i++) {
            // Printing spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}
