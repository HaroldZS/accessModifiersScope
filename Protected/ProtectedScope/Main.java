package Protected.ProtectedScope;

public class Main
{
    public static void main(String[] args){
        User user = new User("Harold","harold@gmail.com");
        user.userMethod();
        user.protectedUserMethod();
        
        System.out.println();
        
        System.out.println("Get username without get method: "+ user.userName);
        System.out.println("Get email without get method: "+ user.email);
        
        System.out.println();
        
        System.out.println("Get username with get method: "+ user.getUserName());
        System.out.println("Get email with get method: "+ user.getEmail());
        
        System.out.println();
        
        user.userName = "Zurita";
        user.email = "zurita@gmail.com";
        
        System.out.println("Get username (after change without set method) without get method: "+ user.userName);
        System.out.println("Get email (after change without set method) without get method: "+ user.email);
        
        System.out.println();
        
        System.out.println("Get username (after change without set method) with get method: "+ user.getUserName());
        System.out.println("Get email (after change without set method) with get method: "+ user.getEmail());

        System.out.println();
        
        user.setUserName("Simon");
        user.setEmail("simon@gmail.com");
        
        System.out.println("Get username (after change with set method) without get method: "+ user.userName);
        System.out.println("Get email (after change with set method) without get method: "+ user.email);

        System.out.println();
        
        System.out.println("Get username (after change with set method) with get method: "+ user.getUserName());
        System.out.println("Get email (after change with set method) with get method: "+ user.getEmail());
        
        System.out.println();
        
        UserAdmin admin = new UserAdmin("Admin","Admin@gmail.com","root");
        
        System.out.println("Get username without get method: "+ admin.userName);
        System.out.println("Get email without get method: "+ admin.email);
        System.out.println("Get password without get method: "+ admin.password);
        
        System.out.println();
        
        System.out.println("Get username with get method: "+ admin.getUserName());
        System.out.println("Get email with get method: "+ admin.getEmail());
        System.out.println("Get password without get method: "+ admin.getPassword());
        
        System.out.println();
        
        admin.userName = "root";
        admin.email = "root@gmail.com";
        admin.password = "Admin";
        
        System.out.println("Get username (after change without set method) without get method: "+ admin.userName);
        System.out.println("Get email (after change without set method) without get method: "+ admin.email);
        System.out.println("Get password (after change without set method) without get method: "+ admin.password);
        
        System.out.println();
        
        System.out.println("Get username (after change without set method) with get method: "+ admin.getUserName());
        System.out.println("Get email (after change without set method) with get method: "+ admin.getEmail());
        System.out.println("Get password (after change without set method) without get method: "+ admin.getPassword());
        
        System.out.println();
        
        admin.setUserName("superUser");
        admin.setEmail("superuser@gmail.com");
        admin.setPassword("super");
        
        System.out.println("Get username (after change with set method) without get method: "+ admin.userName);
        System.out.println("Get email (after change with set method) without get method: "+ admin.email);
        System.out.println("Get password (after change with set method) without get method: "+ admin.password);
        
        System.out.println();
        
        System.out.println("Get username (after change with set method) with get method: "+ admin.getUserName());
        System.out.println("Get email (after change with set method) with get method: "+ admin.getEmail());
        System.out.println("Get password (after change with set method) without get method: "+ admin.getPassword());
    }
}