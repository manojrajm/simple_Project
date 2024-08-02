package src.com.zoho.food;

public abstract class fooditem{
    private String name;
    private double price;

    public fooditem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}