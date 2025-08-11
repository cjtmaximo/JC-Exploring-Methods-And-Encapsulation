package org.example;

public class Pizza {
    /* Exercise 7
    * Predicted output:
    * Default pizza created.
    * Size: 12 inches, Toppings: Cheese
    * Default pizza created.
    * Pizza with custom toppings created.
    * Size: 12 inches, Toppings: Pepperoni
    * Fully custom pizza created.
    * Size: 16 inches, Mushroom and Onion
    * */
    private String toppings;
    private int size; // in inches

    public Pizza() {
        this.toppings = "Cheese";
        this.size = 12;
        System.out.println("Default pizza created.");
    }

    public Pizza(String toppings) {
        this();
        this.toppings = toppings;
        System.out.println("Pizza with custom toppings created.");
    }

    public Pizza(String toppings, int size) {
        this.toppings = toppings;
        this.size = size;
        System.out.println("Fully custom pizza created.");
    }

    public void display() {
        System.out.println("Size: " + size + " inches, Toppings: " + toppings);
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.display();

        Pizza pizza2 = new Pizza("Pepperoni");
        pizza2.display();

        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
        pizza3.display();
    }
}