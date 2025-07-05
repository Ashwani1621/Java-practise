package OOPS;
// Assignment:
// Create a BankAccount class with private balance field. Provide deposit(), withdraw(), and getBalance() methods with proper validation.

// Goal: Practice hiding internal data and controlling access using getters/setters.
public class BankAccount {
    private int balance;
    public int getBalance(){
        return this.balance;
    }
    public void deposit(int amount){
        if(amount >0){
            this.balance += amount;
            System.out.println("Deposited Successfully");
            System.out.println("Current balance "+ this.getBalance());
        }else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(int amount){
        if(this.balance >= amount){
            this.balance  = this.balance - amount;
            System.out.println("Withdraw  Succesful");
            System.out.println("Current Balance "+ this.getBalance());
            return;
        } else{
            System.out.println("Insufficient Balance");
            return;
        }  
    }
    public static void main(String[] args) {
        BankAccount acc  = new BankAccount();
        acc.deposit(100);
        System.out.println(acc.getBalance());
        acc.withdraw(101);
        

    }

    
}
