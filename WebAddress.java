import java.util.Scanner;

public class WebAddress {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a valid website");
        String adress=scan.nextLine();

        if (adress.startsWith("www.") && adress.endsWith(".com") || adress.endsWith(".edu") || adress.endsWith(".gov")) {
            System.out.println("Valid");
        } else System.out.println("Invalid");
    }
}

