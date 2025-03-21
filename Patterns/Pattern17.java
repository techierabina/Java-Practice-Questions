/*
F 
E F 
D E F 
C D E F 
B C D E F
 */

import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            char ch = (char) ('F' - i); // Start from 'F', decreasing each row
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + j) + " ");
            }
            System.out.println();
        }
    }
}
