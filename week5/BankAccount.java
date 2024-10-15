package week5;

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
    public String name;
    private double balance;
    private String dob;
    private int ssn;
    private int accountNumber;
    // interestRate (interest)
    // period (interest)
    
    // Bank Account Constructor
    public BankAccount(String name, int ssn, double balance, int accountNumber, String dob){
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.dob = dob;
    }

    public BankAccount(String name, int ssn){
        this.name = name;
        this.ssn = ssn;
    }


}
