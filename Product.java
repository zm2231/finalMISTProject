import java.util.HashSet;
public class Product {
    private String name;
    private String supplier;
    private double price;

    public Product(String name, String supplier, double price) {
        this.name = name;
        this.supplier = supplier;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
    	this.price = price;
    }

    @Override
    public double applyDiscount(User user) {
        double discount = 0.0;
        int currentMonth = 5;
        int currentDay = 15;

        if (user.isMember()) {
            discount += 0.10;
        }
        if (user.getBirthMonth() == currentMonth && user.getBirthDay() == currentDay) {
            discount += 0.05;
        }
        return this.price * (1 - discount);
    }

    @Override
    public boolean equals(Object o) {
        boolean isEqual = false;
        if (this == o) {
            isEqual = true;
        }
        else if (o != null && getClass() == o.getClass()) {
            Product product = (Product) o;
            isEqual = Double.compare(product.price, price) == 0 && name.equals(product.name) && supplier.equals(product.supplier);
        }
        return isEqual;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, supplier, price);
    }
}
