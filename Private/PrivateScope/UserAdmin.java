package Private.PrivateScope;

public class UserAdmin extends User
{
    private String password;
    
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
    /* Private methods cannot be called by a subClass
      public void testPrivateMethodCallBySubClass(){
         this.privateUserMethod();
      }
    */
}