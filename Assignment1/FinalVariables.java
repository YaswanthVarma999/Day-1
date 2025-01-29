package com.wt;

class FinalVariables {
    
    final int instanceVar = 10; 
    static final int staticVar = 20; 

    void show() {
        final int localVar = 30; 
        
        System.out.println("Instance Final Variable: " + instanceVar);
        System.out.println("Static Final Variable: " + staticVar);
        System.out.println("Local Final Variable: " + localVar);

        // Uncommenting the below lines will cause compilation errors:
        // instanceVar = 50; // Error: Cannot change final variable
        // staticVar = 100;  // Error: Cannot change final static variable
        // localVar = 60;    // Error: Cannot change final local variable
    }

    public static void main(String[] args) {
        FinalVariables obj = new FinalVariables();
        obj.show();
    }
}
