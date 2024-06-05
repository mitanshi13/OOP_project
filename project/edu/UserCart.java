package project.edu;

import java.util.ArrayList;
import java.util.List;

public class UserCart implements CartManager {
    
    private List<Products> items;
    
    private UserCart() {
        this.items = new ArrayList<>();
    }
    
    private static UserCart instance;
    
    public static UserCart getInstance() {
        if (instance == null) {
            instance = new UserCart();
        }
        return instance;
    }

    @Override
    public void addItem(Products item) {
        items.add(item);
    }

    @Override
    public void removeItem(Products item) {
        items.remove(item);
    }

    @Override
    public List<Products> getProducts() {
        return new ArrayList<>(items);
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (Products item : items) {
            total += item.getPrice();
        }
        return total;
    }
    
    public void clearItems() {
        items.clear();
    }
    
    @Override
    public String toString() {
        return "Items: " + items;
    }
}
