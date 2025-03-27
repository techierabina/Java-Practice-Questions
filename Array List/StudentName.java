/*
Create an ArrayList of String values (names of 5 students).
Write a loop to iterate through the list and print each name in uppercase.
Then, remove any name that contains the letter “a” and print the updated list.
 */
import java.util.*;
public class StudentName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> students=new ArrayList<>();
		students.add("Sagar");
		students.add("Saina");
		students.add("Bob");
		students.add("Rabina");
		students.add("Simran");
		students.add("Elish");
		students.add("Aaia");
		System.out.println("Student name in uppercase: ");
		for(String name : students) {
			System.out.println(name.toUpperCase());
		}
		Iterator<String> iterator=students.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			if (name.contains("a") || name.contains("A")) {
				iterator.remove();
			}
		}
		System.out.println("\nUpdated list after removing names with 'a':");
        System.out.println(students);
	}
}