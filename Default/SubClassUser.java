package Default;

import Default.DefaultScope.User;

public class SubClassUser extends User
{
    protected String attribute;
    
    public SubClassUser(String userName, String email,String attribute)
    {
        super(userName,email);
        this.attribute = attribute;
    }
    
    public String getAttribute(){
        return this.attribute;
    }
    
    public void setAttribute(){
        this.attribute = attribute;
    }
    
    /* Default attributes cannot be called by extended classes from other package
      public void changeUserNamebysuClass(){
          System.out.println(this.userName);
          this.userName = "Hola";
      }
    */
    
    /* Default methods cannot be called by extended classes from other package
      public void testPrivateMethodCallBySubClass(){
          this.defaultUserMethod();
      }
    */
}