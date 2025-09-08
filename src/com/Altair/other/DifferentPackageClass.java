package com.Altair.other;



import com.Altair.core.BaseClass;

public class DifferentPackageClass {
    public void accessFromDifferentPackage() {
        BaseClass base = new BaseClass(true); // ✅ Public constructor
        System.out.println("Inside DifferentPackageClass:");

        // Variables
        // System.out.println(base.privateVar);   ❌
        // System.out.println(base.defaultVar);   ❌
        // System.out.println(base.protectedVar); ❌
        System.out.println(base.publicVar);      // ✅

        // Methods
        // base.privateMethod();   ❌
        // base.defaultMethod();   ❌
        // base.protectedMethod(); ❌
        base.publicMethod();       // ✅

        System.out.println("-----------------------------------");
    }
}
