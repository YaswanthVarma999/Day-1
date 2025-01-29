package com.wt;

class DefaultValuesExample {
    
    // Instance variables (non-static)
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;
    String stringValue;

    // Static variables
    static int staticIntValue;
    static String staticStringValue;

    public static void main(String[] args) {
        DefaultValuesExample obj = new DefaultValuesExample();

        // Displaying default values of instance variables
        System.out.println("Default values of instance variables:");
        System.out.println("byteValue: " + obj.byteValue);
        System.out.println("shortValue: " + obj.shortValue);
        System.out.println("intValue: " + obj.intValue);
        System.out.println("longValue: " + obj.longValue);
        System.out.println("floatValue: " + obj.floatValue);
        System.out.println("doubleValue: " + obj.doubleValue);
        System.out.println("charValue: [" + obj.charValue + "]");
        System.out.println("booleanValue: " + obj.booleanValue);
        System.out.println("stringValue: " + obj.stringValue);

        // Displaying default values of static variables
        System.out.println("\nDefault values of static variables:");
        System.out.println("staticIntValue: " + staticIntValue);
        System.out.println("staticStringValue: " + staticStringValue);
    }
}
