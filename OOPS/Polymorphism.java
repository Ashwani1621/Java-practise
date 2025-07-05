// 8. 🔜 Polymorphism
// ➤ Define an interface PaymentMethod with pay(amount) method.
// ➤ Implement CreditCard, UPI, and Cash.
// ➤ Use a method processPayment(PaymentMethod) to handle all.
package OOPS;

interface PaymentMethod {
    void processPayment();
}

class CreditCard implements PaymentMethod{
    public void processPayment(){
        System.out.println("Done via Credit Card");
    }
}
class Upi implements PaymentMethod{
    public void processPayment(){
        System.out.println("Done via Upi");
    }
}
class Cash implements PaymentMethod{
    public void processPayment(){
        System.out.println("Done via Cash");
    }
}

class Polymorphism{
    public static void main(String[] args) {
        PaymentMethod cc = new CreditCard();
        PaymentMethod cash = new Cash();
        PaymentMethod upi  = new Upi();

        cc.processPayment();
        cash.processPayment();
        upi.processPayment();
    }
}