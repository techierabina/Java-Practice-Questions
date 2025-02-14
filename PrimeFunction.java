/*A program that creates a function to check weather a number is prime or not. */
import java.util.Scanner;
public class PrimeFunction {

   public static void isPrime(int n){
    if(n<=1){
        System.out.println("Not a prime number.");
        return;
    }
    if(n==2){
        System.out.println("It is a prime number.");
        return;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            System.out.println("Not a prime number.");
            return;
          }    
        }
        System.out.println("It is a prime number.");
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check either it's prime or not: ");
        int number=sc.nextInt();
        isPrime(number);
    }
}