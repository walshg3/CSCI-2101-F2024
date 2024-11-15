package week7;

import java.util.Scanner;

public class Arraysplayground {

    /*
     * Java Arrays
     * Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
     * Arrays are indexed starting at 0
     * Arrays are a fixed size, and once created cannot be resized
     * Arrays are created with a length, type, and name
     */



    public static void main(String[] args) {
        System.out.println("Start of Arrays examples");

        // How to create an array
        // Type[] name = new Type[length];
        int[] numbers = new int[5];
        // an array called numbers that holds 5 integers
        // [0,0,0,0,0]
        // View the first element in the array
        System.out.println(numbers[0]);
        // Change the value of the first element in the array
        numbers[0] = 10;
        System.out.println(numbers[0]);
        // [10,0,0,0,0]
        //   1,2,3,4,5 -> Length of the array is 5
        //   0,1,2,3,4 -> Index of the array
        System.out.println(numbers[1]);
        numbers[1] = 20;
        System.out.println(numbers[1]);
        // [10,20,0,0,0]
        numbers[4] = 50;
        System.out.println(numbers[4]);
        // [10,20,0,0,50]
        // numbers[5] = 60; -> This will cause an ArrayIndexOutOfBoundsException

        // Get the Length of an array
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length - 1]);

        // Loop through the length of an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index: " + i + "\tValue: " + numbers[i]);
        }

        // For Each Loop
        // for (type name : array)
        for (int number : numbers) { // for each number in numbers
            System.out.println("number: " + number);
        }


        // Array of Strings
        String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        // [Alice, Bob, Charlie]

        // You can also create an array with values
        String[] names2 = {"Alice", "Bob", "Charlie"};

        System.out.println(names2.length);

        for (String name : names2) {
            System.out.println(name);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] userNumbers = new int[size];
        System.out.println("Array of size " + size + " created");
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Enter a number: ");
            userNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Index: " + i + "\tValue: " + userNumbers[i]);
        }


        String[] userNames = {"Alice", "Bob", "Charlie", "Greg", "Mallory"};

        // Ask user for a name to search for
        // then search the array for the name
        System.out.println("Enter a name to search for: ");
        String searchName = scanner.next();
        boolean found = false;
        for (String name : userNames) {
            if(name.equalsIgnoreCase(searchName)){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Name: " + searchName + " found");
        } else {
            System.out.println("Name: " + searchName + " not found");
        }


        // print the names of the array to look liked this: [Alice, Bob, Charlie, Greg, Mallory]
        System.out.print("[");
        for (int i = 0; i < userNames.length; i++) {
            System.out.print(userNames[i]);
            if(i < userNames.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");


        // Char arrays
        // two ways to create a char array
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        char[] letters2 = new char[5];
        letters2[0] = 'a';
        letters2[1] = 'b';
        letters2[2] = 'c';
        letters2[3] = 'd';
        letters2[4] = 'e';


        System.out.println(letters[0]);

        // Convert a string to a char array
        String str = "Hello";
        char[] strArray = str.toCharArray();
        // "Hello" -> ['H', 'e', 'l', 'l', 'o']
        System.out.println(strArray[0]);
        System.out.println("=============");
        strArray[0] = 'y';
        for (char c : strArray) {
            System.out.println(c);
        };

        // convert char array to string
        char[] strArray2 = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(strArray2); // Notice a new String object is created
        System.out.println(str2);

    }
}