package project.edu;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login userAuthentication = new Login();
        UserCart userCart = null;
        UserCredentials user = null;
        Payment payment = new Payment();
        Logger logger = new Logger();

        System.out.println("Login");
        	
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if (userAuthentication.login(username, password)) {
            user = userAuthentication.getLoggedInUser();
            userCart = UserCart.getInstance();
            System.out.println("Login successful!");
            logger.log("User " + username + " logged in.");
            
        	while (true){        	
	        	System.out.println("1. Logout");
	            System.out.println("2. Search Product");
	            System.out.println("3. View Product");
	            System.out.println("4. Add to Cart");
	            System.out.println("5. View Cart");
	            System.out.println("6. Proceed to payment");
	            System.out.print("Choose an option: ");
	            int option = scanner.nextInt();
	            scanner.nextLine();
	
	            switch (option) {
	                case 1:
	                    userAuthentication.logout();
	                    user = null;
	                    userCart = null;
	                    System.out.println("Logged out successfully!");
	                    logger.log("User logged out.");
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);
	
	                case 2:
	                    System.out.print("Enter product name to search: ");
	                    String query = scanner.nextLine();
	                    List<Products> searchResults = searchProducts(query);
	                    searchResults.forEach(System.out::println);
	                    logger.log("User searched for products with query: " + query);
	                    break;
	
	                case 3:
	                    System.out.print("Enter product ID to view: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine();
	                    Products product = getProductById(id);
	                    if (product != null) {
	                        System.out.println(product);
	                        logger.log("User viewed product: " + product.getName());
	                    } else {
	                        System.out.println("Product not found!");
	                        logger.log("Product with ID " + id + " not found.");
	                    }
	                    break;
	
	                case 4:
	                    if (user == null) {
	                        System.out.println("You must be logged in to add to cart.");
	                        break;
	                    }
	                    System.out.print("Enter product ID to add to cart: ");
	                    int productId = scanner.nextInt();
	                    scanner.nextLine(); // consume newline
	                    Products prodToAdd = getProductById(productId);
	                    if (prodToAdd != null) {
	                        new CartBuilder().addProduct(prodToAdd).build();
	                        logger.log("User added product " + prodToAdd.getName() + " to cart.");
	                        System.out.println("Product added to cart.");
	                    } else {
	                        System.out.println("Product not found!");
	                        logger.log("Attempt to add non-existent product with ID " + productId + " to cart.");
	                    }
	                    break;
	
	                case 5:
	                    if (userCart == null || userCart.getProducts().isEmpty()) {
	                        System.out.println("No items in cart.");
	                        logger.log("User viewed an empty cart.");
	                    } else {
	                        List<Products> cartProducts = userCart.getProducts();
	                        cartProducts.forEach(System.out::println);
	                        System.out.println("Total: " + userCart.getTotal());
	                        logger.log("User viewed cart contents.");
	                    }
	                    break;
	                    
	                case 6:
	                    if (user == null || userCart == null || userCart.getProducts().isEmpty()) {
	                        System.out.println("No items in cart to proceed with payment.");
	                        logger.log("User attempted to proceed to payment with an empty cart or without logging in.");
	                        break;
	                    }
	                    System.out.print("Enter payment details: ");
	                    String paymentDetails = scanner.nextLine();
	                    boolean paymentSuccess = payment.processPayment(userCart.getTotal(), paymentDetails);
	                    if (paymentSuccess) {
	                        System.out.println("Payment successful! Order placed.");
	                        logger.log("Payment successful. Order placed for user.");
	                        userCart = UserCart.getInstance(); // Reset cart after successful payment
	                    } else {
	                        System.out.println("Payment failed! Please try again.");
	                        logger.log("Payment failed for user.");
	                    }
	                    break;
	
	                default:
	                    System.out.println("Invalid option. Try again.");
	            }
	        }
        } 
        else {
            System.out.println("Login failed!");
            logger.log("Failed login attempt for username: " + username);
        }
	}

    private static List<Products> searchProducts(String query) {
        List<Products> results = new ArrayList<>();
        query = query.toLowerCase();

        for (Products product : getAllProducts()) {
            if (product.getName().toLowerCase().contains(query)) {
                results.add(product);
            }
        }

        return results;
    }
    
    private static List<Products> getAllProducts() {
        List<Products> allProducts = new ArrayList<>();
        allProducts.addAll(Electronics.getProducts());
        allProducts.addAll(Fashion.getProducts());
        allProducts.addAll(SkinCare.getProducts());
        allProducts.addAll(Medical.getProducts());
        allProducts.addAll(HouseDecoration.getProducts());
        return allProducts;
    }

    private static Products getProductById(int id) {
    	for (Products product : getAllProducts()) {
            if (product.getProdId() == id) {
                return product;
            }
        }
        return null;
    }
}
