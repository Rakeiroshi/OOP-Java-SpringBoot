import models.Product;
import models.Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Aggiungi prodotti all'inventario
        Product motosega = new Product("PID001", "Motosega Homelite XL-12", 299.99);
        Product fucile = new Product("PID002", "Fucile a canne mozze", 449.99);
        Product m4 = new Product("PID003", "Fucile d'assalto Colt M4", 2999.99);
        Product knife = new Product("PID004","Survival Rambo", 49.99 );

        inventory.addProduct(motosega);
        inventory.addProduct(fucile);
        inventory.addProduct(m4);
        inventory.addProduct(knife);

        // Aggiungi un altro prodotto all'inventario
        Product barret = new Product("PID005", "Fucile di precisione Barrett M82", 15.99);
        inventory.addProduct(barret);

        // Visualizza il numero totale di prodotti
        System.out.println("Numero totale di prodotti: " + inventory.getTotalProducts());

        // Visualizza i dettagli di un prodotto specifico tramite ID
        String productId = "PID003";
        Product product = inventory.getProductById(productId);
        if (product != null) {
            System.out.println("Dettagli prodotto: " + product);
        } else {
            System.out.println("Prodotto con ID " + productId + " non trovato.");
        }

        // Rimuovi un prodotto tramite ID
        String removeProductId = "PID004";
        inventory.removeProduct(removeProductId);

        // Aggiorna il prezzo di un prodotto tramite ID
        String updateProductId = "PID001";
        double newPrice = 199.99;
        inventory.updateProductPrice(updateProductId, newPrice);

        // Calcola e visualizza il valore totale dell'inventario
        System.out.println("Valore totale dell'inventario: €" + inventory.getTotalInventoryValue());
    }
}
