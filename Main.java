import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
	public static void main(String [] args){
		
		Scanner scnr = new Scanner(System.in);

		Supplier[] suppliers = {
                new Supplier("Flirt", "Georiga", "404-982-7654"),
                new Supplier("Beauty Babes", "Florida", "901-879-0342"),
                new Supplier("Party Girl Prom", "Alabama", "860-123-6754")
        };

        products.add(new Product("Don't Tell Mom", "Flirt", 799.99));
        products.add(new Product("Walk It Like You Talk It", "Beauty Babes", 550.99));
        products.add(new Product("Spicy and Sexy", "Party Girl Prom", 699.99));
        
        ArrayList<FeaturedProduct> featuredProducts = new ArrayList<>();
        FeaturedProduct.addFeaturedProduct(products, featuredProducts, "Don't Tell Mom");

        for (Supplier supplier : suppliers) {
            System.out.println("Supplier: " + supplier.getName() +
                    ", Location: " + supplier.getLocation() +
                    ", Contact: " + supplier.getContact());
        }

        for (FeaturedProduct product : featuredProducts) {
            System.out.println("Product: " + product.getName() +
                    ", Supplier: " + product.getSupplier() +
                    ", Price: $" + product.getPrice());
        }

        for (Product product : products) {
            System.out.println("Product Name: " + product.getName() +
                    ", Supplier: " + product.getSupplier() +
                    ", Price: $" + product.getPrice());
        }
        
      
        
    }
}

public class Manager {
	private Hashset<Product> products;
	private ArrayList<FeaturedProdcut> featuredProducts;
	
	public Manager(Hashset<Product> products, ArrayList<FeaturedProduct> featuredProducts) {
		this.products = products;
		this.featuredProducts = featuredProducts;
	}
	
	public void changeFaturedProduct( String newFeaturedProductName) {
		featuredProducts.clear();
		FeaturedProduct.addFeaturedProduct(products, featuredProducts, newFeaturedProdcutName);
	}
	
	public void changePrices(String productName, double newPrice) {
		for (Product product : products) {
			if(product.getName().equalsIgnoreCase(productName)) {
				product.setPrice(newPrice);
				break;
			}
		}
	}
	
	public void orderFromSupplier(String supplierName, String productName, double price) {
		Supplier supplier = findSupplierByName(supplierName);
		if (supplier != null) {
			products.add(new Product(productName, supplierName, price));
			
		}
	}
	
	private Supplier findSupplierByName(String supplierName) {
		for (Supplier supplier : suppliers) {
			if (supplier.getName().equalsIgnoreCase(supplierName)) {
				return supplier;
			}
		}
		return null;
	}
	public boolean login (String username, String password) {
		return false;
	}
}