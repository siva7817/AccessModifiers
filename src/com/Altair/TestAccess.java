package com.Altair;


import com.Altair.core.BaseClass;
import com.Altair.core.SamePackageClass;
import com.Altair.other.DifferentPackageClass;
import com.Altair.other.SubClass;

public class TestAccess {
    public static void main(String[] args) {
        System.out.println("=== Access Modifiers Full Demo ===\n");

        // Access in BaseClass
        BaseClass base = new BaseClass(true);
        base.showVars();

        // Demonstrating private constructor via factory
        BaseClass privateObj = BaseClass.createWithPrivateConstructor();

        // Same package access
        new SamePackageClass().accessFromSamePackage();

        // Different package access
        new DifferentPackageClass().accessFromDifferentPackage();

        // Subclass access (inheritance)
        new SubClass().accessFromSubClass();
    }
}
