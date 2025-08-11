package org.example;

public class User {
    // Exercise 8 Mini Challenge: Encapsulation
    private String password = "abcdefgh";

    public String getPassword() {
        StringBuilder maskedPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            maskedPassword.append("*");
        }
        return "Current masked password: " + maskedPassword;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Error: Password must be at least 8 characters long.");
            return;
        }

        this.password = password;
    }
}