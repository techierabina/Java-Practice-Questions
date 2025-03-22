import java.util.Scanner;
public class PrintName {
    public static void printName(String name,int number){
        if(number==0){
            return;
        }
        System.out.println(name);
        printName(name, number-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter the number of times to print:");
        int n=sc.nextInt();
        printName(name, n);
        sc.close();
    }
}