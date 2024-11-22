package week8;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysContinued {

    
    // 1. Array Copying
    // Create a method that will copy an array of integers
    // and return the copy
    public static int[] copyArray(int[] nums){
        // Create a new array of the same size as the input array
        int[] copy = new int[nums.length];
        // Loop through the input array
        for (int i = 0; i < nums.length; i++) {
            // Copy the element at index i from the input array to the copy array
            copy[i] = nums[i];
        }
        // Return the copy array
        return copy;
    }

    // to string

    public static void main(String[] args) {
        // Using the Arrays class
        // Note: The Arrays class contains static methods for manipulating arrays
        // This means you do not need to create an instance of the Arrays class to use its methods

        // Arrays Copying
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(original, original.length);
        int[] copy2 = Arrays.copyOf(original, 10);
        
        for (int i : copy2) {
            System.out.println(i);
        }

        // Array Sorting
        int[] nums = {5, 3, 8, 2, 1, 9, 4};
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }

        System.out.println();
        int[] nums2 = {5, 3, 8, 2, 1, 9, 4};
        // Array Searching
        int index = Arrays.binarySearch(nums, 3); // returns the index of the element if found, otherwise returns a negative number
        // nums2 is not sorted, so the result is unpredictable
        // nums is sorted, so the result is predictable
        System.out.println("Index of 3: " + index);

        // Array Filling
        int[] filledArray = new int[10];
        for (int i : filledArray) {
            System.out.print(i + " ");
        }
        Arrays.fill(filledArray, 9);

        System.out.println();
        
        for (int i : filledArray) {
            System.out.print(i + " ");
        }


        System.out.println();

        // Array Comparison
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Are the arrays equal? " + isEqual);

        // Array to String
        // The Arrays class also has a method to convert an array to a string
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        // Array Manipulation using Streams
        // The Arrays class also has a method to manipulate arrays using streams
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers: " + sum);
    }


}
