import java.util.Scanner;
public class FibonacciSeries {
    public static int fiboFunction(int number){
        if(number==0){
            return 0;
        }
        else if(number==1){
            return 1;
        }
        else{
            return fiboFunction(number-1)+fiboFunction(number-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
       if(number<0){
        System.out.println("Enter a positive number.");
       }
       else{
        System.out.println("The fibonacci series of "+number+" are: ");
        for(int i=0;i<number;i++){
            System.out.print(fiboFunction(i)+" ");
        }
        System.out.println(" ");
       }
    }
}