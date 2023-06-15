package Private.PrivateScope;

public class User
{
    private String userName;
    private String email;
       
    public User(String userName, String email)
    {
       this.userName = userName;
       this.email = email;
    } 
    
    public void userMethod(){
        // Private can ba called by the same class 
        this.privateUserMethod();
    }
    
    private void privateUserMethod(){
        System.out.println("New public method that calls a private method by user: "+this.userName+", with email: "+this.email);
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