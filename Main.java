import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
	public static void main(String [] args){
		
		Scanner scnr = new Scanner(System.in);
/*
		Supplier[] suppliers = {
                new Supplier("Flirt", "Georiga", "404-982-7654"),
                new Supplier("Beauty Babes", "Florida", "901-879-0342"),
                new Supplier("Party Girl Prom", "Alabama", "860-123-6754")
        };

        products.add(new Product("Don't Tell Mom", "Flirt", 799.99));
        products.add(new Product("Walk It Like You Talk It", "Beauty Babes", 550.99));
        products.add(new Product("Spicy and Sexy", "Party Girl Prom", 699.99));
        
        ArrayList<FeaturedProduct> featuredProducts = new ArrayList<>();
*/
        boutique.addFeaturedProduct("Don't Tell Mom");

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