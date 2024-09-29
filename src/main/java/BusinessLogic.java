import java.util.UUID;

public class BusinessLogic {

    public double calculateEmployeeBonus(int yearsWorked, double salary) {
        double bonusPercentage = 0.05 * yearsWorked; // 5% for each year
        return salary * bonusPercentage;
    }

    public String generateInvoiceNumber(String clientName, int orderCount) {
        return clientName.replaceAll("\\s+", "").toUpperCase() + "-" + orderCount;
    }

    public double applyDiscount(double totalAmount, double discountPercentage) {
        return totalAmount - (totalAmount * (discountPercentage / 100));
    }

    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // Simplified exchange rates
        double exchangeRate = 1.0;
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            exchangeRate = 0.85;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            exchangeRate = 1.18;
        }
        return amount * exchangeRate;
    }

    public double calculateShippingCost(double weight, String destinationCountry) {
        double baseCost = 5.0;
        double additionalCost = weight * 0.5;
        return baseCost + additionalCost;
    }

    public String scheduleMeeting(String teamMember, String timeZone, int durationInHours) {
        return "Meeting scheduled with " + teamMember + " in " + timeZone + " for " + durationInHours + " hour(s).";
    }

    public String generatePasswordResetToken(String email) {
        return UUID.randomUUID().toString() + "-" + email;
    }

    public String trackShipment(String trackingNumber) {
        return "Tracking status for " + trackingNumber + ": In Transit.";
    }

    public boolean validateEmailFormat(String email) {
        return email.contains("@") && email.contains(".");
    }

    public String getCustomerFeedback(String customerId) {
        return "Feedback for customer " + customerId + ": Positive.";
    }
}
