import java.awt.event.ActionEvent;
import java.util.Scanner;

public abstract class BankAccount {
    //member variables

    int balance;
    int previousTransaction;
    int Option;


    void checkBalance(){
        System.out.println("Your current balance is $" +balance);
    }
    void deposit(int amount){
        if (amount !=0) {
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println("Your new balance is $" +balance);
        }
    }
    void withdraw(int amount){
        if (amount !=0 && balance >= amount) {
            balance = balance - amount;
            previousTransaction = -amount;
            System.out.println("Your new balance is $" +balance);
        }
        else if(balance < amount){
            System.out.println("Insufficient balance!!!");
        }
    }
    void getPreviousTransaction(){
        if (previousTransaction > 0) {
            System.out.println("Deposited $" +previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn $" +Math.abs(previousTransaction));
            System.out.println();
        }
        else{
            System.out.println("No transaction recorded");
            System.out.println();
        }
    }

    public abstract void actionPerformed(ActionEvent e);
}
