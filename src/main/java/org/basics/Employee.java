package org.basics;

public class Employee {

        String name;
        int age;

        // Constructor
        Employee(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println(name + " - " + age);
        }

        public static void main(String[] args) {
            Employee s1 = new Employee("Bob", 22); // calls constructor
            s1.display(); // Bob - 22
        }
}
