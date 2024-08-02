package src.com.zoho;

import src.com.zoho.food.Pizza;
import src.com.zoho.food.Burger;
import src.com.zoho.food.Salad;
import src.com.zoho.order.Order;
import src.com.zoho.restruarant.Restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for customer name
        System.out.println("Enter your name:");
        String customerName = scanner.nextLine();

        // Create an order
        Order order = new Order(customerName);

        // Add food items to the order
        boolean addingItems = true;
        while (addingItems) {
            System.out.println("Choose a food item to add to your order:");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Salad");
            System.out.println("4. Done");
            System.out.println("------------------------------------------------------");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter pizza name:");
                    String pizzaName = scanner.next();
                    order.addFoodItem(new Pizza(pizzaName)); // Predefined price
                    break;
                case 2:
                    System.out.println("Enter burger name:");
                    String burgerName = scanner.next();
                    order.addFoodItem(new Burger(burgerName)); // Predefined price
                    break;
                case 3:
                    System.out.println("Enter salad name:");
                    String saladName = scanner.next();
                    order.addFoodItem(new Salad(saladName)); // Predefined price
                    break;
                case 4:
                    addingItems = false; // Exit the loop
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Create a restaurant
        Restaurant restaurant = new Restaurant("Pizza Place");

        // Process the order
        restaurant.processOrder(order);
        
        // Close the scanner
        scanner.close();
    }
}
