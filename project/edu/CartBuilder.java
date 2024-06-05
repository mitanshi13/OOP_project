package project.edu;

public class CartBuilder {
	private UserCart userCart;

    public CartBuilder() {
        this.userCart = UserCart.getInstance();
    }

    public CartBuilder addProduct(Products product) {
        userCart.addItem(product);
        return this;
    }

    public CartBuilder removeProduct(Products product) {
        userCart.removeItem(product);
        return this;
    }

    public UserCart build() {
        return userCart;
    }
}
