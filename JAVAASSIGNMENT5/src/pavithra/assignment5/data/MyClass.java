package pavithra.assignment5.data;

public class MyClass {
    private int myInt;
    private char myChar;

    // Method to print the member variables
    public void printVariables() {
        System.out.println("myInt = " + myInt);
        System.out.println("myChar = " + myChar);
    }

    // Method to print two local variables without initializing them
    public void printLocalVariables() {
        int myLocalInt;
        char myLocalChar;
        // Uncommenting the lines below will result in a compilation error
        // System.out.println("myLocalInt = " + myLocalInt);
        // System.out.println("myLocalChar = " + myLocalChar);
    }
}
