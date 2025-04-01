/*Problem Statement
Define a Student class with the following:

Data Members:
String name → Stores the student’s name.
int age → Stores the student’s age.
int[] scores → Stores an array of three scores.
Constructor: Initializes the name, age, and scores array.
Method print(): Prints the student's details (name, age, and scores) in a formatted manner.
Define a StudentRecords class (Driver Class) that:

Checks for Command-Line Arguments:
If no filename is provided, display a usage message and exit.
Reads the File Using Scanner:
Open the file specified in the command-line argument.
Read the file line by line.
Process Each Line in the File

Split the line using :|, as delimiters.
Validate that the line contains exactly 5 parts:
Extract Data:
name → First part (trimmed).
age → Second part (converted to int).
scores[] → Last three parts (converted to int and stored in an array).
Create a Student object using extracted data.
Call print() method to display the student details. */

import java.util.*;
import java.io.*;

class Student{
    String name;
    int age;
    int[] scores;
    Student(String name,int age,int[] scores){
      this.name=name;
      this.age=age;
      this.scores=scores;
    }
    public void print(){
        System.out.println("Student Informations: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("Scores: "+scores[0]+","+scores[1]+","+scores[2]);
    }
}

public class StudentRecordProcessing {

    public static void main(String[] args) throws IOException {
        if(args.length!=1){
            System.out.println("Usage: java StudentRecordProcessing <filename>");
            return;
        }
        String fileName=args[0];
        File f=new File(fileName);
        Scanner sc=new Scanner(f);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            String[] parts=line.split(":|,");
            if(parts.length !=5){
              System.out.println("Invalid Lines: "+ line);
              continue;
            }
            String name=parts[0].trim();
            int age=Integer.parseInt(parts[1].trim());
            int[] scores=new int[3];
            for(int i=0;i<3;i++){
                scores[i]=Integer.parseInt(parts[i+2].trim());
            }
            Student s=new Student(name, age, scores);
            s.print();
        }
       sc.close();
   
    }
}