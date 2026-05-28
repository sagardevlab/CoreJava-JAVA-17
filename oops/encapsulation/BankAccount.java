package oops.encapsulation;

public class BankAccount {

    //Bundling Data and methods; restrict direct access via private + getters/setters

    private double balance; // this field is hidden as private access modifier is used

    //but can be accessed using getters and setters
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    
}
