import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class CheckoutAsMember extends Checkout {

	public CheckoutAsMember(User user) {
		super(user);
	}

	@Override
	public static void printCart() {
		double totalSaved = 0.0;
		//Insert functionality for discount here
		
	
        System.out.println("You saved $" + totalSaved + " by being a member.");
        System.out.println("Thanks for your loyalty!");
	}
    
}

