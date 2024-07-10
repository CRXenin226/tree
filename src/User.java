public class User {
    String userName;
    String passWord;
    public User(String userName, String passWord) {
       this.userName = userName;
        this.passWord = passWord;
    }
    public String getUsername() {  
        return userName;  
    }  
    
    public void setUsername(String username) {  
        this.userName = username;  
    }  
    
    public String getPassword() {  
        return passWord;  
    }  
    
    public void setPassword(String password) {  
        this.passWord = password;  
    } 
}
