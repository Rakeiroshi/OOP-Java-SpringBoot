package models;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    public Map<String, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
    }

    public int getTotalProducts() {
        return inventory.size();
    }

    public Product getProductById(String productId) {
        return inventory.get(productId);
    }

    public void removeProduct(String productId) {
        inventory.remove(productId);
    }

    public void updateProductPrice(String productId, double newPrice) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setPrice(newPrice);
        }
    }

    public double getTotalInventoryValue() {
        double totalValue = 0.0;
        for (Product product : inventory.values()) {
            totalValue += product.getPrice();
        }
        return totalValue;
    }
}