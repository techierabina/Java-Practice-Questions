import java.util.*;

public class evenNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            int input=sc.nextInt();
            numbers.add(input);
        }
        ArrayList<Integer> evenNum=new ArrayList<>();
        for(int num:numbers){
            if(num%2==0){
                evenNum.add(num);
            }
        }
        System.out.println("Even numbers: "+evenNum);
    }
}