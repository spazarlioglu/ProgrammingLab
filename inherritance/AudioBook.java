package inherritance;

public class AudioBook extends Book{

    int lengthOfRecording;
    String narrator;

    public AudioBook(String title, String type, String author, double price, int lengthOfRecording, String narrator) {
        super(title, type, author, price);
        this.lengthOfRecording = lengthOfRecording;
        this.narrator = narrator;
    }

    public AudioBook() {
        super();
    }

    public void listen(){
        System.out.println("listening audio book");
        System.out.println("title = " + title);
    }
}
