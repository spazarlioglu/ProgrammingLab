package Credentials;

public class credentials {

    public  String email="oscar@cydeo.com";
    private String  userName="oscar";
    private String password="cydeo123";

    public String getUserName(String emailInput) {
        if(emailInput.equalsIgnoreCase((email))){
        return userName;}

        return "condition has NOT ben satisfied";
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword(String emailInput,String userNameInput) {
        if(emailInput.equalsIgnoreCase(email) && userNameInput.equalsIgnoreCase(userName)) {
            return password;
        }
        return "condition has NOT ben satisfied";
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
