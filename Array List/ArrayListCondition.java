
/*
Create an ArrayList of integers and add 20 random numbers (between 1 and 100) to it.
Write a method that takes an ArrayList of integers as input and prints only the even numbers in the list.
Then, write another method that prints the sum of all numbers greater than 50 in the list.
 */
import java.util.*;

public class ArrayListCondition {
    public static void evenNumbers(ArrayList<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(+number + " ");
            }
        }
        System.out.println("");
    }

    public static void printSumOfNumbersGreaterThan50(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 50) {
                sum += number;
            }
        }
        System.out.println("Sum of numbers greater than 50: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumbers = rd.nextInt(100) + 1;
            numbers.add(randomNumbers);
        }
        System.out.println("Even numbers are: ");
        evenNumbers(numbers);
        printSumOfNumbersGreaterThan50(numbers);

    }
}