
/*
 * Reverse an ArrayList
 * 📌 Problem: Reverse an ArrayList<Integer> without using extra space.
 * 💡 Hint: Swap elements using Collections.reverse() or a two-pointer approach.
 */
import java.util.*;

public class ReverseArrayList {

    public static void reverseFun(ArrayList<Integer> numbers) {
        int start = 0;
        int end = numbers.size() - 1;
        while (start < end) {
            int temp = numbers.get(start); // Store the value at start index
            numbers.set(start, numbers.get(end)); // Assign end value to start position
            numbers.set(end, temp); // Assign temp (old start value) to end position
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number of elements you want in ArrayList: ");
        int number = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < number; i++) {
            int input = sc.nextInt();
            numbers.add(input);
        }
         reverseFun(numbers);
        System.out.println("Reversed ArrayList: " + numbers);
    }
}