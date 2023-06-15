package Public.PublicScope;

public class User
{
    public String userName;
    public String email;
       
    public User(String userName, String email)
    {
       this.userName = userName;
       this.email = email;
    } 
    
    public void userMethod(){
        System.out.println("New public method by user: "+this.userName+", with email: "+this.email);
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