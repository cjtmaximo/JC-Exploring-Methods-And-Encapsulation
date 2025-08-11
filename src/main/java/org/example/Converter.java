package org.example;

public class Converter {
    // Exercise 5 Mini Challenge: Static Methods and Variables
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    // Exercise 6 Mini Challenge: Method Overloading
    public static double celsiusToFahrenheit(int celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }

}