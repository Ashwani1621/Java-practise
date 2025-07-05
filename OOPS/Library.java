// 9. 🔜 Mini Project: Library Management System
// ➤ Combine:

// Book class with encapsulated fields.

// Member superclass with subclasses Student, Faculty.

// Interface FineCalculator.

// Abstract class LibraryUser.
package OOPS;

class Book {
    private String name;
    private String author;

    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    
}
interface FineCalculator{
    void calculate();
}
abstract class LibraryUser{
    String name;
    int contact;
    int fine;
    Book[] books;
    int delayReturn;
    void greet(){
        System.out.println("Hello user");
    }
}
class Student extends LibraryUser implements FineCalculator{
    String studentId;
    
    void greet(){
        System.out.println("Welcome "+ studentId);
    }
    public void calculate(){
        this.fine = this.delayReturn * 5;
    }
}
class Faculty extends LibraryUser implements FineCalculator{
    String facultyId;
    
    void greet(){
        System.out.println("Welcome "+ facultyId);
    }
    public void calculate(){
        this.fine = this.delayReturn * 2;
    }
}
