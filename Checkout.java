import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
public class Checkout {

	private static HashSet<String> Checkout = new HashSet<String>();
	private static HashMap<String,Double> TodayProducts = new HashMap<String, Double>();

	private int i;
	private static double totalCost;
	private static String MemberID;
	private static boolean IsMember;

	public static void Selections(String id, Double price) {
		TodayProducts.put(id, price);
	}

	public static void addCart(Scanner scnr) {
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

	public static void setMemberShip(String ID) {
		MemberID = ID;
	}

	public static void IsMember(Boolean Set) {
		IsMember = Set;
	}

	public static void printCart() {
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

