package creational.builder;

public class User {
    public String firstName;
    public String lastName;
    public int age;
    public String phone;
    public String address;

    public User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString(){
        return "User: " + this.firstName+" "+this.lastName+" "+this.age+" "+this.phone+" "+this.address;
    }

    public static class UserBuilder{
        public String firstName;
        public String lastName;
        public int age;
        public String phone;
        public String address;

        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public UserBuilder age(int age){
          this.age = age;
          return this;
        }
        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        public User build(){
            User user = new User(this);
            return user;
        }
    }

}
