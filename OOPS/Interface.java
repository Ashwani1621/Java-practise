package OOPS;

interface Flyable {
    void fly();
}
class Bird implements Flyable{
    public void fly(){
        System.out.println("Bird Flies");
    }
}   
class Aeroplane implements Flyable{
    public void fly(){
        System.out.println("Aeroplane Flies");
    }
}   

class Interface{
    public static void main(String[] args) {
        Aeroplane air = new Aeroplane();
        Bird b = new Bird();
        air.fly();
        b.fly();
    }
}
