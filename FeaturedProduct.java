public class FeaturedProduct extends Product {
    public boolean isFeatured;
    public FeaturedProduct(String name, String supplier, double price) {
        super(name, supplier, price);
        this.isFeatured = true;
    }
    public FeaturedProduct(Product product) {
        super(product.getName(), product.getSupplier(), product.getPrice());
        this.isFeatured = true;
    }
    public boolean isFeatured() {
        return isFeatured;
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
