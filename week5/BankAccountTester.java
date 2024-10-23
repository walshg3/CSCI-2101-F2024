package week5;

public class BankAccountTester {
    public static void main(String[] args) {
        System.out.println("Hello World");

        BankAccount bankTest = new BankAccount("John", 100, "10/15/24", 867530911, 0001);

        BankAccount bankTest2 = new BankAccount("Joe", 123456789);

        System.out.println(bankTest.getSSN());
        System.out.println(bankTest.getDob());
        System.out.println(bankTest.getName());
        System.out.println(bankTest.getAccountNumber());

        System.out.println("==================");
        bankTest.deposit(100);
        System.out.println(bankTest.getBalance());
        bankTest.withdraw(199);
        System.out.println(bankTest.getBalance());
        bankTest.withdraw(5);
        System.out.println(bankTest.getBalance());
        bankTest.deposit(500);
        System.out.println(bankTest.getBalance());

        System.out.println("==================");
        System.out.println("Monthly Fee: Neflix $12.99");
        bankTest.monthlyFee(12.99);
        bankTest.printBalance();
        System.out.println("==================");
        
        // int userChoice = BankAccount.menu(); // This is a static method, so we can call it without creating an object

        // System.out.println("User Choice: " + userChoice);

        BankAccount.interact(bankTest);
    }
}