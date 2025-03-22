import java.util.Scanner;

public class Factorial {
     public static int fact(int number){
        if(number==0 || number==1){
            return 1;
        }
        return number*fact(number-1);
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int result=fact(number);
        System.out.println("The factorial is: "+result);
        sc.close();
    }
}