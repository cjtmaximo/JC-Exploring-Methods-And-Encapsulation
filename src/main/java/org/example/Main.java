package org.example;

import java.util.Arrays;

public class Main {
    public static void changeStudentName(Student student, String name) {
        student.name = name;
    }

    public static void findLargest(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Largest with no numbers is: " + Integer.MIN_VALUE);
            return;
        }

        int largestNumber = Integer.MIN_VALUE;
        for (int num: numbers) {
            largestNumber = Math.max(largestNumber, num);
        }

        System.out.println("Largest in " + Arrays.toString(numbers) + " is: " + largestNumber);
    }

    public static void main(String[] args) {
//        Exercise 2: Passing Parameters: Primitives vs Objects
//        Student myStudent = new Student();
//        myStudent.name = "Alex";
//        System.out.println("Name before change: " + myStudent.name);
//        changeStudentName(myStudent, "John");
//        System.out.println("Name after change: " + myStudent.name);

        // Exercise 3: Using Varargs
//        findLargest(10, 5, 25, 25);
//        findLargest(-5, -1, -10);
//        findLargest();

        // Exercise 4 Mini Challenge: Access Specifiers
//        SmartDoor mySmartDoor = new SmartDoor();
//        System.out.println("Is the door locked? " + mySmartDoor.isLocked());
//        mySmartDoor.lockDoor();
//        System.out.println("Is the door locked? " + mySmartDoor.isLocked());
//        mySmartDoor.unlockDoor();
//        System.out.println("Is the door locked? " + mySmartDoor.isLocked());

        // Exercise 5 Mini Challenge: Static Methods and Variables
//        double myTemp = 25.0;
//        System.out.println(myTemp + " degrees C is " + Converter.celsiusToFahrenheit(myTemp) + " degrees F.");

        // Exercise 6 Mini Challenge: Method Overloading
        int celsiusTemp = 25; // int override
        System.out.println(celsiusTemp + " degrees C is " + Converter.celsiusToFahrenheit(celsiusTemp) + " degrees F.");

        double fahrenheitTemp = 77.0;
        System.out.println(fahrenheitTemp + " degrees C is " + Converter.celsiusToFahrenheit(fahrenheitTemp) + " degrees F.");
    }
}