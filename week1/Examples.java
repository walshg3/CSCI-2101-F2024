package week1; // This is a package declaration. It is the same name as the folder this file is in.

public class Examples { // This is a class declaration. It is the same name as the file.
    // In java '//' is used for single line comments.
    // This is a comment

    public static void main(String[] args) { // This is the main method

        System.out.println("Hello World!"); // This is a print statement
        // inside the statement is an expression (System.out.println())
        // "Hello World!" is a string literal => Java Data Type
        
        System.out.println(5);

        System.out.println(10 / 5);


        // JAVA DATA TYPES
        // int, double, boolean, char, String

        // int -> integer | 1,2,3,4,5,6,7,8,9,10
        // double -> decimal | 1.0, 2.0, 3.0, 4.0, 5.0, 5.5
        // boolean -> true or false | yes, no | 1, 0 - "Fork in the road example" (if statements)
        // char -> single character | 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
        // String -> sequence of characters | "Hello World!", "This is a string"
        // note: char is in single quotes, String is in double quotes

        // JAVA PRIMITIVE DATA TYPES
        // PRIMITIVE DATA TYPES are the most basic data types available within the Java language.
        // IE They are built into Java
        // int, double, boolean, char

        // Non-Primitive Data Types
        // Non-primitive data types are called reference types because they refer to objects.
        // String is a non-primitive data type

        // JAVA OPERATORS
        // +, -, *, /, %, ++, --, +=, -=, *=, /=, ==, !=, >, <, >=, <=, &&, ||, !
        // note: ! is the the same as 'not'
        
        // JAVA KEYWORDS (P&PS1)
        // public, static, void, class, main, String, args, int, double, boolean, char, if, else, else if,
        // switch, case, for, while, do, break, continue, return, true, false, throws, extends, final, new, 
        // this, try, catch, throw

        // JAVA STATEMENTS
        // A statement is a complete line of code followed by a semicolon.
        // A statement can be a declaration, an expression, or a block
        // A statement can be a single line or multiple lines
        // a statement can be a single statement or multiple statements
        // a multi line statement has to be enclosed in curly braces '{}'
    
        // Examples of statements:
        // System.out.println("Hello World!");
        // System.out.println(5-2);

        // Java Variables
        // A variable is a container which holds the value while the Java program is executed.
        // A variable is a named memory location that can store data temporarily.
        // DATA-TYPE VARIABLE_NAME = VALUE/EXPRESSION;
        int x = 5;
        int iceCream = 10;
        int c = x + iceCream;
        System.out.println(x + iceCream); // (5 + 10) = 15
        System.out.println(c); // 15
        c = 25;
        System.out.println(c); // 25
        String hello = "Hello World!";
        System.out.println(hello);

        // JAVA MATH EXAMPLES
        int a = 5;
        int b = 10;
        int d = a + b; // addition
        d = a - b; // subtraction
        int e = a * b; // multiplication // 50
        System.out.println(d);
        System.out.println(e);
        d = e / b; // division // 5
        System.out.println(d);
        d = e % b; // modulus // 0
        int y = 10;
        int f = 3;
        int g = y % f; // 1
        c = 0;
        c = c + b;
        int u = c+=b;
        System.out.println(c);
        System.out.println(u);

        double h = 5.0;
        System.out.println(h);
        double i = a * h;
        System.out.println(i);

        // STRING CONCATENATION
        // String concatenation is the process of combining two or more strings
        // Example:
        String firstName = "John";
        String lastName = "Doe";
        
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(firstName + lastName);
        System.out.println(firstName + " " + lastName);
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName);

        System.out.println(a + firstName); // "5" + "John" => "5John"
        System.out.println(h + firstName); // "5.0" + "John" => "5.0John"
        System.out.println(h + a); // prints with no issues due to implicit casting in the println method
        // int o = h + a; // error because h is a double and a is an int
    }
}
