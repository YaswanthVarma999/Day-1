package com.wt;

class TypeInferenceDemo {
    public static void main(String[] args) {
        var number = 10;             // Inferred as int
        var message = "Hello, Java"; // Inferred as String
        var decimal = 5.5;           // Inferred as double
        var list = java.util.List.of(1, 2, 3); // Inferred as List<Integer>

        System.out.println("Integer Value: " + number);
        System.out.println("String Value: " + message);
        System.out.println("Double Value: " + decimal);
        System.out.println("List: " + list);

        // Uncommenting these lines will cause compilation errors:
        // number = "New Value"; // Error: Cannot assign String to int
        // var uninitialized;    // Error: Cannot use var without initialization
    }
}

