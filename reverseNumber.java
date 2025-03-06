import java.util.Scanner;

public class reverseNumber {
     
    public static int reverse(int num){
        int reversed=0;
        while(num != 0){
             int digit=num%10;
             reversed=reversed*10+digit;
             num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("The reversed number is: "+reverse(number));
    }
}