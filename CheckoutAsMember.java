public class CheckoutAsMember extends Checkout {
    public CheckoutAsMember(User user) {
        super(products, user);
    }

    @Override
    public void addItemsToCart(Product product) {
        double discountedPrice = user.applyDiscount(product);
        super.TodayProducts.put(product.getName(), discountedPrice);
    }

    @Override
    public void printCart() {
        super.printCart();
        double totalSaved = 0.0;
        for (String productName : super.TodayProducts.keySet()) {
            double originalPrice = Checkout.getOriginalPrice(productName);
            double discountedPrice = super.TodayProducts.get(productName);
            totalSaved += originalPrice - discountedPrice;
        }
    }
        System.out.println("You saved $" + totalSaved + " by being a member.");
        System.out.println("Thanks for your loyalty!");
        }
    }