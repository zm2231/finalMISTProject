import java.util.HashSet;
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