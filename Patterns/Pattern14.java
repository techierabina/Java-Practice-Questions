/*
A B C D E 
A B C D 
A B C 
A B 
A 
 */
import java.util.Scanner;
public class Pattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) { // Loop for rows (decreasing)
            for (char ch = 'A'; ch < 'A' + i; ch++) { // Loop for characters
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}