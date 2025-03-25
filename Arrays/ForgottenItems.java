/*
 * You are given a list of items you grabbed before heading out.
 * The goal is to check if you have the three essential items: "keys", "phone",
 * and "wallet".
 * If any of these are missing, print the missing items in alphabetical order,
 * one per line.
 * If you have all three, simply print "ready". The input guarantees that all
 * grabbed items are unique.
 */

import java.util.*;
public class ForgottenItems {
    public static boolean isInArray(String[] array,String target){
        for(String item:array){
            if(item.equals(target)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] grabbedItems=new String[n];
        for(int i=0;i<n;i++){
            grabbedItems[i]=sc.nextLine();
        }
        String[] essentialItems={"keys","phone","wallet"};
        Arrays.sort(essentialItems);
        boolean allPresent=true;
        for(String item:essentialItems){
            if(!isInArray(grabbedItems, item)){
                System.out.println(item);
                allPresent=false;
            }
        }
        if(allPresent){
            System.out.println("ready");
        }
    }
}