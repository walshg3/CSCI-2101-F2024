package week5;

import java.util.Scanner; // Import the Scanner class from the java.util package to allow for user input
/*
     * Stockton's Bank
     * Bank Account Parameters:
     *  public Name - String
     *  private Balance - double
     *  private Date of Birth - String
     *  private SSN - int (Maybe String)
     *  private Account Number - in
     * 
     * 
     * Bank Account Methods:
     *  Constructor
     *  Getters and Setters
     *  Deposit
     *  Withdraw
     *  Monthly Fee
     *  Transfer (Homework)
     *  Balance 
     *  Menu
     *  Compound Interest
     *  Simple Interest (Homework)
     *  Basic Authentication
     *  Advanced Authentication (Homework?)
     *  
     *  Bank Account Constructor
     *  Name, Balance, SSN, Account Number, Date of Birth
     *  Name, SSN
     */

public class BankAccount {

    // Bank Account Parameters (Also Called Arguments)
    public String name; // this.name
    private double balance; // this.balance
    private String dob; // this.dob
    private int ssn; // this.ssn
    private int accountNumber; // this.accountNumber
    // interestRate (interest)
    // period (interest)
    
    // Bank Account Constructor
    public BankAccount(String name, double balance, String dob, int ssn,  int accountNumber){
        this.name = name;
        this.balance = balance;
        this.dob = dob;
        this.ssn = ssn;
        this.accountNumber = accountNumber;
        
    }

    public BankAccount(String name, int ssn){
        this.name = name;
        this.ssn = ssn;
    }

    // Getters and Setters
    
    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDob() {
        return this.dob;
    }

    public int getSSN() {
        return this.ssn;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit
    public void deposit(double amount){
        this.balance += amount; // this.balance = this.balance + amount;
    }

    // Withdraw
    public void withdraw(double amount){
        this.balance -= amount; // this.balance = this.balance - amount;
    }

    // Monthly Fee - will subtract a monthly fee from the balance
    // take in a double as a parameter
    // subtract the fee from the balance
    // Netflix subscription fee - $12.99
    public void monthlyFee(double fee){
        withdraw(fee);
    }

    // print Balance
    public void printBalance(){
        System.out.println("Balance: $" + this.balance);
    }

    // Create a method that will print a menu to the user
    // This is called a helper method / function
    public static int menu() {
        int choice;
        Scanner input = new Scanner(System.in); // Create a scanner object
        System.out.println("Welcome to the Bank of Stockton");
        System.out.println("Please select an option:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Print Balance");
        choice = input.nextInt(); // Collect the user's input
        return choice; // Return the user's input
    }

    // Create a method that will interact with the user based on their 
    // choice from the menu.
    // This method will take a BankAccount object as a parameter

}
