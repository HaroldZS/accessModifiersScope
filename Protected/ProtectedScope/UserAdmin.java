package Protected.ProtectedScope;

public class UserAdmin extends User
{
    protected String password;
    
    public UserAdmin(String userName, String email,String password)
    {
        super(userName,email);
        this.password = password;
    }
    
    public void changeUserNamebysuClass(){
        System.out.println(this.userName);
        this.userName = "Hola";
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void testPrivateMethodCallBySubClass(){
        this.protectedUserMethod();
    }
}