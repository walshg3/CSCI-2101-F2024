package week6;
import java.util.Scanner;

public class Forloops {
    /*
     * 
     * For Loops in Java
     * 
     */
    public static void main(String[] args) {
        System.out.println("Start of For Loops");

        // for (int i = 0; i < 10; i++){
        //     System.out.println("Hello World");
        // }
        // For Loops
        // for (initialization; condition; update/increment/decrement)
        System.out.println("================");

        // int students = 22;
        // for (int i = 0; i < students; i++){
        //     System.out.println("Student " + i);
        // }

        // Show students from 1 to 22
        System.out.println("================");

        // for (int i = 1; i <= students; i++){
        //     System.out.println("Student " + i);
        // }
        // System.out.println("End of Students");

        String s = "The quick brown fox jumpts over the tlazy dogt";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        if (s.charAt(0) == 'T'){
            System.out.println("Found T");
        }

        // printIfFound(s, 'u');
        countIfFound(s, 'o');

        sumUserInput();


    }
    // Create a method that will loop through a string and print if it finds a specific character
    // printIfFound(s, 'T');
    public static void printIfFound(String s, char c){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                System.out.println("Found " + c + " at index " + i);
                break; // This will stop the loop early once we find the character
            }
            System.out.println("index: " + i + " char:" + s.charAt(i));
        }
    }

    // Create a method that will loop through a string and count how many times a specific character is found
    // countIfFound(s, 't');
    public static void countIfFound(String s, char c){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                System.out.println("Found " + c + " at index " + i);
                count++; // count = count + 1;
            }
        }
        System.out.println("Found " + c + " " + count + " times");
    }

    // Create a method that will collect user input and output a running total of the numbers entered. Do this 10 times
    // 1,2,3,4,5,6,7,8,9,10
    // 1,3,6,10,15,21,28,36,45,55
    public static void sumUserInput(){
        // Add scanner to collect user input
        Scanner keyboard = new Scanner(System.in);
        // init a counter to 0
        int counter = 0;
        // loop through 10 times
        for (int i = 0; i < 10; i++){
            // prompt the user to enter a number
            System.out.println("Enter a number: ");
            // use the scanner to collect the input
            int userInput = keyboard.nextInt();
            // add the user input to the counter
            counter += userInput; // counter = counter + userInput;
            // print the counter
            System.out.println("Running Total: " + counter);
        }
    }
}
