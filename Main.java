import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
	public static void main(String [] args){

		Scanner scnr = new Scanner(System.in);
        Boutique boutique = new Boutique();

        boutique.addFeaturedProduct("Don't Tell Mom");

        
        for (Supplier supplier : boutique.getSuppliers()) {
            System.out.println("Supplier: " + supplier.getName() +
                    ", Location: " + supplier.getLocation() +
                    ", Contact: " + supplier.getContact());
        }

        for (Product product : boutique.getProducts()) {
            System.out.println("Product Name: " + product.getName() +
                    ", Supplier: " + product.getSupplier() +
                    ", Price: $" + product.getPrice());
        }
        
         		
        System.out.println("Please Type the Number of Your Selection.");
        System.out.println("[1] Customer View");
        System.out.println("[2] Manager View");
        
        String password = "Boutique";
        
        int menuSelection = scnr.nextInt();
        
        if(menuSelection == 1) {

            //Retreieve user from boutique
            User user1 = boutique.getUsers().get(0);
            //Checkout instance
            Checkout checkout = createCheckoutForUser(user);
            //Select products to go in cart here
            checkout.addItemstoCart(new Product("Don't Tell Mom", "Flirt", 799.99));
            checkout.printCart();
        	
        
        	System.out.println("Featured Products of the Day: ");
            for (FeaturedProduct featuredProduct : boutique.getFeaturedProducts()) {
                System.out.println("Product: " + featuredProduct.getName() +
                        ", Supplier: " + featuredProduct.getSupplier() +
                        ", Price: $" + featuredProduct.getPrice() +
                        ", Featured: " + featuredProduct.isFeatured());
            
            System.out.println("Products of the Day: ");
            for (Product product : boutique.getProducts()) {
                    System.out.println("Product Name: " + product.getName() +
                            ", Supplier: " + product.getSupplier() +
                            ", Price: $" + product.getPrice());
                }
                
            Checkout.addCart(scnr); 
            Checkout.printCart();
                
            }
        }
        if (menuSelection == 2) {
        	System.out.println("Please Enter the Password");
            String inputPassword = scnr.next();
            if (inputPassword.equals(password)) {
            	Manager manager = new Manager(boutique);
                //Manager code goes here
            }
            else {
            	System.out.println("Incorrect Password");
            }
        	
        }

        private static Checkout createCheckoutForUser(User user) {
            if (user.isMember()) {
                return new CheckoutAsMember(user);
            }
            else {
                return new Checkout(user);
            }
        }
        	
        
        
    }
}