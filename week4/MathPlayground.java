package week4;

public class MathPlayground {
    public static void main(String[] args) {
        System.out.println("Start of Math Playground");
        int x = 5;
        int y = 10;
        int z = x + y; // addition 5 + 10 = 15
        System.out.println(z);
        z = x - y; // subtraction 5 - 10 = -5
        System.out.println(z);
        double a = 5.1;
        // Math round function
        // Math library is a built-in library in Java that contains methods for performing basic numeric operations
        // You do not need to import the Math library
        // Math.round() function returns the closest long to the argument
        System.out.println(Math.round(a)); // 5
        System.out.println(Math.round(5.5)); // 6
        // Math.ceil() function returns the smallest double value that is greater than or equal to the argument
        // Will always convert to the next whole number
        System.out.println(Math.ceil(a)); // 6.0
        // Math.floor() function returns the largest double value that is less than or equal to the argument
        // Will always convert to the previous whole number
        System.out.println(Math.floor(a)); // 5.0

        // Math max and min functions
        // Math.max() function returns the largest of two numbers
        System.out.println(Math.max(x, y)); // 10
        // Math.min() function returns the smallest of two numbers
        System.out.println(Math.min(x, y)); // 5

        // Math random function
        // Math.random() function returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
        System.out.println(Math.random()); // 0.0 <= x < 1.0
        // Math random function with range
        // To get a random number between 0 and 100
        System.out.println(Math.random() * 100); // 0.0 <= x < 100.0

        int randomNumber = (int) (Math.random() * 100);
        System.out.println("The random number is: " + randomNumber);
        // reminder the cast operator (int) is used to convert a double to an int (explicit casting)

        // Math pow function
        // Math.pow() function returns the value of the first argument raised to the power of the second argument
        System.out.println(Math.pow(2, 2)); // 2^2 = 4

        // Math sqrt function
        // Math.sqrt() function returns the square root of the argument
        System.out.println(Math.sqrt(16)); // 4.0
);


    }
}
