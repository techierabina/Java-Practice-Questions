import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern (odd number preferred): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1)) + 1;
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line
        }

        sc.close();
    }
}
