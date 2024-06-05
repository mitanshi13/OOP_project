package project.edu;

import java.util.List;
import java.util.ArrayList;

public class SkinCare extends Products{
	
    private static final List<Products> prods = new ArrayList<>();
	
	public SkinCare(int prodId, String name, double price, int qty) {
		super(prodId, name, price, qty, "skincare");
	}
	
	static {
        prods.add(new SkinCare(11, "Moisturizing Cream", 25.99, 50));
        prods.add(new SkinCare(12, "Facial Cleanser", 15.99, 60));
        prods.add(new SkinCare(13, "Sunscreen Lotion", 20.99, 40));
        prods.add(new SkinCare(14, "Anti-Aging Serum", 55.99, 30));
        prods.add(new SkinCare(15, "Hydrating Face Mask", 12.99, 70));
        prods.add(new SkinCare(16, "Exfoliating Scrub", 18.99, 45));
        prods.add(new SkinCare(17, "Eye Cream", 30.99, 35));
        prods.add(new SkinCare(18, "Toner", 22.99, 50));
        prods.add(new SkinCare(19, "Lip Balm", 8.99, 80));
        prods.add(new SkinCare(20, "Acne Treatment Gel", 19.99, 65));
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
