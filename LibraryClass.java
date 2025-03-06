/*Library Management (ArrayList & Methods)
Create a class Book with:
Attributes: title, author, isbn
Constructor and a method displayBook() to print book details.
In main(), create an ArrayList of books:
Add at least 3 books.
Write a method searchBook(String title) that finds and displays a book by title.
Allow the user to search for a book. */

import java.util.Scanner;
class Book{
    String title;
    String author;
    String isbn;
    Book(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public void displayBook(){
        System.out.println("Book Title: "+title);
        System.out.println("Book Author: "+author);
        System.out.println("Book ISBN: "+isbn);
    }
}

class Library{
    Book[] books;
    Library(){
        books=new Book[4];
        books[0] = new Book("Java Programming", "John Doe", "978-3-16-148410-0");
        books[1] = new Book("Data Structures", "Jane Smith", "978-0-12-345678-9");
        books[2] = new Book("Machine Learning", "Alan Turing", "978-1-23-456789-0");
        books[3] = new Book("This is life", "Rabina K.","978-3-16-148410-0"); 
    }
    
    public void searchBook(String title){
        boolean found=false;
        for(int i=0;i<books.length;i++){
            if(books[i].title.equalsIgnoreCase(title)){
                books[i].displayBook();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Book Not found on the list.");
        }
    }
    
    
}


public class LibraryClass{
    public static void main(String[] args){
        Library library=new Library(); 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the title of the book you want to search: ");
        String title = sc.nextLine();
        library.searchBook(title);
    }
}