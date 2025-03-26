import java.util.*;
public class LetterCount {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word=sc.nextLine();
        int letterCount=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
                letterCount++;
            }
        }
        System.out.println("The number of letters are: "+letterCount);
    }
}