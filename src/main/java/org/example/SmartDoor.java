package org.example;

public class SmartDoor {
    // Exercise 4 Mini Challenge: Access Specifiers
    private boolean isLocked;

    public void lockDoor() {
        System.out.println("Locking the door...");
        this.isLocked = true;
    }

    public void unlockDoor() {
        System.out.println("Unlocking the door...");
        this.isLocked = false;
    }

    public boolean isLocked() {
        return this.isLocked;
    }
}