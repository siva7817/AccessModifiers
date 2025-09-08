package com.Altair.core;



public class SamePackageClass {
    public void accessFromSamePackage() {
        BaseClass base = new BaseClass(); // ✅ Default constructor accessible
        System.out.println("Inside SamePackageClass:");

        // Variables
        // System.out.println(base.privateVar);   ❌ Not accessible
        System.out.println(base.defaultVar);     // ✅
        System.out.println(base.protectedVar);   // ✅
        System.out.println(base.publicVar);      // ✅

        // Methods
        // base.privateMethod();   ❌
        base.defaultMethod();      // ✅
        base.protectedMethod();    // ✅
        base.publicMethod();       // ✅

        // Default class access
        DefaultClass def = new DefaultClass();
        def.show(); // ✅ Same package

        System.out.println("-----------------------------------");
    }
}
