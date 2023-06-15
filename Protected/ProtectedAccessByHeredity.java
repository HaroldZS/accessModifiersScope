package Protected;

import Protected.ProtectedScope.User;

public class ProtectedAccessByHeredity
{
    // acceso protegido a través de la herencia
    
    public static void main(String[] args) {
        System.out.println("SubClassUser access from a class in another package");
        SubClassUser subClassUser = new SubClassUser("John", "john@example.com","Attribute");
        
        /* Protected attributes cannot be called from a class in another package
          System.out.println(subClassUser.userName);
        */
        
        subClassUser.userMethod();
        
        /* Protected methods cannot be called from a class in another package
          subClassUser.protectedUserMethod();
        */
    }
}
