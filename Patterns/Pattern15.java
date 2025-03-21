/*
A 
B B 
C C C 
D D D D 
E E E E E 
 */
import java.util.Scanner;
public class Pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) { // Loop for rows (increasing)
            char ch = (char) ('A' + i); // Convert to corresponding alphabet
            for (int j = 0; j <= i; j++) { // Loop for characters
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}