package week3;

public class Person {
    /*
     * Create a class called Person with the following private fields:
     * name, age, height, weight
     * 
     * Create a constructor that takes in all of the fields as parameters
     *  and sets them to the private fields.
     * 
     * 
     * Create a method called printPerson that prints out the person's
     *  name, age, height, and weight.
     * 
     * 
     * this file is called Person.java
     * 
     * the Main.java is the file that will be used to test the Person class
     * 
     */

    private String name; // private means that the field can only be accessed in the class
    // Important note for later: when you see the word 'this' it refers to the current
    // instance of the class
    private int age;
    private double height;
    private double weight;
    int phoneNumber;

    // potentially add phone number here

    // Create a constructor for the Person Object
    // Same name as the class
    public Person(String name, int age, double height, double weight, int phoneNumber){
        // parameters go inside the parentheses of the constructor
        /*
         * this is the constructor
         * it is called when you use the 'new' keyword
         * it is used to create a new instance of Person class
         */

         // 'this' keyword
         // Person_class_var = Parameter_var
         this.name = name;
         this.age = age;
         this.height = height;
         this.weight = weight;
         this.phoneNumber = phoneNumber;

    }

    // Create another constructor that takes in only the name
    public Person(String name){
        this.name = name;
    }

    // Create another constructor that takes in only the name and age
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int age, int phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Create a getter for the Person Object's name
    public String getName(){
        return this.name;
    }
    // Create a setter for the Person Object's name
    public void setName(String name){
        this.name = name;
    }

    // Create a getter and setter for the Person Objesct's age
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // Create a setter for phone number
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    /*
     * Create a method that gets the first 3 letters of the name
     * and returns it as a String
     * 
     * When computers count, they start at 0
     * Hello
     * 12345 -> human
     * 01234 -> computer
     * 
     * unhappy
     * 1234567 -> human
     * 0123456 -> computer
     * 
     * MOMO Walsh
     * 12345678910 -> human
     * 0123456789  -> computer
     * 
     * convert from human to computer do endIndex - 1
     * 
     */
    public String getFirst3Letter(){
        return this.name.substring(0,3);
    }

    /*
     * Create a method that returns the intials of the person
     * ie if the name is "John Doe" it should return "JD"
     * John Doe
     * 12345678 -> human
     * 01234567 -> computer
     */
    public String getInitials(){
        String firstInitial = this.name.substring(0, 1);
        int begin_index = this.name.indexOf(" ") + 1;
        int end_index = this.name.indexOf(" ") + 2;
        String secondInitial = this.name.substring(begin_index,end_index);
        return firstInitial + secondInitial; 
    }

    /*
     * Create a method that returns the char at a given index
     * ie the name "John Doe" input index 2, it should return h
     * 
     * John Doe
     * 01234567
     * 
     * This is assuming counting is computer based
     */
    public char getCharAtIndex(int index){
        return this.name.charAt(index);
    }

    /*
     * Create a method that will return the first charecter of the name and the last
     * charecter of the name
     * ie. if the name is "John Doe" the return should be Je
     */
    public String getFirstAndLast() {
        String first_initial = this.name.substring(0,1);
        System.out.println("The Name Length is: " + this.name.length());
        // Note: .length counts in human numbers
        String last_char = this.name.substring(this.name.length() - 1);
        // Note: -1 is needed here because computers count starting at 0 so there no name.length
        // char, instead you need the second to last char (human form) or last char (computer form)

        return first_initial + last_char;
    }

    /*
     * Key Takeaway
     * You can use +1 and -1 on both length and substring to move the index you are looking for.
     */


    
}
