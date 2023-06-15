package Protected.ProtectedScope;

public class User
{
    protected String userName;
    protected String email;
       
    public User(String userName, String email)
    {
       this.userName = userName;
       this.email = email;
    } 
    
    public void userMethod(){
        System.out.println("New protected method called with a public method by user: "+this.userName+", with email: "+this.email);
    }
    
    protected void protectedUserMethod(){
        System.out.println("New protected method by user: "+this.userName+", with email: "+this.email);
    }
    
    public String getUserName(){
        return this.userName;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}