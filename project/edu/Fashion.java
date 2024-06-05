package project.edu;

import java.util.ArrayList;
import java.util.List;

public class Fashion extends Products{
	
	private static final List<Products> prods = new ArrayList<>();
	
	public Fashion(int prodId, String name, double price, int qty) {
		super(prodId, name, price, qty, "fashion");
	}	
	
	static {
        prods.add(new Fashion(1, "T-Shirt", 19.99, 50));
        prods.add(new Fashion(2, "Jeans", 49.99, 30));
        prods.add(new Fashion(3, "Sweater", 39.99, 40));
        prods.add(new Fashion(4, "Jacket", 129.99, 20));
        prods.add(new Fashion(5, "Shirt", 29.99, 25));
        prods.add(new Fashion(6, "Shorts", 24.99, 35));
        prods.add(new Fashion(7, "Skirt", 34.99, 15));
        prods.add(new Fashion(8, "Blouse", 44.99, 10));
        prods.add(new Fashion(9, "Coat", 99.99, 12));
        prods.add(new Fashion(10, "Dress", 59.99, 18));
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
