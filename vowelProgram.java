//Program to count the number of vowel in string
import java.util.Scanner;
public class vowelProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        input=input.toLowerCase();
        int counter1=0;
        for(int i=0;i<input.length();i++){
          char c=input.charAt(i);
          if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u'){
            counter1 ++;
          }

         }
         System.out.println("The number of vowel : " +counter1);

    }
}
