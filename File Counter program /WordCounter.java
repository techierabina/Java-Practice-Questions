import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class WordCounter {

    public static void main(String[] args) throws IOException{
       String fileName="sample.txt";
       Scanner sc=new Scanner(new FileReader(fileName));
       int wordCount=0;
       while (sc.hasNext()) { 
        sc.next(); 
        wordCount++;
    }
       System.out.println("The words in the file are: "+wordCount);
       sc.close();
    }
}