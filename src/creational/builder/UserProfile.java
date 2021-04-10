package creational.builder;

public class UserProfile {
    public String firstName;
    public String lastName;
    public int age;
    public String phone;
    public String address;

    public UserProfile(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public UserProfile(String firstName, String lastName, int age, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }
    public UserProfile(String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public static void main(String[] args) {
        UserProfile userProfile1 = new UserProfile("Dave","Boby",35);
        UserProfile userProfile2 = new UserProfile("Dave","Boby",35,"347-432-9078");
        UserProfile userProfile3 = new UserProfile("Dave","Boby",35,"212-324-5678","123 Oscar ave");
    }

}
