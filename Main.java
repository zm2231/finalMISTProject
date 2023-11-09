import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
	public static void main(String [] args){

		 Products
		        FeaturedProduct[] featuredProducts = {
				                new FeaturedProduct("Don't Tell Mom", "Flirt", 799.99),
				                new FeaturedProduct("Walk It Like You Talk It", "Beauty Babes", 550.99),
				                new FeaturedProduct("Spicy and Sexy", "Party Girl Prom", 699.99)
				        };

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
				    }
				}

				
				class FeaturedProduct {
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
				}
