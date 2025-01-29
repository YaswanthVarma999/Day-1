package com.wt;

class VariableScope {
    
    int instanceVar = 10; 
    static int staticVar = 20; 

    void methodScope() {
        int localVar = 30; 

        if (true) {
            int blockVar = 40; 
            System.out.println("Block Variable: " + blockVar);
        }

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.methodScope();

        System.out.println("\nAccessing Class Scope Variables:");
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}
