import java.util.Scanner;
import java.util.Arrays;

public class Median {
    public static void inputArray(int[] array,Scanner sc){
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
       
    }
    public static void displayArray(int[] array){
       for(int i:array){
        System.out.print(i+" ");
       }
       System.out.println(" ");
    }
    public static double getMedian(int[] array){
        Arrays.sort(array);
        int size=array.length;
        if(size%2==1){
            return array[size/2];
        }
        else{
            int mid1=array[size/2-1];
            int mid2=array[size/2];
            return (mid1+mid2)/2.0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of elements: ");
        int number=sc.nextInt();
        int[] array=new int[number];
        inputArray(array, sc);
        displayArray(array);
        double median=getMedian(array);
        System.out.println("The median is: "+median);
        sc.close();
    }
}