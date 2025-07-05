package OOPS;
// Overriding
// ➤ Create a base class Employee with fields name, salary.
// ➤ Derive Manager and Developer classes with extra fields (teamSize, techStack).
// package OOPS;

class Employee {
    public String name;
    int salary;


}
class Manager extends Employee{
    int teamSize;
}
class Developer extends Employee{
    String techStack;
}
class Main{
    public static void main(String[] args) {
        Manager man = new Manager();
        Developer dev = new Developer();
        man.name = "Ashwani";
        dev.salary = 122;
        

    }
}
