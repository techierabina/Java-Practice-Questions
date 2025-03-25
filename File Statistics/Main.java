import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static double getMean(ArrayList<Integer> numbers){
             double sum=0;
             for(int i:numbers){
                sum+=i;
             }
             return (double) sum/numbers.size();
    }

    public static int getMode(ArrayList<Integer> numbers){
        int[] frequency=new int[51];
        for(int num:numbers){
            frequency[num]++;
        }
        int mode=numbers.get(0);
        int maxCount=frequency[mode];
        for(int i=1;i<=50;i++){
            if(frequency[i]>maxCount){
                maxCount=frequency[i];
                mode=i;
            }
        }
        return mode;
    }
    public static double getMedian(ArrayList<Integer> numbers){
        Collections.sort(numbers);
        int size=numbers.size();

        if(size%2==1){
            return numbers.get(size/2);
        }else{
             int mid1=numbers.get(size/2-1);
             int mid2=numbers.get(size/2);
             return (mid1+mid2)/2.0;
        }

    }

    public static void main(String[] args) throws IOException{
        if(args.length !=1){
            System.out.println("Usage: java Main <fileName>");
            return;
        }
        String fileName=args[0];
        File f=new File(fileName);
        Scanner sc=new Scanner(f);
        ArrayList<Integer> numbers=new ArrayList<>();
        while(sc.hasNextInt()){
            numbers.add(sc.nextInt());
        }
        if(numbers.isEmpty()){
            System.out.println("The file is empty.");
            return;
        }
        double mean = getMean(numbers);
        System.out.println("Mean: " + mean);
        int mode=getMode(numbers);
        System.out.println("Mode: "+mode);
        double median=getMedian(numbers);
        System.out.println("Median: "+median);

    }
}