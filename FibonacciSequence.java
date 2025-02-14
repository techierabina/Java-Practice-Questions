/*Program to find the Fibonacci Sequence */

import java.util.Scanner;
public class FibonacciSequence {
      public static int fibonacciFunction(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacciFunction(n-1)+fibonacciFunction(n-2);
        }
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int number=sc.nextInt();
        if(number<0){
            System.err.println("Enter a postive number.");
        }
        else{
            System.out.println("Fibonacci sequence up to " + number + " terms:");
            for(int i=0;i<number;i++){
                System.out.print(fibonacciFunction(i) + " ");
            }
        }
    }
}