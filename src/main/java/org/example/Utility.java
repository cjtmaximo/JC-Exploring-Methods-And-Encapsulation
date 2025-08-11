package org.example;

public class Utility {
    // Exercise 5: Static Methods and Variables
    /* Predicted output:
    * My Awesome App
    * Instance ID: ID-12345
    * */
    public static String getAppName() {
        return "My Awesome App";
    }

    public String getInstanceId() {
        return "ID-12345";
    }

    public static void main(String[] args) {
        System.out.println("App name: " + Utility.getAppName());

        // The following line would cause a compile-time error
        // System.out.println("Instance ID: " + Utility.getInstanceId());

        Utility utilInstance = new Utility();
        System.out.println("Instance ID: " + utilInstance.getInstanceId());
    }

}