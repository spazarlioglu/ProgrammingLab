package inherritance;

public class Book {
    String title,type,author;
    double price;

    public Book(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public Book(){
    }

    public void buy(String store){
        System.out.println("Buying it from :"+store);
    }

    public void borrow(String source){
        System.out.println("Borrowing it from :"+source);
    }

    public void lend(String user){
        System.out.println("Borrowing it from :"+user);
    }




}
