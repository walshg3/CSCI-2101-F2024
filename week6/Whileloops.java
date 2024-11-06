package week6;

import java.util.Scanner;

public class Whileloops {
    /*
    * While Loops
    *  - While loops are used to repeat a block of code while a condition is true
    *  - The condition is evaluated before the code block is executed
    *  - The code block will continue to execute as long as the condition is true 
    */

    /*
    * While loop vs For loop
    *  - For loops are used when you know how many times you want to loop
    *  - While loops are used when you don't know how many times you want to loop
    *  - While loops are typically used for things like user input, file reading, input validation, etc.
    */


    // Basic While Loop Method
    // collect numbers from user until they enter 0
    public static void collectNumbers(){
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Declare a variable to store the user input
        int number = 1;
        // Create a while loop that will continue to execute as long as the user does not enter 0
        while(number != 0){
            // Prompt the user to enter a number
            System.out.print("Enter a number (0 to quit): ");
            // Collect the user input
            number = input.nextInt();
        }
        System.out.println("You have exited the program");
        // Close the Scanner object
        input.close();
    }

    


    public static void main(String[] args) {
        collectNumbers();
    }


}
