package org.basics;

public class Variables {
  // Instance variable
    String name;

    // Static variable
    static String college = "ABC University";

    void setName(String n) {
        // Local variable
        String prefix = "Student: ";
        name = prefix + n;
    }
}
