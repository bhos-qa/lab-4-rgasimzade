import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BusinessLogicTest {

    private final BusinessLogic businessLogic = new BusinessLogic();

    @Test
    public void testCalculateEmployeeBonus() {
        double bonus = businessLogic.calculateEmployeeBonus(5, 50000);
        assertEquals(12500.0, bonus, 0.01);
    }

    @Test
    public void testGenerateInvoiceNumber() {
        String invoiceNumber = businessLogic.generateInvoiceNumber("John Doe", 1);
        assertEquals("JOHNDOE-1", invoiceNumber);
    }

    @Test
    public void testApplyDiscount() {
        double discountedPrice = businessLogic.applyDiscount(200, 10);
        assertEquals(180.0, discountedPrice, 0.01);
    }

    @Test
    public void testConvertCurrency() {
        double convertedAmount = businessLogic.convertCurrency(100, "USD", "EUR");
        assertEquals(85.0, convertedAmount, 0.01);
    }

    @Test
    public void testCalculateShippingCost() {
        double shippingCost = businessLogic.calculateShippingCost(10, "USA");
        assertEquals(10.0, shippingCost, 0.01);
    }
}
