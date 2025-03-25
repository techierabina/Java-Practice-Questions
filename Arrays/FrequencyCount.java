import java.util.Scanner;

public class FrequencyCount {
        public static void inputArray(int[] array,Scanner sc){
            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }
        }
        public static void printArray(int[] array){
            System.out.println("The array elements are: ");
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+ " ");
            }
            System.out.println(" ");
        }
        public static void searchNum(int[] array,int s){
            int count=0;
            for(int i=0;i<array.length;i++){
                if(array[i]==s){
                    count++;
                }
            }
            System.out.println("The number is found: "+count+" times.");
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int number=sc.nextInt();
        int[] array=new int[number];
        inputArray(array, sc);
        printArray(array);
        System.out.println("Enter a number you want to search.");
        int s=sc.nextInt();
        searchNum(array, s);
    }
}