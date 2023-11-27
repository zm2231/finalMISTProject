public class User {
    private String username;
    private String password;
    private String email;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private boolean isDOBSet;
    private boolean isMember;

    public User(String username, String password, String email, boolean isMember) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isDOBSet = false;
        this.isMember = isMember;
    }

    public User(String username, String password, String email, boolean isMember, int birthYear, int birthMonth, int birthDay) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.isDOBSet = true;
        this.isMember = isMember;
    }

    public boolean isBirthday(int month, int day) {
        return isDOBSet && this.birthMonth == month && this.birthDay == day;
    }

    public double applyDiscount(Product product) {
        double discount = 0.0;
        int currentMonth = 5;
        int currentDay = 15;

        if (this.isMember) {
            discount += 0.10;
        }
        if (isBirthday(currentYear, currentMonth, currentDay)) {
            discount += 0.05;
        }
        return product.getPrice() * (1 - discount);
    }

    public boolean isMember() {
        return isMember;
    }

    public void addMembership() {
        this.isMember = true;
    }

    public void removeMembership() {
        this.isMember = false;
    }


}
