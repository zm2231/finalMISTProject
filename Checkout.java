import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Checkout {

private HashSet<String> Checkout = new HashSet<String>();	
private HashMap<String,Double> TodayProducts = new HashMap<String, Double>();
	
private int i;
private double totalCost;

	public Selections(String id, Double price) {
		TodayProducts.put(id, price);
	}

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
			for(String Products : TodayProducts) {
				if(Checkout.contains(Products)) {
					System.out.println(Products + ": " + TodayProducts.get(Products))	
					totalCost += TodayProducts.get(Products);
			}
		}
			
			System.out.println("Total Cost: " + totalCost);
			
	}
	
	
}