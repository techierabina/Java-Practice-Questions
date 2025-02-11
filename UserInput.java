/*
  Write a Java program that generates a random number between 10 and 99 and gives
  the user three attempts to guess the number where the first digit is displayed.

If the user guesses correctly, print "Congratulations! You guessed the correct number." and stop the program.
If the user guesses incorrectly, inform them of the remaining attempts.
If the user fails all three attempts, print "Sorry! The correct number was: X", where X is the generated number.
 */

import java.util.Random;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rad=new Random();
        int randomNum=rad.nextInt(90)+10;
        int ones=randomNum/10;
        int tens=randomNum%10;
        int attempt=3;
        System.out.println("Guess the random number if it's ones is " + ones +"?");
        for(int i=0;i<attempt;i++){
            System.out.print("Guess Remaining : " + (attempt-i) + ": ");
            int userGuess=sc.nextInt();
            if(randomNum==userGuess){
                System.out.println("Congratulations! You guessed the correct number.");
                return;
            }
            else{
                System.out.println("Wrong guess X. Try again.");
            }
        }
        
        System.out.println("Sorry! The correct number was " + randomNum);
    }
}