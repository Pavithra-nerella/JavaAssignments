package pavithra.assignment5.main;

import pavithra.assignment5.data.MyClass;
import pavithra.assignment5.singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {
        // Creating an object of MyClass and calling its methods
        MyClass myClass = new MyClass();
        myClass.printVariables();
        myClass.printLocalVariables();

        // Creating an object of SingletonClass using the static method and calling its non-static method
        SingletonClass singleton = SingletonClass.initialize("Hello, world!");
        singleton.printString();
    }
}
