package Credentials;

public class Login {
    public static void main(String[] args) {

        credentials user=new credentials();

        System.out.println("user.email = "+ user.email);

        System.out.println("user.userName = "+user.getUserName("oscar@cydeo.com"));

        System.out.println("user.password = "+user.getPassword("oscar@cydeo.com",user.getUserName("oscar@cydeo.com")));

        user.setUserName("Süleyman");
        user.setPassword("Suleyman123");

        System.out.println(user.getUserName("oscar@cydeo.com"));
        System.out.println(user.getPassword("oscar@cydeo.com","Süleyman"));



    }
}
