package com.wt;

class Demo {
    int value;

    Demo(int value) {
        this.value = value;
    }
}

public class PrimitiveVsReference {
    public static void main(String[] args) {
        // Primitive Variable
        int a = 10;
        int b = a;  // Copying value
        b = 20; 

        System.out.println("Primitive Variables:");
        System.out.println("a: " + a); // Remains 10
        System.out.println("b: " + b); // Modified to 20

        // Reference Variable
        Demo obj1 = new Demo(30);
        Demo obj2 = obj1; // Copying reference (both point to same object)
        obj2.value = 40; // Modifies the same object

        System.out.println("\nReference Variables:");
        System.out.println("obj1.value: " + obj1.value); // Changes to 40
        System.out.println("obj2.value: " + obj2.value); // Also 40
    }
}
