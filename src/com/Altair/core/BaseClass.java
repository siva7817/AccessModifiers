package com.Altair.core;



// Public class (can be accessed from anywhere)
public class BaseClass {

    // ==== VARIABLES ====
    private String privateVar = "Private Variable";
    String defaultVar = "Default (Package-Private) Variable";
    protected String protectedVar = "Protected Variable";
    public String publicVar = "Public Variable";

    // ==== CONSTRUCTORS ====
    private BaseClass(String privateMsg) {
        System.out.println("Private Constructor: " + privateMsg);
    }

    BaseClass() {
        System.out.println("Default Constructor called.");
    }

    protected BaseClass(int number) {
        System.out.println("Protected Constructor called with number: " + number);
    }

    public BaseClass(boolean flag) {
        System.out.println("Public Constructor called with flag: " + flag);
    }

    // ==== METHODS ====
    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default (Package-Private) Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Utility to show variables
    public void showVars() {
        System.out.println("Inside BaseClass:");
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
        System.out.println("-----------------------------------");
    }

    // Factory method to demonstrate private constructor
    public static BaseClass createWithPrivateConstructor() {
        return new BaseClass("Created using static factory");
    }
}

