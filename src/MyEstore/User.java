package MyEstore;

public class User extends Estore {
    private int age;
    private String email;
    private String homeAddress;

    public User(String userName, String password, int age, String email, String homeAddress) {
        super(userName, password);
        this.age = age;
        this.email = email;
        this.homeAddress = homeAddress;

    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
}
