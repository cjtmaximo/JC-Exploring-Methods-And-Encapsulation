package org.example;

public class ParameterPassing {
    public static void modifyValue(int value) {
        value = 100;
        System.out.println("Inside method: " + value);
    }

    public static void main(String[] args) {
        /*
        * Predicted output:
        * Before method call: 50
        * Inside method: 100
        * After method call: 100
        * Explanation: A copy of the value of originalValue is passed to the modifyValue function, so the value of originalValue doesn't change. Meaning, primitives are passed by value to a function, while objects are passed by reference (their memory address).
        * */
        int originalValue = 50;
        System.out.println("Before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("After method call: " + originalValue);
    }
}