import java.util.Scanner;

public class StringPalindrome {

    public static boolean isPalindrome(String str, int start ,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return isPalindrome(str, start+1, end-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        str=str.replaceAll("\\s+", "").toLowerCase();
        boolean result=isPalindrome(str, 0, str.length()-1);
        if(result){
            System.out.println("The string is palindrome.");
        }
        else{
            System.out.println("The string is not palindrome.");
        }
        sc.close();;

    }
}