package OOPS;
public class Student {
    String name;
    Number roll;
    Double cgpa;

    public Student(String name, Number roll, Double cgpa){
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }

    void Display(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
        System.out.println("CGPA: " + this.cgpa);
    }
    public static void main(String[] args) {
        Student ashwani = new Student("Ashwani", 62, 7.5);
        Student shreyeshi = new Student("Shreyeshi", 46, 8.0);
        Student Afsheen = new Student("Afsheen", 17, 9.0);
        ashwani.Display();
        shreyeshi.Display();
        Afsheen.Display();
    }
    
}
