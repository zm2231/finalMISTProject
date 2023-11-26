 import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Checkout {

private HashSet<String> Checkout = new HashSet<String>();
private static HashMap<String,Double> TodayProducts = new HashMap<String,Double>();

private double totalCost;
private User user;
private String memberID;



public Checkout(User user) {
	this.user = user;
	this.cartItems = new HashSet<>();
	this.itemPrices = new HashMap<>();
}

public void addItemsToCart (Product product) {
	checkoutItems.add(product.getName().toLowerCase());
	todayProducts.put(product.getName(), product.applyDiscount(user));
	}
public static void Selections(String id, Double price) {
	todayProducts.put(id, price);
}

	public void addCart(Scanner scnr) {
		String addition = scnr.nextLine();
		String key = addition.toLowerCase();
		String check = " ";
		
	while(!check.equals("done")) {

		for(String name : todayProducts.keySet()) {
			String lowerCaseProducts = name.toLowerCase();
			if(lowerCaseProducts.equals(key)) {
				Checkout.add(key);
				System.out.println("Sucuessfully Added: " + name);
			}
			key = scnr.nextLine();
			check = key.toLowerCase();
		}
		
		
		key = scnr.nextLine();
		check = key.toLowerCase();
		}
	}
	
	public void setMemberShip(String ID) {
		memberID = ID;
	}
	
	public void isMember(Boolean set) {
		isMember = set;
	}
	
	public void printCart() {
		for(String products : todayProducts.keySet()) {
			
			String Checker = products.toLowerCase();
			
			if(Checkout.contains(Checker)) {
				System.out.println(Products + ": " + todayProducts.get(products));
				totalCost += todayProducts.get(products);
		}
	}
		if(isMember = true) {
			totalCost = totalCost * (1-.10);
		}
		System.out.println("Total Cost: " + totalCost);
	}
	
}


