import java.util.Scanner;

public class CountDigits {

    public static void digitCount(int number) {
        if (number == 0) {
            System.out.println("The number of digit is 1.");
            return;
        }
        number=Math.abs(number);
        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        System.out.println("The number of digits is: " + count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits: ");
        int number = sc.nextInt();
        sc.close();
        digitCount(number);

    }
}