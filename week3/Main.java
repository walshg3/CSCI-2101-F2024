package week3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create a new instance of the Person class (This creates an Object!)
        System.out.println("Person 1");
        Person person1 = new Person("Appa Walsh", 10, 5.0, 50);
        // What can we do with person1?
        System.out.println(person1.getName());
        // Change Person1's name to MOMO Walsh
        person1.setName("MOMO Walsh");
        System.out.println("Person 1's new name is:");
        System.out.println(person1.getName());
        // Get Person1's age
        System.out.println(person1.getAge());
        // Set Person1's age to 20
        person1.setAge(20);
        System.out.println("Person 1's new age is:");
        System.out.println(person1.getAge());

        // Create a new instance of the Person class called Person 2 with no age, height, or weight
        System.out.println("Person 2 Begin:");
        Person person2 = new Person("Korra Walsh");
        System.out.println(person2.getAge());
        person2.setAge(30);
        System.out.println(person2.getAge());

        // Create a new instance of the Person class called Person 3 with a name, age, and phone number
        System.out.println("Person 3 Begin:");
        Person person3 = new Person("Peanut Butter", 12, 123456789);
        System.out.println(person3.phoneNumber);

        System.out.println(person1.getFirst3Letter());

        System.out.println(person3.getInitials());

        System.out.println(person1.getCharAtIndex(1));


        System.out.println(person1.getFirstAndLast());



    }
}
