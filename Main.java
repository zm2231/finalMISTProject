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

        
        String input = scnr.next();
        input.toLowerCase();
        
        while(!input.equals("done")) {
        	Checkout.add(input)
        	input = scnr.next();
        	input.toLowerCase()
        }
        
    }
}
/*
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
/*

/*
public class Supplier {
    private String name;
    private String location;
    private String contact;

    public Supplier(String name, String location, String contact) {
        this.name = name;
        this.location = location;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getContact() {
        return contact;
    }
    
}
*/

/* import java.util.HashSet;
import java.util.Scanner;
public class Checkout {

private HashSet<String> Checkout = new HashSet<String>();	
	
private int i;
private double totalCost;

	public void addCart(Scanner scnr) {
		String addition = scnr.nextLine();
		String key = addition.toLowerCase();
		String check = " ";
		
	while(!check.equals("done")) {
		Checkout.add(key);
		key = scnr.nextLine();
		check = key.toLowerCase();
		}
	}
	
	public void printCart() {
		
	}
	
}
*/

/*
import java.util.HashSet;
public class Product {
    private String name;
    private String supplier;
    private double price;

    public Product(String name, String supplier, double price) {
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

    @Override
    public boolean equals(Object o) {
        boolean isEqual = false;
        if (this == o) {
            isEqual = true;
        }
        else if (o != null && getClass() == o.getClass()) {
            Product product = (Product) o;
            isEqual = Double.compare(product.price, price) == 0 && name.equals(product.name) && supplier.equals(product.supplier);
        }
        return isEqual;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, supplier, price);
    }
}
    */





