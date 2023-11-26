import java.util.HashSet;

public class Manager {

    private Boutique boutique;

    public Manager(Boutique boutique) {
        this.boutique = boutique;
    }

    public String getPhoneNumber(String supplierName) {
        for (Supplier supplier : boutique.getSuppliers()) {
            if (supplier.getName().equalsIgnoreCase(supplierName)) {
                return supplier.getContact();
            }
        }
        return "Supplier not found";
    }

    public void addNewProduct(String name, String supplier, double price) {
        boutique.getProducts().add(new Product(name, supplier, price));
        System.out.println("Product added: " + name);
    }

    public void removeProduct(String productName) {
        boutique.getProducts().removeIf(product -> product.getName().equalsIgnoreCase(productName));
        System.out.println("Product removed: " + productName);
    }

    public void updateProductPrice(String productName, double newPrice) {
        for (Product product : boutique.getProducts()) {
            if (product.getName().equalsIgnoreCase(productName)) {
                product.setPrice(newPrice);
                System.out.println("Updated price of " + productName + " to $" + newPrice);
                return;
            }
        }
        System.out.println("Product not found: " + productName);
    }

    public void listAllSuppliers() {
        for (Supplier supplier : boutique.getSuppliers()) {
            System.out.println(supplier.getName() + " - " + supplier.getLocation() + " - " + supplier.getContact());
        }
    }

    public void listAllProducts() {
        for (Product product : boutique.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}
