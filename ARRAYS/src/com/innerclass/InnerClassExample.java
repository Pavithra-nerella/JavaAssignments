package com.innerclass;

public class InnerClassExample {
    public static void main(String[] args) {

        Machine machine = new Machine(12);

        machine.run();

        Machine.Tire tire = new Machine.Tire();
        tire.repair();

    }

}
