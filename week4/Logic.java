package week4;

import java.util.Scanner;

public class Logic {

    /*
     * Basics of IF Statements
     *  - An if statement is a conditional statement that runs or skips code based on whether a condition is true or false. (Fork in the road analogy)
     * - The if statement starts with the if keyword, followed by the condition to be checked, followed by the code to be executed if the condition is true.
     * - If the condition evaluates to true, the code inside the curly braces is executed. If the condition evaluates to false, the code is not executed.
     * - The condition inside the parentheses can be any expression that returns a boolean value.
     * 
     *  if (condition) {
     *     // code to be executed if the condition is true
     * }
     * 
     * 
     * if (condition) {
     *    // code to be executed if the condition is true
     * } else {
     *   // code to be executed if the condition is false
     * }
     * 
     * if (condition1) {
     *   // code to be executed if condition1 is true
     * } else if (condition2) {
     *  // code to be executed if condition2 is true
     * } else {
     * // code to be executed if both condition1 and condition2 are false
     * }
     * 
     * 
     * if (condition1) {
     *   // code to be executed if condition1 is true
     * } else if (condition2) {
     *  // code to be executed if condition2 is true
     * } else if (condition3) {
     *  // code to be executed if condition3 is true
     * } else {
     *  // code to be executed if all condition1 and condition2 and condition3 are false
     * }
     * 
     * 
     * 
     */
    

    public static void main(String[] args) {
        System.out.println("Start of Logic Playground");

        // Call in a scanner and collect user input for their name
        // Create a Scanner Object (an instance of the Scanner class called keyboard)
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        // Check if the name is equal to "Tom" and print a message to the console if so

        // name == "Tom" is incorrect because == is used to compare primitive data types
        // DO NOT USE == to compare strings
        // if (name == "Tom") {
        //     System.out.println("Hello Tom, welcome back!");
        // }

        // The correct way to compare strings is to use the equals() method
        // if (name.equalsIgnoreCase("Tom")) {
        //     System.out.println("Hello Tom, welcome back!");
        // } else if (name.equalsIgnoreCase("Sally")) {
        //     System.out.println("Hello Sally, welcome back!");
        // } else if (name.equalsIgnoreCase("Bob")) {
        //     System.out.println("Hey Bob, Good to see you again!");
        // } else {
        //     System.out.println("Hello " + name + ", nice to meet you!");
        // }

        // Logical Operators
        // && - AND operator
        // || - OR operator (This is the pipe character) 
        // ! - NOT operator

        // && - Both conditions must be true for the entire expression to be true
        // || - At least one condition must be true for the entire expression to be true
        // ! - Negates the condition

        // if (condition1 && condition2) {
        //     code to be executed if both condition1 and condition2 are true
        // }

        // if (condition1 || condition2) {
        //     code to be executed if either condition1 or condition2 is true
        // }

        // if (!condition) {
        //     code to be executed if the condition is false
        // }

        // Check if the name is Tom or Bob and print a message to the console if so
        // if (name.equalsIgnoreCase("Bob") || name.equalsIgnoreCase("Tom")) {
        //     System.out.println("Hello " + name.toUpperCase() + ", welcome back!");
        // } else {
        //     System.out.println("Hello " + name + ", nice to meet you!");
        // }
        // This does not check for Sally, how can we modify this to check for Sally?

        // you can chain multiple conditions together
        // if (name.equalsIgnoreCase("Bob") || name.equalsIgnoreCase("Tom") || name.equalsIgnoreCase("Sally")) {
        //     System.out.println("Hello " + name.toUpperCase() + ", welcome back!");
        // } else {
        //     System.out.println("Hello " + name + ", nice to meet you!");
        // }


        // Ask user for their age using a scanner
        // Note: we already have a scanner object called keyboard
        System.out.println("Enter your age: ");
        int age = keyboard.nextInt();

        // System.out.println("You are " + age + " years old");

        // // Check that the user is 21 years or older
        // if (age >= 21) // Greater than or equal to 21
        // {
        //     System.out.println("You are old enough to Enter");
        // } else {
        //     System.out.println("You are not old enough to Enter");
        // }
        

        // Check if name is Bob, Tom, or Sally and age is 21 or older
        // This is an example of a nested if statement (Having multiple if statments inside eachother)
        // if ((name.equalsIgnoreCase("Bob") || name.equalsIgnoreCase("Tom") || name.equalsIgnoreCase("Sally"))){
        //     if (age >= 21){
        //         System.out.println("Hey " + name + ", You are old enough to enter!");
        //     } else {
        //         System.out.println("Hey " + name + ", You aren't old enough to enter, sorry");
        //     }
        // } else {
        //     System.out.println("Get Lost");
        // }

        // You can combine the nested if statement into a single if statement
        if ((name.equalsIgnoreCase("Bob") || name.equalsIgnoreCase("Tom") || name.equalsIgnoreCase("Sally")) && age >= 21){
            System.out.println("Hey " + name + ", You are old enough to enter!");
        } else {
            System.out.println("Get Lost");
        }


    }
}
