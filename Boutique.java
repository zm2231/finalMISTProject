import java.util.HashSet;
import java.util.ArrayList;

public class Boutique {
    private HashSet<Product> products;
    private ArrayList<FeaturedProduct> featuredProducts;
    private Supplier[] suppliers;

    public Boutique() {
        products = new HashSet<>();
        featuredProducts = new ArrayList<>();
        initializeSuppliers();
        initializeProducts();
    }

    private void initializeSuppliers() {
        // to-do, copy over suppliers from Main.java
    }

    private void initializeProducts() {
        // to-do, copy over products from Main.java
    }

    public  void addFeaturedProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                featuredProducts.add(new FeaturedProduct(product.getName(), product.getSupplier(), product.getPrice()));
                break;
            }
        }
    }

    public HashSet<Product> getProducts() {
        return products;
    }

    public ArrayList<FeaturedProduct> getFeaturedProducts() {
        return featuredProducts;
    }

    public Supplier[] getSuppliers() {
        return suppliers;
    }
}