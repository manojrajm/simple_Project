package src.com.zoho.restruarant;

import src.com.zoho.order.Order;

import src.com.zoho.food.fooditem;

import src.com.zoho.food.fooditem;
import java.util.List;

public class Restaurant {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void displayMenu() {
        System.out.println("Welcome to " + name + "!");
        System.out.println("Here is the menu:");
        System.out.printf("%-15s %-10s%n", "Food Item", "Price");
        System.out.println("--------------------------");
        System.out.printf("%-15s %-10.2f%n", "Pizza", 20.0);
        System.out.printf("%-15s %-10.2f%n", "Burger", 25.0);
        System.out.printf("%-15s %-10.2f%n", "Salad", 15.0);
        System.out.println("--------------------------");
    }

    public void processOrder(Order order) {
        System.out.println("Processing order for " + order.getCustomerName());
        List<fooditem> items = order.getFoodItems();
        for (fooditem item : items) {
            System.out.printf("Food Item: %-10s, Price: %.2f%n", item.getName(), item.getPrice());
        }
        System.out.printf("Total Amount: %.2f%n", order.calculateTotal());
    }

    public String getName() {
        return name;
    }
}
