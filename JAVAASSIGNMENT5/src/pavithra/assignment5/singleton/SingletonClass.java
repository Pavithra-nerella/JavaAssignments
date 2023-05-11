package pavithra.assignment5.singleton;

public class SingletonClass {
    private String myString;

    // Static method to create and initialize a SingletonClass object
    public static SingletonClass initialize(String str) {
        SingletonClass singleton = new SingletonClass();
        singleton.myString = str;
        return singleton;
    }

    // Non-static method to print the String member variable
    public void printString() {
        System.out.println(myString);
    }
}