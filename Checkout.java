import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Checkout {

	private static HashSet<String> Checkout = new HashSet<String>();
	private static HashMap<String,Double> TodayProducts = new HashMap<String, Double>();
	private static HashSet<Product> allProducts;

	private int i;
	private static double totalCostofCart;
	private static String MemberIDofCart;
	private static boolean IsMemberofCart;
	private double totalCost;
	private String MemberID;
	private boolean IsMember;
	private String user;

	public Checkout(User user) {
		this.user = user;
	}
	public static void setAllProducts(HashSet<Product> products) {
		allProducts = products;
	}
	public void addItemsToCart (Product product) {
		Checkout.add(product.getName().toLowerCase());
		TodayProducts.put(product.getName(), user.applyDiscount(product));
	}
	public void removeItemsFromCart (Product product) {
		Checkout.remove(product.getName().toLowerCase());
		TodayProducts.remove(product.getName());
	}

	public static void Selections(String id, Double price) {
		TodayProducts.put(id, price);
	}

	public static void addCart(Scanner scnr) {
		String addition = scnr.nextLine();
		String key = addition.toLowerCase();
		String check = key;

		System.out.println(key); 
		while(!check.equals("done")) {

			for(String name : TodayProducts.keySet()) {
				String LowerCaseProducts = name.toLowerCase();
				if(LowerCaseProducts.equals(key)) {
					Checkout.add(key);
					System.out.println("Sucuessfully Added: " + name);
				}
			}


			addition = scnr.nextLine();
			System.out.println(addition);
			key = addition.toLowerCase();
			check = key;
		}
	}
	public static void printCart() {
		for(String Products : TodayProducts.keySet()) {

			String Checker = Products.toLowerCase();

			if(Checkout.contains(Checker)) {
				System.out.println(Products + ": " + TodayProducts.get(Products));
				totalCostofCart += TodayProducts.get(Products);
			}
		}
		
		//Input Final Cost Calculations
		
	}

}

