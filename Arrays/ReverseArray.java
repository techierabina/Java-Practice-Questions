import java.util.Scanner;

public class ReverseArray {
    public static void inputArray(int[] array,Scanner sc){
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
    }
    public static void reverseArray(int[] array){
        int start=0;
        int end=array.length-1;
        while (start<end) {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
    public static void displayArray(int[] array){
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int[] numbers=new int[number];
        inputArray(numbers, sc);
        displayArray(numbers);
        reverseArray(numbers);
        displayArray(numbers);
    }
}