package week2;

public class CatNames {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // How do I access the cat names from the Access class?
        // Create an object of the Access class
        // initialize an instance of the Access class
        // CLASS_NAME OBJECT_NAME = new CLASS_NAME();
        Access a = new Access();
        Access b = new Access();
        // Here we made an object of the Access class
        // we call it by using the object name and the dot operator
        // System.out.println(a.cat1);
        // Notice how we can't access a.cat1 because it is private
        // System.out.println(a.cat2);
        // same with a.cat2
        System.out.println(a.cat3);
        // we can access a.cat3 because it is public by default
        a.cat3 = "Troy";
        System.out.println(a.cat3);
        System.out.println(a.getCat1());
        System.out.println(a.setCat1("Pappa"));

        System.out.println("Cat 2's name is " + a.getCat2());
        a.setVoidCat2("Sara");
        System.out.println("Cat 2's name is now " + a.getCat2());
        System.out.println(b.getCat1());
        System.out.println(b.getCat2());

        Playground play = new Playground();
        System.out.println(play.addExlamationPoint(a.getCat1()));
        


    }
}
