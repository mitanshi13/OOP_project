package project.edu;

import java.util.ArrayList;
import java.util.List;

public class HouseDecoration extends Products{

	private static final List<Products> prods = new ArrayList<>();
	
	public HouseDecoration(int prodId, String name, double price, int qty) {
		super(prodId, name, price, qty, "housedecoration");
	}	
	
	static {
        prods.add(new HouseDecoration(21, "Decorative Throw Pillows", 22.99, 35));
        prods.add(new HouseDecoration(22, "Wall Art Paintings", 120.00, 10));
        prods.add(new HouseDecoration(23, "Table Lamps", 45.99, 20));
        prods.add(new HouseDecoration(24, "Indoor Potted Plants", 25.99, 25));
        prods.add(new HouseDecoration(25, "Candles and Candle Holders", 15.99, 40));
        prods.add(new HouseDecoration(26, "Area Rugs", 80.99, 15));
        prods.add(new HouseDecoration(27, "Picture Frames", 12.99, 50));
        prods.add(new HouseDecoration(28, "Decorative Vases", 30.99, 20));
        prods.add(new HouseDecoration(29, "Wall Mirrors", 60.99, 18));
        prods.add(new HouseDecoration(30, "Fairy Lights", 19.99, 45));
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
