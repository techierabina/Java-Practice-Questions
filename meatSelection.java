/*
Níels is at a restaurant that offers different types of meat. Today, 
the restaurant is serving N types of meat. Each type is either
"nautakjot" (beef) or "kjuklingur" (chicken).
Níels wants to know what kind of meat he got:

If all the meat types he received are "nautakjot", print "nautakjot".
If all the meat types he received are "kjuklingur", print "kjuklingur".
If he received both types of meat, print "blandad best"
 */

 import java.util.Scanner;

public class meatSelection
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        sc.nextLine();

        boolean hasNautakjot = false;
        boolean hasKjuklingur = false;

        for(int i=0;i<number;i++){
          String meatName=sc.nextLine().trim();
          if(meatName.equals("nautakjot")){
            hasNautakjot = true;
          }else if(meatName.equals("kjuklingur")){
            hasKjuklingur=true;
          }
        }
        if (hasNautakjot && hasKjuklingur) {
            System.out.println("blandad best");
        } else if (hasNautakjot) {
            System.out.println("nautakjot");
        } else {
            System.out.println("kjuklingur");
        }
    }
}
