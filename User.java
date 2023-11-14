public class User {
    private String username;
    private String password;
    private String email;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private boolean isDOBSet;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isDOBSet = false;
    }

    public User(String username, String password, String email, int birthYear, int birthMonth, int birthDay) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.isDOBSet = true;
    }

    public boolean isBirthday(int year, int month, int day) {
        return isDOBSet && this.birthYear == year && this.birthMonth == month && this.birthDay == day;
    }
}
