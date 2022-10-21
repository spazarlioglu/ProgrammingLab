package inherritance;

public class Ebook extends Book{

    int sizeAtMemory;
    int pages;

    public Ebook(String title, String type, String author, double price, int sizeAtMemory, int pages) {
        super(title, type, author, price);
        this.sizeAtMemory = sizeAtMemory;
        this.pages = pages;
    }

    public Ebook() {
     super();
    }

    public void readBook(){
        System.out.println("reading the book from my tablet");
        System.out.println("title :"+title);
        System.out.println("author :"+author);
        System.out.println("type = " + type);
        System.out.println("price = " + price);
        System.out.println("sizeAtMemory = " + sizeAtMemory);
        System.out.println("pages = " + pages);
    }
}
