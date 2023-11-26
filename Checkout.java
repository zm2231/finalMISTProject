import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Checkout {

	private HashSet<String> Checkout = new HashSet<String>();
	private static HashMap<String,Double> TodayProducts = new HashMap<String, Double>();

	private int i;
	private double totalCost;
	private String MemberID;
	private boolean IsMember;

	public Checkout(User user) {
		this.user = user;
		this.cartItems = new HashSet<>();
		this.itemPrices = new HashMap<>();
	}

	public void addItemsToCart (Product product) {
		Checkout.add(product.getName().toLowerCase());
		TodayProducts.put(product.getName(), product.applyDiscount(user));
	}

	public static void Selections(String id, Double price) {
		TodayProducts.put(id, price);
	}

	public void addCart(Scanner scnr) {
		String addition = scnr.nextLine();
		String key = addition.toLowerCase();
		String check = " ";

		while(!check.equals("done")) {

			for(String name : TodayProducts.keySet()) {
				String LowerCaseProducts = name.toLowerCase();
				if(LowerCaseProducts.equals(key)) {
					Checkout.add(key);
					System.out.println("Sucuessfully Added: " + name);
				}

			}


			key = scnr.nextLine();
			check = key.toLowerCase();
		}
	}

	public void setMemberShip(String ID) {
		MemberID = ID;
	}

	public void IsMember(Boolean Set) {
		IsMember = Set;
	}

	public void printCart() {
		for(String Products : TodayProducts.keySet()) {

			String Checker = Products.toLowerCase();

			if(Checkout.contains(Checker)) {
				System.out.println(Products + ": " + TodayProducts.get(Products));
				totalCost += TodayProducts.get(Products);
			}
		}
		if(IsMember = true) {
			totalCost = totalCost * (1-.10);
		}
		System.out.println("Total Cost: " + totalCost);
	}

}

