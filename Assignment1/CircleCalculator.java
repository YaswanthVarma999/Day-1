package com.wt;

class CircleCalculator {
    
    static final double PI = 3.14159; // Constant for PI

    static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;

        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
