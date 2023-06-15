package Private.PrivateScope;

public class Main
{
    public static void main(String[] args){
        User user = new User("Harold","harold@gmail.com");
        user.userMethod();
        
        /* Privat methods cannot be used by other class
          user.PrivateUserMethod();
        */
        
        System.out.println();
        
        /* Privat attributes cannot be used directly by other class
          System.out.println("Get username without get method: "+ user.userName);
          System.out.println("Get email without get method: "+ user.email);
        */
       
        
        System.out.println("Get username with public get method: "+ user.getUserName());
        System.out.println("Get email with public get method: "+ user.getEmail());
        
        System.out.println();
        
        /* Privat attributes cannot be changed directly by other class
          user.userName = "Zurita";
          user.email = "zurita@gmail.com";
        */
        
        user.setUserName("Simon");
        user.setEmail("simon@gmail.com");
        
        System.out.println("Get username (after change with public set method) with public get method: "+ user.getUserName());
        System.out.println("Get email (after change with public set method) with public get method: "+ user.getEmail());
        
        System.out.println();
        
        UserAdmin admin = new UserAdmin("Admin","Admin@gmail.com","root");
        
        /* Privat attributes cannot be used directly by other class
          System.out.println("Get username without get method: "+ admin.userName);
          System.out.println("Get email without get method: "+ admin.email);
          System.out.println("Get password without get method: "+ admin.password);
        */
        
        System.out.println("Get username with public get method: "+ admin.getUserName());
        System.out.println("Get email with public get method: "+ admin.getEmail());
        System.out.println("Get password without public get method: "+ admin.getPassword());
        
        System.out.println();
        
        /* Privat attributes cannot be changed directly by other class
          admin.userName = "root";
          admin.email = "root@gmail.com";
          admin.password = "Admin";
        */
        
        admin.setUserName("superUser");
        admin.setEmail("superuser@gmail.com");
        admin.setPassword("super");
        
        
        System.out.println("Get username (after change with public set method) with public get method: "+ admin.getUserName());
        System.out.println("Get email (after change with public set method) with public get method: "+ admin.getEmail());
        System.out.println("Get password (after change with public set method) public without get method: "+ admin.getPassword());
    }
}