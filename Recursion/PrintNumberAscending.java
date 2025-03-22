import java.util.Scanner;

public class PrintNumberAscending {
    public static void printNum(int number){
       if(number==0){
        return;
       }
       printNum(number-1);
       System.out.println(number);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        printNum(number);
    }
}