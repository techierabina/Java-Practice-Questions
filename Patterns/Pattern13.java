/*
A 
A B 
A B C 
A B C D 
 */

import java.util.Scanner;
public class Pattern13 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<rows;i++){
            for(char c='A'; c<'A'+i;c++ ){
                System.out.print(c+" ");
            }
            System.out.println("");
        }
    }
}