public class Pattern10 {
    public static void main(String[] args) {
        int n = 5; // Maximum number of stars in the middle row

        // Upper half (including middle row)
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half (excluding middle row to avoid duplication)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
