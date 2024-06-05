package project.edu;

import java.util.List;

public interface CartManager {
	void addItem(Products item);
	void removeItem(Products item);
	List<Products> getProducts();
    double getTotal();
}
