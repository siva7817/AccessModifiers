package org.basics;

public class Classes {
  String name;   // variable
    int age;

    void displayInfo() {   // method
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        Classes object1 = new Classes(); // Object creation
        object1.name = "Alice";
        object1.age = 20;
        object1.displayInfo();  // Alice is 20 years old.
    }
}
