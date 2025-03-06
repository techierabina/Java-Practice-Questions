/*Question 1: Student Management System (OOP)
Create a Java program with the following requirements:

Create a class Student with attributes:
name (String)
id (int)
department (String)
A method displayInfo() to print student details.
Create two subclasses:
Undergraduate (has an additional attribute year (int)).
Graduate (has an additional attribute researchTopic (String)).
Override displayInfo() in each subclass to include specific details.
In the main() method, create objects of Undergraduate and Graduate and display their information */

class Student{
    private String name;
    private int id;
    private String department;

    Student(String name, int id, String department){
        this.name=name;
        this.id=id;
        this.department=department;    
    }

    public void displayInfo(){
         System.out.println("Name: "+ name);
         System.out.println("Id: "+ id);
         System.out.println("Department: "+department);

    }
}

class Undergard extends Student{
    private int year;

    Undergard(String name, int id, String department,int year){
        super(name,id,department);
        this.year=year;
    }
    @Override 
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Year: "+ year);
        System.out.println("Student Type: Undergraduate");
    }

}

class Grad extends Student{
    private String researchTopic;
    
    Grad(String name, int id,String department, String researchTopic){
        super(name, id, department);
        this.researchTopic=researchTopic;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Reaserch Topic: "+ researchTopic);
        System.out.println("Student Type: Graduate");
    }

}


public class StudentManagement {
   
    public static void main(String[] args) {
        Student s1=new Student("Rabina", 012345, "Computer Science");
        s1.displayInfo();
        Undergard u1=new Undergard("Salbi", 01234, "Nursing", 2024);
        u1.displayInfo();
        Grad g1=new Grad("Sagar", 123450, "Artifcial Intelligence","LLM MOdels");
        g1.displayInfo();
    }
}