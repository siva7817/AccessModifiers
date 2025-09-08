package com.Altair.other;



import com.Altair.core.BaseClass;

public class SubClass extends BaseClass {
    public SubClass() {
        super(42); // ✅ Calls protected constructor
    }

    public void accessFromSubClass() {
        System.out.println("Inside SubClass:");

        // Variables
        // System.out.println(privateVar);   ❌
        // System.out.println(defaultVar);   ❌
        System.out.println(protectedVar);   // ✅ via inheritance
        System.out.println(publicVar);      // ✅

        // Methods
        // privateMethod();   ❌
        // defaultMethod();   ❌
        protectedMethod();   // ✅ via inheritance
        publicMethod();      // ✅

        System.out.println("-----------------------------------");
    }
}
