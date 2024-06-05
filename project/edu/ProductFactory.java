package project.edu;

public class ProductFactory {
	public static Products getProduct(String type, int prodId, String name, double price, int qty) {
		if(type.equalsIgnoreCase("skincare")) {
			return new SkinCare(prodId, name, price, qty);
		}
		else if(type.equalsIgnoreCase("electronics")) {
			return new Electronics(prodId, name, price, qty);
		}
		else if(type.equalsIgnoreCase("fashion")) {
			return new Fashion(prodId, name, price, qty);
		}
		else if(type.equalsIgnoreCase("medical")) {
			return new Medical(prodId, name, price, qty);
		}
		else if(type.equalsIgnoreCase("housedecoration")) {
			return new HouseDecoration(prodId, name, price, qty);
		}
		else {
			return null;
		}
	}
}
