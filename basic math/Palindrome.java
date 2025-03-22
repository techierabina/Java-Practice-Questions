
import java.util.*;
public class Palindrome {
    public static int reversedNumber(int number){
        int reversedNum=0;
        while(number!=0){
            int lastDigit=number%10;
            reversedNum=reversedNum*10+lastDigit;
            number=number/10;
        }
         return reversedNum;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		sc.close();
		int output=reversedNumber(number);
		if(output==number){
		    System.out.println("The number is palindrome.");
		}
		else{
		    System.out.println("The number is not palindrome.");
		}
	}
}