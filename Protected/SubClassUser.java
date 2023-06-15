package Protected;

import Protected.ProtectedScope.User;

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
    
    public void changeUserNamebysuClass(){
        // Protected attributes can be called by extended classes from other package
        System.out.println(this.userName);
        this.userName = "Hola";
    }
    
    public void testPrivateMethodCallBySubClass(){
        // Protected methods can be called by extended classes from other package
        this.protectedUserMethod();
    }
}