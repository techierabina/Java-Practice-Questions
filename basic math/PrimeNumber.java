
import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        if(number==2){
            return true;
        }
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+ " is a Prime number.");
        }
        else{
            System.out.println(n+" not a Prime number.");
        }
        
    }
}