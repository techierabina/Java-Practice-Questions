/* Write a Java program using modular programming with the following functions:
generateRandomNumber(int[] arr): Generates 5 random numbers between 1 and 50.
getUserGuess(int[] arr): Takes 5 user inputs as guesses.
countMatches(int[] lottery, int[] user): Compares the two arrays generated number and the user 
input  returns the number of matching values.
display(int matches): Determines and prints the winning message based on the number of matches:
5 matches: Jackpot!
3 or 4 matches: Great job!
1 or 2 matches: Good!
0 matches: No matches.
Constraints:
Use a for-each loop for comparison.
Use a switch case for the winning message. */

import java.util.Random;
import java.util.Scanner;

public class LotteryGame{

    public static int[] generateRandomNumber(int[] arr){
        Random rad=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rad.nextInt(50)+1;
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
    public static int[] getUserGuess(int[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers between 1 and 50:");
        for(int i=0;i<arr.length;i++){
           System.out.print("Guess "+ (i+1) + ": ");  
           arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int countMatches(int[] lottery, int[] user){
        int matchCount=0;
        for(int a:lottery){
            for(int b:user){
                if(a==b){
                    matchCount ++;
                    break;
                }
            }
        }
        return matchCount;
    }
    public static void display(int matches){
        switch (matches) {
            case 5:
                System.out.println(matches+ " Jackpot ! You won the lottery");
                break;

            case 4:
            case 3:
               System.out.println( matches+  " Great Job !, you won a car");
               break;

            case 2:
            case 1:
               System.out.println(matches+ " Good !, you won a TV"); 
               break;

            default:
            System.out.println(matches+ " No matches, Sorry try next time");
                break;
        }

    }

    public static void main(String[] args) {
        int[] lotteryNum=new int[5];
        int[] userGuess=new int[5];
        generateRandomNumber(lotteryNum);
        getUserGuess(userGuess);
        int matches=countMatches(lotteryNum, userGuess);
        display(matches);

    }
}
