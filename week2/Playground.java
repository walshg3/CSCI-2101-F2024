package week2;

public class Playground {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        // Recap on making variables
        // DATA-TYPE VARIABLE-NAME = VALUE/EXPRESSION;
        String s = "Hello";

        // String Concatenation
        // String Concatenation is the process of combining two or more strings.
        String exlam = "!";
        System.out.println(s); // Hello
        System.out.println(exlam); // !
        System.out.println(s + exlam); // Hello!
        System.out.println(s + "!"); // Hello!
        System.out.println("Hello" + "!"); // Hello!
        String y = "World";
        System.out.println("Hello World!"); // Hello World!
        System.out.println("Hello" + " " + "World" + "!"); // Hello World!
        System.out.println(s + " " + y + exlam);
        String name = "Greg";
        String name2 = "John";
        System.out.println(name);
        System.out.println(name2);
        name = "Josh"; // reassigning the value of name, variables are mutable, only define data type once
        System.out.println(name);

        // call the addExlamationPoint method
        // METHOD_NAME(ARGUMENTS);
        // How to get the return value to print on the screen

        // 1. Create a variable to store the return value and print the variable
        String output = addExlamationPoint("TEST");
        System.out.println(output);
        //2. Print the return value directly
        System.out.println(addExlamationPoint("TEST"));

       addExlamationPoint2("Hello");
       
       //    String temp12 = addExlamationPoint3("Test123") // void methods cannot be assigned to a variable

       // NOTE: Returning does not mean printing
       // I can reuse methods with different arguments
       System.out.println(addStrings("Goodbye", "World"));
        System.out.println(addStrings("Your", "Mom")); 
       // Because addStrings's arguemnts are Strings, I can only pass in Strings
        // System.out.println(addStrings(5, "World")); // This will not work
       // Because addStrings's return type is a String, I can only assign it to a String
        // int temp = addStrings("Goodbye", "World"); // This will not work 
      // addStrings can take in a variable that is a String
      System.out.println(addStrings(name, exlam));
    }

    // Create a method to add an exlamation point to a String
    // SCOPE, STATIC/NON-STATIC, RETURN TYPE, METHOD NAME, PARAMETERS
    // SCOPE - public, private | where the method can be accessed
    // STATIC/NON-STATIC - static, (nothing) | static methods can be called without creating an instance of the class
    // RETURN TYPE - void, int, double, String, boolean, char, etc | the data type the method will return
    // METHOD NAME - the name of the method
    // PARAMETERS - the data type and name of the parameters the method will take
    // ARGUMENTS - the actual values passed into the method
    public static String addExlamationPoint(String x){
        // 1.
        String temp = x + "!";
        return temp;
        // 2.
            // x = x + "!";
            // return x;
        // 3.
            // return x + "!";

    }

    public static void addExlamationPoint2(String x){
        System.out.println("This is the output of a void method: " + x + "!");
    }

    public static void addExlamationPoint3(String x){
        // You can not assign a void method to a variable
        x = x + "!";
    }

    // Methods can take in multiple parameters
    // Make a method that takes in String x and String y and adds them together with a space in between
    public static String addStrings(String x, String y){
        return x + " " + y;
    }
    

}
