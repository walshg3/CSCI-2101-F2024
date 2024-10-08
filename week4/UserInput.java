package week4;

import java.util.Scanner; // This is required to use the Scanner class

public class UserInput {
    /*
     * 
     * Scanner class is used to get user input
     * 
     */
    
    public static void main(String[] args) {

        // Collecting user input from the console
        // Create a Scanner Object (an instance of the Scanner class called keyboard)
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        // Collect the user input and save it to the variable called name
        // nextLine() method reads the input provided by the user until the user presses the Enter key
        String name = keyboard.nextLine();
        System.out.println("Hello, " + name);

        // To collect input that is an integer use the nextInt() method
        System.out.println("Enter your age: ");
        int age = keyboard.nextInt();
        System.out.println("You are " + age + " years old");

        // To collect input that is a double use the nextDouble() method
        System.out.println("Enter your height in feet: ");
        double height = keyboard.nextDouble();
        System.out.println("You are " + height + " feet tall");

        keyboard.close(); // Close the Scanner object
        
    }
}
