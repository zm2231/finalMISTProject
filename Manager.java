import java.util.HashSet;

public class Manager {

    private Boutique boutique;

    public Manager(Boutique boutique) {
        this.boutique = boutique;
    }

    public String getPhoneNumber(String supplierName) {
        for (Supplier supplier : boutique.getSuppliers()) {
            if (supplier.getName().equalsIgnoreCase(supplierName)) {
                return supplier.getContact();
            }
        }
        return "Supplier not found";
    }

    public void addNewProduct(String name, String supplier, double price) {
        boutique.getProducts().add(new Product(name, supplier, price));
        System.out.println("Product added: " + name);
    }

    public void removeProduct(String productName) {
        boutique.getProducts().removeIf(product -> product.getName().equalsIgnoreCase(productName));
        System.out.println("Product removed: " + productName);
    }

    public void listAllSuppliers() {
        for (Supplier supplier : boutique.getSuppliers()) {
            System.out.println(supplier.getName() + " - " + supplier.getLocation() + " - " + supplier.getContact());
        }
    }

    public void listAllProducts() {
        for (Product product : boutique.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }

    public void changePrice(String productName, double newPrice) {
        for (Product product : boutique.getProducts()) {
            if (product.getName().equalsIgnoreCase(productName)) {
                product.setPrice(newPrice);
                System.out.println("Updated price of " + productName + " to $" + newPrice);
                return;
            }
        }
        System.out.println("Product not found: " + productName);
    }

    public void orderFromSupplier(String supplierName, String productName, double price) {
        Supplier supplier = findSupplierByName(supplierName);
        if (supplier == null) {
            System.out.println("Supplier not found: " + supplierName);
        }
        else {
            boutique.getProducts().add(new Product(productName, supplierName, price));
            System.out.println("Product added: " + productName);
        }
    }

    public void managerMenu(Scanner scnr) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nManager Menu:");
            System.out.println("1. List All Products");
            System.out.println("2. Add New Product");
            System.out.println("3. Remove Product");
            System.out.println("4. List All Suppliers");
            System.out.println("5. Get Supplier Phone Number");
            System.out.println("6. Change Product Price");
            System.out.println("7. Order From Supplier");
            System.out.println("8. Exit");

            System.out.println("What would you like to do? Enter the choice number: ");
            int choice = scnr.nextInt();
            scnr.nextLine();

            switch (choice) {
                case 1:
                    listAllProducts();
                    break;
                case 2:
                    System.out.println("Enter product name: ");
                    String name = scnr.nextLine();
                    System.out.println("Enter supplier name: ");
                    String supplier = scnr.nextLine();
                    System.out.println("Enter price: ");
                    double price = scnr.nextDouble();
                    addNewProduct(name, supplier, price);
                    break;
                case 3:
                    System.out.println("Enter product name to remove: ");
                    String productNameToRemove = scnr.nextLine();
                    removeProduct(productNameToRemove);
                    break;
                case 4:
                    listAllSuppliers();
                    break;
                case 5:
                    System.out.println("Enter supplier name: ");
                    String supplierName = scnr.nextLine();
                    System.out.println("Phone number: " + getPhoneNumber(supplierName));
                    break;
                case 6:
                    System.out.println("Enter product name: ");
                    String productName = scnr.nextLine();
                    System.out.println("Enter new price: ");
                    double newPrice = scnr.nextDouble();
                    changePrice(productName, newPrice);
                    break;
                case 7:
                    System.out.println("Enter supplier name: ");
                    String supplierForOrder = scnr.nextLine();
                    System.out.println("Enter product name: ");
                    String productForOrder = scnr.nextLine();
                    System.out.println("Enter price: ");
                    double orderPrice = scnr.nextDouble();
                    orderFromSupplier(supplierForOrder, productForOrder, orderPrice);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            }

        }
    }

}
