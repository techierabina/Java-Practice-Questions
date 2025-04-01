
/*
 * 1️⃣ Find the Maximum Element in an ArrayList
 * 📌 Problem: Given an ArrayList<Integer>, find the maximum value in it.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number of elements you want in ArrayList: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < number; i++) {
            int input = sc.nextInt();
            numbers.add(input);
        }
        if (numbers.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            /*
             * using collections
             * int maxNumber=Collections.max(numbers);
             */
            int maxNumber = numbers.get(0);
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) > maxNumber) {
                    maxNumber = numbers.get(i);
                }
            }
            System.out.println("The max number of the ArrayList is: " + maxNumber);
        }
    }
}