package project.edu;

import java.util.List;
import java.util.ArrayList;
public class Electronics extends Products{
	
	private static final List<Products> prods = new ArrayList<>();

	public Electronics(int prodId, String name, double price, int qty) {
		super(prodId, name, price, qty, "electronics");
	}	
	
    static {
        prods.add(new Electronics(31,"Laptop", 999.99, 10));
        prods.add(new Electronics(32, "Smartphone", 799.99, 15));
        prods.add(new Electronics(33, "Headphones", 199.99, 20));
        prods.add(new Electronics(34, "Smartwatch", 299.99, 12));
        prods.add(new Electronics(35, "Tablet", 499.99, 25));
        prods.add(new Electronics(36, "Camera", 699.99, 8));
        prods.add(new Electronics(37, "Monitor", 159.99, 14));
        prods.add(new Electronics(38, "Keyboard", 89.99, 30));
        prods.add(new Electronics(39, "Mouse", 49.99, 40));
        prods.add(new Electronics(40, "Charger", 29.99, 50));
    }
	
	
    public Products getDetails(int id) {
		for (Products product : prods) {
            if (product.getProdId() == id) {
                return product;
            }
        }
		return null;
	}	
    
    public static List<Products> getProducts() {
        return prods;
    }
}
