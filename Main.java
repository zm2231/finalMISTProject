import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
	public static void main(String [] args){

		Scanner scnr = new Scanner(System.in);
        Boutique boutique = new Boutique();

        boutique.addFeaturedProduct("Don't Tell Mom");
        
         		
        System.out.println("Please Type the Number of Your Selection.");
        System.out.println("[1] Customer View");
        System.out.println("[2] Manager View");
        
        String password = "Boutique";
        
        int menuSelection = scnr.nextInt();
        
        if(menuSelection == 1) {
        
        	System.out.println("Please Enter Your Member ID");
            String inputMemberID = scnr.next();
            //implmennt member ID check
            boutique.printProducts();
                
            Checkout.addCart(scnr); 
            Checkout.CalculateCart();
                
            }
        }
        if (menuSelection == 2) {
        	System.out.println("Please Enter the Password");
            String inputPassword = scnr.next();
            if (inputPassword.equals(password)) {
            	Manager manager = new Manager(boutique);
                manager.managerMenu(scnr);
            }
            else {
            	System.out.println("Incorrect Password");
            }
        	
        }

  /*      private static Checkout createCheckoutForUser(User user) {
            if (user.isMember()) {
                return new CheckoutAsMember(user);
            }
            else {
                return new Checkout(user);
            }
        } */
        	
        
        
    }
}