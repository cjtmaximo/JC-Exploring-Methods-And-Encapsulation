package org.example;

public class VarargsExample {
    /*
    * Predicted output:
    * Number of messages: 2
    * Hello World
    *
    * Number of messages: 3
    * Testing Varargs Here
    *
    * Number of messages: 0
    * */
    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg: messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        printMessages("Hello", "World");
        printMessages("Testing", "Varargs", "Here");
        printMessages();
    }
}