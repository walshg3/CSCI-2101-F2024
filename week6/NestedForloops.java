package week6;

import java.util.Scanner;

public class NestedForloops {

// Create a method that will print a triangle of stars horizontally
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *


    public static void printTriangeHorizontal(){
        // for (int i = 0; i < 5; i++){
        //     System.out.println("*");
        // } // this will print 5 stars
        // we need to print 4 stars, 3 stars, 2 stars, 1 star all in the same row
        // to print multiple stars in the same row, we need to utilize the i variable
        for (int i = 0; i < 5; i++){ // i++ is the same as i = i + 1
            // System.out.println("*" * i ); // this will not work we cant multiply a string by an integer
            for (int j = 0; j < i; j++){
                System.out.print("*");  // print on the same line without a new line
            } 
            System.out.println(); // print a new line
        }
        for (int i = 5; i > 0; i--){ // i-- is the same as i = i - 1 instead of incrementing we are decrementing
            for (int j = 0; j < i; j++){ // this line stays the same since it is handling the number of stars
                System.out.print("*"); // print rather than println to keep the stars on the same line
            }
            System.out.println();
        }
    }

    public static void printTriangeVertical(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

    // Create a method that will use a nested loop to make a output in a matrix
    // This would look something similar to this:
    // ****
    // ****
    // ****
    // ****
    // 4 rows and 4 columns
    // We will want to collect the rows and columns from the user
    // We will want to collect the symobol to use from the user
    // Outer for loop is for the rows
    // Inner for loop is for the columns

    public static void printMatrix(){
        Scanner sc = new Scanner(System.in); // create a scanner object
        System.out.println("Enter the number of rows: "); // prompt the user to enter the number of rows
        int rows = sc.nextInt(); // collect the number of rows from the user
        System.out.println("Enter the number of columns: "); // prompt the user to enter the number of columns
        int columns = sc.nextInt(); // collect the number of columns from the user
        System.out.println("Enter the symbol to use: "); // prompt the user to enter the symbol to use
        String symbol = sc.next(); // collect the symbol from the user
        System.out.println();
        System.out.println("Rows: " + rows + "\nColumns: " + columns + "\nSymbol: " + symbol); // print the rows, columns, and symbol
        // Note: \n is a new line character that is used in a string to create a new line
        System.out.println();
        for (int i = 0; i < rows; i++){ // loop through the rows
            for (int j = 0; j < columns; j++){ // loop through the columns
                System.out.print(symbol); // print the symbol
            }
            System.out.println(); // print a new line
        }
    }


    public static void main(String[] args) {
        // printTriangeVertical();
        // printTriangeHorizontal();
        printMatrix();

    }
}
