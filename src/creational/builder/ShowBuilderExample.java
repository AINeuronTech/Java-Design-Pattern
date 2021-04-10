package creational.builder;

public class ShowBuilderExample {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Jon","Smith")
                             .phone("347-678-9034")
                             .address("305 Ocean ave")
                             .build();


        User user2 = new User.UserBuilder("Kelly","Jonson")
                .age(45)
                .phone("212-324-8956")
                .address("556 Ketcham ave")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
