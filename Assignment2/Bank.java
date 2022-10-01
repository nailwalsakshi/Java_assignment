/* Implement a banking system using java.

Create 3 sub class of Bank : SBI,BOI,ICICI

All 4 should have following methods:

getDetails which provide their specific details like rateofinterest etc
printDetails of every bank.
Every bank account should have a type (enum): SAVINGS, CURRENT
Implement a feature to deduct amount from account. Throw InsufficientAmountException if amount being deducted is less than the current balance.
Every banking transaction should be saved in a file of each bank's transaction log which would have all details of the transaction like (time of transaction,account number,amount withdrawn, amount before deduction, amount after deduction,transaction status (can also be enum), failure reason if any) */



package Assignment2;
import java.util.*;
public class Bank {
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);
    //method to open new account
    public void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }
    //method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }
    //method to deposit money
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }
    //method to withdraw money
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
    //method to search an account number
    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}
    

