/*
1 
01 
101 
0101 
10101 
 */
import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows you want: ");
        int rows=sc.nextInt();
        for(int i=1;i<rows;i++){
            for(int j=0;j<i;j++){
                System.out.print((i+j)%2);
            }
            System.out.println("");
        }
        
    }
}