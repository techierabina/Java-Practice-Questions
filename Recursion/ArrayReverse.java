import java.util.Scanner;

public class ArrayReverse {
    public static void inputArray(int arr[],Scanner sc){
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void print(int arr[]){
        System.out.println("The array elemets are: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public static void reverseArray(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] array=new int[n];
        inputArray(array, sc);
        print(array);
        reverseArray(array, 0, n - 1);
        // Print reversed array
        System.out.println("Reversed:");
        print(array);

        sc.close();
    }
}