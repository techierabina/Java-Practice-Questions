/*
 * Write a Java program that takes an integer num as input, representing the
 * size of two arrays, a and b. The program then takes num integers to populate
 * both arrays. It compares the corresponding elements of the two arrays: if an
 * element in array a is greater than the corresponding element in array b,
 * increment a counter for a; if an element in array b is greater, increment a
 * counter for b; and if the elements are equal, do nothing. After comparing all
 * the elements, the program should print the two counters, one indicating how
 * many times an element in a was greater and the other showing how many times
 * an element in b was greater.
 */

 import java.util.*;
public class ArrayComparison
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int[] a=new int[num];
		int[] b=new int[num];
		int aCounter=0;
		int bCounter=0;
		for(int i=0; i<num; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<num; i++) {
			b[i]=sc.nextInt();
		}
	    for(int i=0;i<num;i++){
	     if(a[i]==b[i]){
	         continue;
	     }
	     if(a[i]>b[i]){
	         aCounter++;
	     }
	     else if(a[i]<b[i]){
	         bCounter++;
	     }
	    }
	    System.out.println(aCounter);
	    System.out.println(bCounter);
        sc.close();
	}
}