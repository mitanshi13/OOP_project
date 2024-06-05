package project.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductFactoryTest {

    @Test
    void testCreateElectronicsProduct() {
        ProductFactory productFactory = new ProductFactory();
        Products product = productFactory.getProduct("electronics", 1, "Laptop", 1000.00, 10);
        assertNotNull(product);
        assertEquals("Laptop", product.getName());
        assertTrue(product instanceof Electronics);
    }

    @Test
    void testCreateClothingProduct() {
        ProductFactory productFactory = new ProductFactory();
        Products product = productFactory.getProduct("fashion", 2, "T-Shirt", 20.00, 50);
        assertNotNull(product);
        assertEquals("T-Shirt", product.getName());
        assertTrue(product instanceof Fashion);
    }

    @Test
    void testCreateSkinCareProduct() {
        ProductFactory productFactory = new ProductFactory();
        Products product = productFactory.getProduct("skincare", 3, "Face Cream", 15.00, 30);
        assertNotNull(product);
        assertEquals("Face Cream", product.getName());
        assertTrue(product instanceof SkinCare);
    }

    @Test
    void testCreateMedicalProduct() {
        ProductFactory productFactory = new ProductFactory();
        Products product = productFactory.getProduct("medical", 4, "Pain Reliever", 10.00, 100);
        assertNotNull(product);
        assertEquals("Pain Reliever", product.getName());
        assertTrue(product instanceof Medical);
    }

    @Test
    void testCreateHouseDecorationsProduct() {
        ProductFactory productFactory = new ProductFactory();
        Products product = productFactory.getProduct("housedecoration", 5, "Vase", 25.00, 15);
        assertNotNull(product);
        assertEquals("Vase", product.getName());
        assertTrue(product instanceof HouseDecoration);
    }
}
