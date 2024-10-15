package week5;

public class BankAccountTester {
    public static void main(String[] args) {
        System.out.println("Hello World");

        BankAccount bankTest = new BankAccount("John", 867530911, 100, 0001, "10/15/24");

        BankAccount bankTest2 = new BankAccount("Joe", 123456789);

        System.out.println(bankTest.name);


    }
}