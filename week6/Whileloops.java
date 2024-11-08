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


    // Create a method that will average a user's input of numbers. Use a For Loop to start
    public static void sumUserInput(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int userInput = sc.nextInt();
            sum += userInput; // sum = sum + userInput
        }
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + (sum / 5));
    }

    // Create a method that will average a user's input of numbers. Use a While Loop
    public static void sumUserInputWhile(){
        int sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(count < 5){
            System.out.println("Enter a number: ");
            int userInput = sc.nextInt();
            sum += userInput; // sum = sum + userInput
            count++;
        }
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + (sum / 5));
    }
    // Notice how the while loop is similar to the for loop, but we have to manually increment the count variable


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

    public static void checkDup(){
        // check if a duplicate number has been entered. If so, break out
        // Assume no negative numbers
        double previousNumber;
        double currentNumber = -1; // this is a sentinel value
        // sentinel value is a value that is used to terminate the loop, used to indicate the end of the loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, q to quit: ");
        while (sc.hasNextDouble()) {
            previousNumber = currentNumber; // first run set the previous number to the current number
            System.out.println("Enter a number, q to quit: ");
            currentNumber = sc.nextDouble(); // set the current number to the user input
            if (previousNumber == currentNumber) {
                System.out.println("Duplicate number entered. Exiting program");
                break;
            }
        }
    }

    // make a method that will collect a String input from the user check if the "pill" is blue or red.
    // If the pill is red the program will say "Welcome to the Matrix" and exit
    // If the pill is blue the program will prompt the user again for their choice
    public static void redPillBluePill(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You have two pills in front of you. One is red and one is blue. Which one do you choose?");
        String pill = sc.nextLine(); // collect the user input
        // while(pill.equals("red") || pill.equals("blue")){
        //     if(pill.equals("red")){
        //         System.out.println("Welcome to the Matrix");
        //         break;
        //     } else if(pill.equals("blue")){
        //         System.out.println("You have chosen the blue pill. Please choose again.");
        //         System.out.println("You have two pills in front of you. One is red and one is blue. Which one do you choose?");
        //         pill = sc.nextLine();
        //     }
        // }
        while (!pill.equalsIgnoreCase("red")) {
            System.out.println("Interesting....");
            System.out.println("You have two pills in front of you. One is red and one is blue. Which one do you choose?");
            pill = sc.nextLine(); // collect the user input
        }
        System.out.println("Welcome to the Matrix");   
    }

    public static void main(String[] args) {
        // collectNumbers();
        // sumUserInput();
        // checkDup();
        redPillBluePill();
    }
}
