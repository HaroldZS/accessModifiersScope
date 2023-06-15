package Public.PublicScope;

public class UserAdmin extends User
{
    public String password;
    
    public UserAdmin(String userName, String email,String password)
    {
        super(userName,email);
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}