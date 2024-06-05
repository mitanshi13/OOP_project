package project.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentTest {

    private Payment payment;

    @BeforeEach
    void setUp() {
        payment = new Payment();
    }

    @Test
    void testProcessPaymentSuccess() {
        boolean result = payment.processPayment(100.00, "valid-card");
        assertTrue(result);
    }

    @Test
    void testProcessPaymentFailure() {
        boolean result = payment.processPayment(100.00, "invalid-card");
        assertFalse(result);
    }

    @Test
    void testProcessPaymentError() {
        boolean result = payment.processPayment(100.00, "unknown-card");
        assertFalse(result);
    }
}
