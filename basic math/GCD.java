/*
The Euclidean Algorithm is an efficient method for finding the GCD (Greatest Common Divisor) of two numbers.
It is based on the principle:
"The GCD of two numbers (a, b) is the same as GCD(b, a % b) until b becomes 0."
GCD(a, b) = GCD(b, a % b)
If b == 0, then a is the GCD.
 */

import java.util.Scanner;

public class GCD {
    public static int gcdFunction(int a,int b){
        if(b==0){
            return a;
        } 
        else{
            return gcdFunction(b,a%b);
        }
         
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2=sc.nextInt();
        int result=gcdFunction(n1, n2);
        System.out.println("The GCD/HCF is: "+result);
    }
 }