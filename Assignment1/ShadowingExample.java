package com.wt;

class ShadowingExample {
    
    int x = 10; // Instance variable

    void methodShadowing() {
        int x = 20; // Shadows instance variable
        System.out.println("Method Variable x: " + x);
        System.out.println("Instance Variable x (using this.x): " + this.x);
        
        if (true) {
            int blockX = 30; // Renamed variable to avoid conflict
            System.out.println("Block Variable blockX: " + blockX);
        }
    }

    public static void main(String[] args) {
        ShadowingExample obj = new ShadowingExample();
        System.out.println("Instance Variable x: " + obj.x);
        obj.methodShadowing();
    }
}


