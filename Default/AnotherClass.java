package Default;

import Default.DefaultScope.User;
import Default.DefaultScope.UserAdmin;

public class AnotherClass {
    public static void main(String[] args) {
        System.out.println("User access from a class in another package");
        User user = new User("John", "john@example.com");
        
        /* Default attributes cannot be called from a class in another package
          System.out.println(user.userName);
        */
        
        user.userMethod();
        
        /* Default methods cannot be called from a class in another package
          user.defaultUserMethod();
        */        
        
        System.out.println();
        
        System.out.println("UserAdmin access from a class in another package");
        UserAdmin admin = new UserAdmin("Admin","admin@gmail.com","root");
        
        /* Default attributes cannot be called from a class in another package
          System.out.println(admin.userName);
        */
        
        admin.userMethod();
        
        /* Default methods cannot be called from a class in another package
          admin.defaultUserMethod();
        */  
    }
}