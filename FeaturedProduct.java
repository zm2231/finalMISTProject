public class FeaturedProduct {
    private String name;
    private String supplier;
    private double price;

    public FeaturedProduct(String name, String supplier, double price) {
        this.name = name;
        this.supplier = supplier;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getPrice() {
        return price;
    }

    public static void addFeaturedProduct(HashSet<Product> products, ArrayList<FeaturedProduct> featuredProducts, String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                featuredProducts.add(new FeaturedProduct(product.getName(), product.getSupplier(), product.getPrice()));
                break;
            }
        }
    }
    
}
