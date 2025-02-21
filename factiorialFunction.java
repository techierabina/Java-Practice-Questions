/*A function to find the factorial of the user input */
import java.util.Scanner;
public class factiorialFunction {
    
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the factorial: ");
        int number=sc.nextInt();
        int result=fact(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}