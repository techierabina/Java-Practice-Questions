/*
 * The problem revolves around efficiently counting the number of contestants
 * located in different cities for a programming competition. In the year 3016,
 * the competition takes place across multiple locations nationwide, and the
 * organizers need help distributing shirts to the contestants. The task is to
 * process a list of contestants, each with a corresponding location, and
 * determine how many contestants are at each unique location. The input
 * consists of a number n representing the total number of contestants, followed
 * by pairs of lines containing the contestant's name and their location. The
 * goal is to output the name of each location alongside the number of
 * contestants situated there. The order of locations in the output does not
 * matter. To solve this, we need to efficiently track and count the contestants
 * by location, ensuring that even with a large number of contestants, the
 * solution remains manageable. The challenge involves handling input
 * dynamically while ensuring accurate and efficient counting of contestants per
 * location.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Location {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of contestants: ");
        int number=sc.nextInt();
        sc.nextLine();
        ArrayList<String> locations=new ArrayList<>();
        ArrayList<Integer> count=new ArrayList<>();
        for(int i=0;i<number;i++){
            System.out.println("Enter the name of contentant "+(i+1)+": ");
            sc.nextLine();
            System.out.println("Enter the location of contestant "+(i+1)+": ");
            String location=sc.nextLine();
            int index=locations.indexOf(location);
            if(index==-1){
                locations.add(location);
                count.add(1);
            }
            else{
                count.set(index,count.get(index)+1);
            }
        }
        for(int i=0;i<locations.size();i++){
            System.out.println(locations.get(i) + " " + count.get(i));
        }
        sc.close();
    }
 }