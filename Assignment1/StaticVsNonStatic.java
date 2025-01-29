package com.wt;

class StaticVsNonStatic {
    
    int nonStaticVar = 10;  // Instance variable
    static int staticVar = 20; // Static variable

    void display() {
        System.out.println("Non-Static Variable: " + nonStaticVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        StaticVsNonStatic obj1 = new StaticVsNonStatic();
        StaticVsNonStatic obj2 = new StaticVsNonStatic();

        System.out.println("Before Modification:");
        obj1.display();
        obj2.display();

        obj1.nonStaticVar = 50;  // Changes only obj1's instance variable
        obj1.staticVar = 100;  // Changes static variable (shared among all)

        System.out.println("\nAfter Modification:");
        obj1.display();
        obj2.display();  // obj2 sees the updated staticVar, but nonStaticVar is unchanged
    }
}
