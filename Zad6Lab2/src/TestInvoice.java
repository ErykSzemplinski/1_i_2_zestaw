public class TestInvoice {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("123", "Example product", 5, 10.0);
        System.out.println("Product number: " + invoice.getProductNumber());
        System.out.println("Product description: " + invoice.getProductDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Amount: " + invoice.getAmount());
    }
}