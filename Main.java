import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
	public static void main(String [] args){
		//Supplier class
		public class Supplier {
			private String name;
			private String location;
			private String contact;
			
			public Supplier(String name, String location, String contact) {
				this.name = name;
				this.location = location;
				this.contact = contact;	
				}
			public String getname() {
				return name;
			}
			public String getLocation() {
				return location;
			}
			public String getContact() {
				return contact;
			}
		}
		        
		for (Supplier supplier : suppliers) {
			System.out.println("Supplier: " + supplier.getName()
			+ "Location: " + supplier.getLocation() +
			"Contact: " + supplier.getContact());
		}
		
		Supplier[] suppliers = {
				new Supplier("Flirt", "Georgia", "404-982-7654");
				new Supplier("Beauty Babes", "Florida", "901-879-0342");
				new Supplier("Party Girl Prom", "Alabama", "860-123-6754");
		}

	
	}
}
