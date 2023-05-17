package com.assignment7.q2;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        // Try to call balance() on each element of the array
        for (Cycle cycle : cycles) {
            // This won't compile since balance() is not defined in the Cycle class.
            // cycle.balance();
        }

        // Downcast and call balance()
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
        // This will throw a ClassCastException since Tricycle cannot be downcast to Unicycle or Bicycle.
//         ((Unicycle) cycles[2]).balance();
//         ((Bicycle) cycles[2]).balance();
    }
}
