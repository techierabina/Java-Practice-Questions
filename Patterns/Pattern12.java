import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        System.out.print("Enter the number of rows you want: ");
        Scanner sc=new Scanner(System.in);
        int rows = sc.nextInt();
       
        for (int i = 1; i <= rows; i++) {
            // Print first increasing sequence
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces in between
            int spaces = 2 * (rows - i);
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            // Print second decreasing sequence
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }
    }
}