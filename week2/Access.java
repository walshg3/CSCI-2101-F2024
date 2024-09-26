package week2;

public class Access {
    // Scope in Java
    // public - accessible from anywhere
    // private - only accessible within the class
    
    private String cat1 = "Appa";
    private String cat2 = "Momo";
    String cat3 = "Korra";

    // Getter and Setter Methods
    // Getter Method - Gets the value of a private or public variable
    // Setter Method - Sets the value of a private or public variable
    // it doesn't make much sense to use getters and setters on public variables

    // Getter Method for cat1
    public String getCat1(){
        return cat1;
    }

    // Getter Method for cat2
    public String getCat2(){
        return cat2;
    }

    // Setter Method for cat1
    public String setCat1(String name){
        cat1 = name;
        return cat1;
    }
    // Setter Method that is void
    // more popular way of creating a setter
    public void setVoidCat2(String name){
        cat2 = name;
    }

}


