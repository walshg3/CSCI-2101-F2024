package week4;

public class Casting {
    /*
     * 
     * Java Casting
     * Implicit vs Explicit Casting
     * 
     */

     public static void main(String[] args) {
        System.out.println("Start of Casting Program");
        // What is Casting?
        // Casting is the process of converting one data type to another.
        // Implicit Casting or widening
        // When you assign a value of a smaller data type to a larger data type it is called implicit casting or widening.
        // byte -> short -> char -> int -> long -> float -> double
        // Java automatically convers the smaller data type to the larger data type
        int myInt = 9;
        System.out.println(myInt);
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myDouble);
        // Explicit casting or narrowing
        // When you assign a value of a larger data type to a smaller data type it is called explicit casting or narrowing.
        // double -> float -> long -> int -> char -> short -> byte
        // Java does not automatically convert the larger data type to the smaller data type
        // in order to convert it you must use a cast operator
        // Explicit casting acts Math.floor() function
        double myDouble2 = 9.78;
        System.out.println(myDouble2);
        int myInt2 = (int) myDouble2; // Explicit casting: double to int
        System.out.println(myInt2);

     }
}
