package src.com.zoho.order;

import src.com.zoho.food.fooditem;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<fooditem> foodItems;

    public Order(String customerName) {
        this.customerName = customerName;
        this.foodItems = new ArrayList<>();
    }

    public void addFoodItem(fooditem item) {
        foodItems.add(item);
    }

    public List<fooditem> getFoodItems() {
        return foodItems;
    }

    public double calculateTotal() {
        double total = 0;
        for (fooditem item : foodItems) {
            total += item.getPrice();
        }
        return total;
    }

    public String getCustomerName() {
        return customerName;
    }
}
