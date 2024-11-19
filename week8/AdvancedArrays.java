package week8;
import java.util.Scanner;

public class AdvancedArrays {


    // Given an Array of integers return true if 9 appears as first or last element in the array
    // firstLast9([1, 2, 9]) → true
    // firstLast9([1, 9, 9]) → true
    // firstLast9([9, 2, 3, 4, 8]) → true
    // this is an example of a method that takes
    // an array as a parameter
    public static boolean firstLast9(int[] nums){
        // we can get the first element by using nums[0]
        // we can get the last element by using nums[nums.length - 1]
        // if(nums[0] == 9 || nums[nums.length - 1] == 9){
        //     return true;
        // }
        // return false;
        return nums[0] == 9 || nums[nums.length - 1] == 9;
        // if you have a return statement in an if statement, you can just return the condition
        // assumes true, otherwise false
    }

    // Given an int array, if there is a 9 followed by a 1 and then another 1, Return "The Police are on the way" otherwise return
    // "Keep Calm and Carry On"
    // policeAreOnTheWay([1, 9, 1]) → "Keep Calm and Carry On"
    // policeAreOnTheWay([1, 9, 1, 1]) → "The Police are on the way"
    // policeAreOnTheWay([1, 1, 1, 9, 1]) → "Keep Calm and Carry On"
    public static String policeAreOnTheWay(int[] nums){
        // loop through the array
        // Check if the current element is 9
        // Check if the next element is 1
        // Check if the element after that is 1
        // if all conditions are true, return "The Police are on the way"
        // otherwise return "Keep Calm and Carry On"

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 9){
                if(i+1 < nums.length && nums[i+1] == 1){
                    if(i+2 < nums.length && nums[i+2] == 1){
                        return "The Police are on the way";
                    }
                }
            }
        }
        return "Keep Calm and Carry On";
    }


    // Make a method to collect 10 numbers from the user
    // Then return an array of those numbers
    // This is an example of an array being the return type 
    // of a method
    public static int[] collect10(){
        // Create an array of size 10
        // loop through the array
        // ask the user for a number
        // store the number in the array
        // return the array
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    // Make a method to fill an array size 10 with random numbers between 1 and 100
    // This is an example of an array being the return type
    // of a method and using Math.random()

    public static int[] randomArray(){
        int[] randomNumbers = new int[10];
        // You will need to cast the random number to an int
        // Math.random() returns a double between 0 and 1
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * 100) + 1;
        }
        return randomNumbers;
    }


    public static void main(String[] args) {
        System.out.println("Start of Advanced Arrays examples");
        // new test array
        int[] testArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(firstLast9(new int[]{1,2,9})); //true
        System.out.println(firstLast9(testArray)); //true
        System.out.println(firstLast9(new int[]{1,2,3,4,8})); //false

        System.out.println(policeAreOnTheWay(new int[]{1,9,1})); //Keep Calm and Carry On
        System.out.println(policeAreOnTheWay(new int[]{1,9,1,1})); //The Police are on the way

        int[] userNumbers = collect10();
        // for each loop
        // for (int i : userNumbers) {
        //     System.out.println(i);
        // }
        // for loop with index
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Index: " + i + " Value: " + userNumbers[i]);
        }

        System.out.println("\n=================\n");

        int[] randomNumbers = randomArray();
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println("Index: " + i + " Value: " + randomNumbers[i]);
        }
        
    }
}
