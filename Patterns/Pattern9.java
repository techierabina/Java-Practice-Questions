public class Pattern9 {
    public static void upperPyramid(int n){
         // Number of rows
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
    public static void lowerPyramid(int n){
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
    public static void main(String[] args) {
        //method approach 
        int n=6;
        upperPyramid(n);
        lowerPyramid(n);


        /*
          int n = 6; // Number of rows for the upper pyramid
        // Upper Pyramid
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

        // Lower Inverted Pyramid
        for (int i = n - 2; i >= 0; i--) {
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
         */
       
    }
}
