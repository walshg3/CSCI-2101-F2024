package week10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Random;

import week5.BankAccount;


public class ArrayLists {

    public static void main(String[] args) {
        System.out.println("Hello ArrayLists!");
        /*
         * ArrayLists
         * ArrayLists are a type of collection in Java
         * A Collection is a group of objects that can be treated as a single unit
         * ArrayLists are used to store multiple elements of the same type
         * ArrayLists are dynamic, meaning they can grow and shrink in size
         * Array -> fixed size -> int[] arr = new int[5];
         * ArrayList -> dynamic size -> ArrayList<Integer> list = new ArrayList<>();
         * 
         * Arrays are good for storing data of the same type with a fixed size
         * For example: Phone numbers, SSN
         * ArrayLists are good for storing data of the same type with a dynamic size
         * 
         * ArrayLists are slower than arrays because they are dynamic and have to resize
         */

        // How do we create an ArrayList?
        // ArrayList<DataType> listName = new ArrayList<DataType>();

        ArrayList<String> cars = new ArrayList<String>();
        // This will contain a list of cars with an initial size of 10
        // The size of the ArrayList will grow as needed
        // ArrayLists are indexed starting at 0

        // How do we add elements to an ArrayList?
        // listName.add(element);
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Chevy");

        // How do we print an ArrayList?
        System.out.println(cars); // [Toyota, Honda, Ford, Chevy]

        // What are some of the other Methods available to us with the ArrayList class?

        // See the Length of the ArrayList
        // listName.size();
        System.out.println(cars.size()); // 4

        // get a specific element from the ArrayList
        // listName.get(index);
        System.out.println(cars.get(2)); // Ford

        System.out.println("The first car in the list is: " + cars.get(0)); // First car is always at index 0
        System.out.println("The last car in the list is: " + cars.get(cars.size() - 1)); // Last car is always at the last index (size - 1)

        // How do we update an element in an ArrayList?
        // listName.set(index, element);
        cars.set(0, "Nissan");
        System.out.println(cars); // [Nissan, Honda, Ford, Chevy]

        // How do we remove an element from an ArrayList?
        cars.remove(0);
        System.out.println(cars); // [Honda, Ford, Chevy]
        System.out.println("The new length is: " + cars.size());


        // How do we make an ArrayList of different Types?

        // Integer ArrayList

        ArrayList<Integer> numbers = new ArrayList<Integer>(); // Notice the Integer type instead of int with the <> brackets

        // ArrayLists can only hold objects, not primitive data types
        // int -> Primitive Data Type
        // Integer -> Object Data Type
        // Integer is a wrapper class for the primitive data type int

        // Examples with other data types
        // int -> Integer
        // double -> Double
        // char -> Character
        // boolean -> Boolean

        // Character ArrayList
        ArrayList<Character> letters = new ArrayList<Character>();
        letters.add('a');
        letters.add('b');
        letters.add('c');
        System.out.println(letters); // [a, b, c]

        // Double ArrayList
        ArrayList<Double> decimals = new ArrayList<Double>();
        decimals.add(3.14);
        decimals.add(2.718);
        decimals.add(1.618);
        System.out.println(decimals); // [3.14, 2.718, 1.618]

        // Boolean ArrayList
        ArrayList<Boolean> bools = new ArrayList<Boolean>();
        bools.add(true);
        bools.add(false);
        bools.add(true);
        System.out.println(bools); // [true, false, true]


        // More things you can do with ArrayLists
        // First lets add the Toyota back to the cars ArrayList
        cars.add("Toyota");

        System.out.println(cars); // [Honda, Ford, Chevy, Toyota]

        // Sort the ArrayList

        System.out.println("Before Sorting: " + cars);
        Collections.sort(cars); // Notice the Collections class
        System.out.println("After Sorting: " + cars);

        System.out.println("Before Sorting: " + decimals);
        Collections.sort(decimals); // Notice the Collections class
        System.out.println("After Sorting: " + decimals);

        // we can import classes from previous lectures specifically the BankAccount class

        BankAccount test = new BankAccount("TestAccount1", 1000, "10251997", 12356789, 2);
        System.out.println("The SSN is: " + test.getSSN());

        // We know ArrayLists can only hold objects
        // We can create an ArrayList of BankAccounts
        // We know the BankAccount Object was just made above
        // Lets try to add the BankAccount object to an ArrayList

        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(test);
        System.out.println(accounts); // [week5.BankAccount@15db9742]
        // Noteice the output is not what we expected - This is the memory address of the object

        // Lets add a few more BankAccount objects to the ArrayList
        accounts.add(new BankAccount("TestAccount2", 2000, "10251997", 12356789, 3));
        accounts.add(new BankAccount("TestAccount3", 3000, "10251997", 12356231, 4));
        accounts.add(new BankAccount("TestAccount4", 4000, "10251997", 12123229, 5));
        accounts.add(new BankAccount("TestAccount5", 5000, "10251997", 12412419, 6));

        System.out.println(accounts); // [week5.BankAccount@15db9742, week5.BankAccount@6d06d69c, week5.BankAccount@7852e922, week5.BankAccount@4e25154f, week5.BankAccount@70dea4e]

        // use the get method to get the BankAccount object at a specific index
        System.out.println(accounts.get(0)); // week5.BankAccount@15db9742
        // Still the memory address
        // Lets try to use one of the methods from the BankAccount class
        System.out.println(accounts.get(0).getBalance()); // 1000.0

        // How do we loop through an ArrayList?
        // We can use a for loop
        // We can use a for each loop
        // We can use a while loop

        // For Loop
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i).getName());
        }

        // For Each Loop
        for (BankAccount account : accounts) {
            System.out.println(account.getBalance());
        }

        // While Loop
        int i = 0;
        while (i < accounts.size()) {
            System.out.println(accounts.get(i).getAccountNumber());
            i++;
        }

        // Use a while loop to deposit $100 into each account
        i = 0;
        while (i < accounts.size()) {
            accounts.get(i).deposit(100);
            i++;
        }

        // Use a for each loop to print the balance of each account
        for (BankAccount account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + " Balance is : $ " + account.getBalance());
        }

        // Start of Method Testing

        System.out.println("The account with the highest balance is: " + highestBalance(accounts));
        System.out.println("The account with the lowest balance is: " + lowestBalance(accounts));
        System.out.println(generateRandomBinary());
        System.out.println("Applying Monthly Fee");
        applyMonthlyFee(accounts);

    }

    // Create a method that will take in an ArrayList of BankAccounts and return the name of the
    // account with the highest balance
    public static String highestBalance(ArrayList<BankAccount> accounts){
        // Create a variable that will hold the highest balance
        double highestBalance = 0;
        // We need to create a variable to hold the name of the account with the highest balance
        String highestBalanceName = "";
        // We need to loop through the ArrayList
        for (BankAccount account : accounts){
            // Check if the balance of the current account is greater than the highest balance
            if (account.getBalance() > highestBalance){
                // If it is, update the highest balance and the name of the account
                highestBalance = account.getBalance();
                highestBalanceName = account.getName();
            }
        }
        // Return the name of the account with the highest balance
        return highestBalanceName;
    }

    // Create a method that will take in an ArrayList of BankAccounts and return the account name with the lowest balance
    public static String lowestBalance(ArrayList<BankAccount> accounts){
        // Create a variable that will hold the lowest balance
        double lowestBalance = accounts.get(0).getBalance();
        // We need to create a variable to hold the name of the account with the lowest balance
        String lowestBalanceName = accounts.get(0).getName();
        // We need to loop through the ArrayList
        for (BankAccount account : accounts){
            // Check if the balance of the current account is less than the lowest balance
            if (account.getBalance() < lowestBalance){
                // If it is, update the lowest balance and the name of the account
                lowestBalance = account.getBalance();
                lowestBalanceName = account.getName();
            }
        }
        // Return the name of the account with the lowest balance
        return lowestBalanceName;
    }

    // This is really helpful for project 3
    // Create an ArrayList that generates a 1 or 0 randomly and adds it to an ArrayList
    public static ArrayList<Integer> generateRandomBinary(){
        // Create an ArrayList of type Integer
        ArrayList<Integer> binary = new ArrayList<Integer>();
        // Create a random object
        Random rand = new Random();
        // Loop 10 times
        for (int i = 0; i < 10; i++){
            // Generate a random number between 0 and 1
            int num = rand.nextInt(2);
            // Add the random number to the ArrayList
            binary.add(num);

            // If you wanted to do this with the Math.Random class
            // int num = (int)(Math.random() * 2);
            // Add the random number to the ArrayList
            // binary.add(num)
        }
        // Return the ArrayList
        return binary;
    }

    // Create a method that will take in an ArrayList of BankAccounts and apply the monthly fee method and print the name of the 
    // account as well as the new balance
    public static void applyMonthlyFee(ArrayList<BankAccount> accounts){
        // Loop through the ArrayList
        for (BankAccount account : accounts){
            // Apply the monthly fee
            account.monthlyFee(20);
            // Print the name of the account and the new balance
            System.out.println("Account " + account.getName() + " Balance is : $ " + account.getBalance());
        }
    }
    
}
