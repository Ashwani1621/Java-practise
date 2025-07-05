package OOPS;
// ➤ Create a Calculator class with multiple overloaded add() methods:

// add(int a, int b)

// add(double a, double b)

// add(int a, int b, int c)


public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b;
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(2,3));
        System.out.println(cal.add(2.7,3.0));
        System.out.println(cal.add(2,3,6));
    }
}
