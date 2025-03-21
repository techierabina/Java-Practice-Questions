import java.util.Scanner;

public class ReverseNumber {
     
    public static void reverseNumber(int number){
        int reverse=0;
        while(number !=0){
            int lastDigit=number%10;
            reverse=reverse*10+lastDigit;
            number=number/10;
        }
        System.out.println("The reversed number is: "+reverse);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int number=sc.nextInt();
        sc.close();
        reverseNumber(number);
    }
}