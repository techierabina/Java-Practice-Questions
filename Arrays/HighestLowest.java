import java.util.Scanner;
public class HighestLowest {
    public static void inputArray(int[] numbers,Scanner sc){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
    }
    public static int maxFun(int[] numbers){
        int maxElement=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>maxElement){
                maxElement=numbers[i];
            }
        }
        return maxElement;
    }
    public static int minFun(int[] numbers){
       int minElement=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<minElement){
                minElement=numbers[i];
            }
        }
        return minElement;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int number = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] numbers = new int[number];
        inputArray(numbers, sc);
        int minNumber=minFun(numbers);
        int maxNumber=maxFun(numbers);
        System.out.println("The minimum number is: "+minNumber);
        System.out.println("The maximun number is: "+maxNumber);
    }
}
