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
        suppliers = new Supplier[] ("Flirt", "Georgia", "404-982-7654");
        suppliers = new Supplier[] ("Beauty Babes", "Florida", "901-879-0342");
        suppliers = new Supplier[] ("Party Girl Prom", "Alabama", "860-123-6754");
    }

    private void initializeProducts() {
        products.add(new Product("Don't Tell Mom", "Flirt", 799.99));
        products.add(new Product("Walk It Like You Talk It", "Beauty Babes", 550.99));
        products.add(new Product("Spicy and Sexy", "Party Girl Prom", 699.99));
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
    
    for (Product product : products) {
        Checkout.Selections(product.getName(), product.getPrice());
        }
    
    
    
}