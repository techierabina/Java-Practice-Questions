import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print increasing characters
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Print decreasing characters
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println(); // Move to the next line
        }

        sc.close();
    }
}
