import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int number){
        int sum=0;
        int originalNumber=number;
        int digit=String.valueOf(number).length();
        while(number!=0){
            int lastDigit=number%10;
            sum+=Math.pow(lastDigit, digit);
            number=number/10;
        }
        return originalNumber==sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(isArmstrong(number)){
            System.out.println(number+" is a Armstrong number. ");
        }
        else{
            System.out.println(number+" is not a Armstrong number. ");
        }
    }
}