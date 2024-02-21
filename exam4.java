import java.util.Scanner;

// Interface for DiscountRate
interface DiscountRate {
    double getServiceDiscountRate(String type);
    double getProductDiscountRate(String type);
}

// Sale class
class Sale implements DiscountRate {
    @Override
    public double getServiceDiscountRate(String type) {
        switch(type.toLowerCase()) {
            case "premium":
                return 0.20;
            case "gold":
                return 0.15;
            case "silver":
                return 0.10;
            case "normal":
                return 0.0;
            default:
                return 0.0;
        }
    }

    @Override
    public double getProductDiscountRate(String type) {
        switch(type.toLowerCase()) {
            case "premium":
            case "gold":
            case "silver":
                return 0.10;
            case "normal":
                return 0.0;
            default:
                return 0.0;
        }
    }
}

// Customer class
class Customer {
    private String name;
    private String type;
    private String productType;

    public Customer(String name, String type, String productType) {
        this.name = name;
        this.type = type;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getProductType() {
        return productType;
    }

    public double getServiceDiscountRate() {
        return new Sale().getServiceDiscountRate(type);
    }

    public double getProductDiscountRate() {
        return new Sale().getProductDiscountRate(productType);
    }
}

// Main class
public class exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input customer details
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter customer type (Premium/Gold/Silver/Normal): ");
        String type = scanner.nextLine();
        System.out.print("Enter product type (Premium/Gold/Silver/Normal): ");
        String productType = scanner.nextLine();

        // Create Customer object
        Customer customer = new Customer(name, type, productType);

        // Display customer details
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Customer Type: " + customer.getType());
        System.out.println("Product Type: " + customer.getProductType());

        // Display discount rates
        System.out.println("\nDiscount rates:");
        System.out.println("Service discount rate: " + (customer.getServiceDiscountRate() * 100) + "%");
        System.out.println("Product discount rate: " + (customer.getProductDiscountRate() * 100) + "%");

        scanner.close();
    }
}
