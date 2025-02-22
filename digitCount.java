//Write a program that takes a user input as a number and returns the count of digits in that number.

import java.util.Scanner;
public class digitCount {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int number=sc.nextInt();
        int count=0;
        number=Math.abs(number);
        if(number == 0){
            count=1;
        }
        else{
            while(number >0){
                number=number/10;
                count++;
            }
        }
        System.out.println("The number of digit in the given input:"+count);
    }
}