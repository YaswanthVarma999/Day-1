package com.wt;

class VariableType {
    
    int instanceVar = 10;
    static int staticVar = 20;

    void display() {
        int localVar = 30;
        
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableType obj1 = new VariableType();
        VariableType obj2 = new VariableType();

        obj1.display();

        obj1.instanceVar = 50;
        obj1.staticVar = 100;

        System.out.println("\nAfter modifying instance and static variables:");

        obj2.display();
    }
}
