package Public;

import Public.PublicScope.User;
import Public.PublicScope.UserAdmin;

public class AnotherClass {
    public static void main(String[] args) {
        System.out.println("User access from a class in another package");
        User user = new User("John", "john@example.com");
        System.out.println(user.userName);
        user.userMethod();
        
        System.out.println();
        
        System.out.println("UserAdmin access from a class in another package");
        UserAdmin admin = new UserAdmin("Admin","admin@gmail.com","root");
        System.out.println(admin.userName);
        admin.userMethod();
    }
}