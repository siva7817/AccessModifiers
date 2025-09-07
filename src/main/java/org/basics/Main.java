package org.basics;

/*
What this code demonstrates:
Classes: Person and Student are classes.
Variables:
Instance variables: name, age, college
Static variable: species
Local variable: year
Objects: p1 and s1
Methods: displayInfo(), study(), showSpecies()
Constructors: Person(String, int) and Student(String, int, String)
Inheritance: Student extends Person
Method overriding: displayInfo() in Student
Static members: species and showSpecies()
*/

// Parent class
class Person {
    // Instance variables
    String name;
    int age;

    // Static variable
    static String species = "Homo sapiens";

    // Constructor
    Person(String name, int age) {
        this.name = name;  // initializing instance variables
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Static method
    static void showSpecies() {
        System.out.println("Species: " + species);
    }
}

// Child class inheriting Person
class Student extends Person {
    // Additional instance variable
    String college;

    // Constructor
    Student(String name, int age, String college) {
        super(name, age); // calling parent constructor
        this.college = college;
    }

    // Method overriding
    @Override
    void displayInfo() {
        super.displayInfo(); // call parent method
        System.out.println("College: " + college);
    }

    // Child-specific method
    void study() {
        System.out.println(name + " is studying at " + college);
    }
}

// Main class to create objects and demonstrate concepts
public class Main {
    public static void main(String[] args) {

        // Creating an object of Person
        Person p1 = new Person("Alice", 30);
        p1.displayInfo();   // calling method
        Person.showSpecies(); // calling static method

        System.out.println("--------------------");

        // Creating an object of Student (Inheritance example)
        Student s1 = new Student("Bob", 20, "ABC University");
        s1.displayInfo(); // overridden method
        s1.study();       // child class method
        Student.showSpecies(); // inherited static method

        System.out.println("--------------------");

        // Local variable example
        int year = 2025;  // local variable inside main method
        System.out.println("Current year: " + year);
    }
}
