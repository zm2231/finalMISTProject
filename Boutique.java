import java.util.HashSet;
import java.util.ArrayList;

public class Boutique {
    private HashSet<Product> products;
    private ArrayList<FeaturedProduct> featuredProducts;
    private Supplier[] suppliers;
    private ArrayList<User> users;


    public Boutique() {
        products = new HashSet<>();
        featuredProducts = new ArrayList<>();
        users = new ArrayList<>();
        initializeSuppliers();
        initializeProducts();
        initializeUsers();
    }

    private void initializeSuppliers() {
        suppliers = new Supplier[] {
                new Supplier("Flirt", "Georgia", "404-982-7654"),
                new Supplier("Beauty Babes", "Florida", "901-879-0342"),
                new Supplier("Party Girl Prom", "Alabama", "860-123-6754")
        };
    }

    private void initializeProducts() {
        products.add(new Product("Don't Tell Mom", "Flirt", 799.99));
        products.add(new Product("Walk It Like You Talk It", "Beauty Babes", 550.99));
        products.add(new Product("Spicy and Sexy", "Party Girl Prom", 699.99));
        Checkout.setAllProducts(products);
    }

    public void initializeUsers() {
        users.add(new User("user1", "password1", "user1@example.com", true));
        users.add(new User("user2", "password2", "user2@example.com", false));
        users.add(new User("user3", "password3", "user3@example.com", true, 2000, 5, 15));
    }

    public void addFeaturedProduct(String productName) {
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

    public ArrayList<User> getUsers() {
        return users;
    }

}
    
    
    
