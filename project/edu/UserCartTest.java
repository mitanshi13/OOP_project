package project.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;


class UserCartTest{
	
	private UserCart userCart;

	@BeforeEach
	void setUp() {
	    userCart = UserCart.getInstance();
	    userCart.clearItems();
	}

	@Test
	void testAddItem() {
	    Products product = new Electronics(1,"Laptop", 1000.00, 10);
	    userCart.addItem(product);
	    List<Products> items = userCart.getProducts();
	    //System.out.println(product);
	    //System.out.println(items);
	    assertEquals(1, items.size());
        
	    assertEquals(product, items.get(0));
	}

	@Test
	void testRemoveItem() {
	    Products product = new Electronics(1,"Laptop", 1000.00, 10);
	    userCart.addItem(product);
	    userCart.removeItem(product);
	    List<Products> items = userCart.getProducts();
	    assertTrue(items.isEmpty());
	}
	
	@Test
	void testGetTotal() {
	    Products product1 = new Electronics(1, "Laptop", 1000.00, 10);
	    Products product2 = new Electronics(2, "Smartphone", 500.00, 20);
	    userCart.addItem(product1);
	    userCart.addItem(product2);
	    double total = userCart.getTotal();
	    assertEquals(1500.00, total, 0.01);
	}
}
