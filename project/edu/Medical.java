package project.edu;

import java.util.ArrayList;
import java.util.List;

public class Medical extends Products{
	
	private static final List<Products> prods = new ArrayList<>();

	public Medical(int prodId, String name, double price, int qty) {
		super(prodId, name, price, qty, "medical");
	}	
	
	static {
        prods.add(new Medical(41, "Blood Pressure Monitor", 55.99, 15));
        prods.add(new Medical(42, "Thermometer", 8.99, 100));
        prods.add(new Medical(43, "Glucometer", 29.99, 25));
        prods.add(new Medical(44, "Pulse Oximeter", 19.99, 50));
        prods.add(new Medical(45, "Nebulizer", 45.99, 20));
        prods.add(new Medical(46, "Digital Weighing Scale", 35.99, 30));
        prods.add(new Medical(47, "First Aid Kit", 24.99, 40));
        prods.add(new Medical(48, "Stethoscope", 89.99, 10));
        prods.add(new Medical(49, "Medical Face Mask", 9.99, 200));
        prods.add(new Medical(50, "Hand Sanitizer", 3.99, 150));
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
