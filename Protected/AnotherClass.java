package Protected;

import Protected.ProtectedScope.User;
import Protected.ProtectedScope.UserAdmin;

public class AnotherClass {
    public static void main(String[] args) {
        System.out.println("User access from a class in another package");
        User user = new User("John", "john@example.com");
        
        /* Protected attributes cannot be called from a class in another package
          System.out.println(user.userName);
        */
       
        user.userMethod();
        
        /* Protected methods cannot be called from a class in another package
        user.protectedUserMethod();
        */
        
        System.out.println();
        
        System.out.println("UserAdmin access from a class in another package");
        UserAdmin admin = new UserAdmin("Admin","admin@gmail.com","root");
        
        /* Protected attributes cannot be called from a class in another package
          System.out.println(admin.userName);
        */
       
        admin.userMethod();
        
        /* Protected methods cannot be called from a class in another package
          Admin.protectedUserMethod();
        */
    }
}