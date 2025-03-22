import java.util.Scanner;

public class SumNumbers {
      public static int sum(int number){
        int sum=0;
        if(number==0){
            return 0; 
        }
         return number+sum(number-1);
      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int result=sum(number);
        System.out.println("The sum is: "+result);
        sc.close();
    }
}