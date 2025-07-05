package OOPS;
// Inheritance Overriding
// ➤ Create a base class Employee with fields name, salary.
// ➤ Derive Manager and Developer classes with extra fields (teamSize, techStack).
// package OOPS;

class Employee {
    public String name;
    int salary;

    void calculateBonus(){
        System.out.println("Calculating Bonus");
        
    }


}
class Manager extends Employee{
    int teamSize;
    @Override
    void calculateBonus(){
        super.calculateBonus();
        System.out.println(salary * 2);
    }
}
class Developer extends Employee{
    String techStack;
    @Override
    void calculateBonus(){
        super.calculateBonus();
        System.out.println(salary * 3);
    }    
}
class Main{
    public static void main(String[] args) {
        Manager man = new Manager();
        Developer dev = new Developer();
        man.salary = 100;
        dev.salary = 100;

        man.calculateBonus();
        dev.calculateBonus();
        

    }
}
