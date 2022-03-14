package quotes;
// create a class
public class Recentquotes {

    // declare properities
    private String author;
    private String text;

//    private String author;
//    private String text;

    // create constructor
    public Recentquotes(String author, String text) {
        this.author = author;
        this.text = text;
    }


//    public Recentquotes(String author, String text) {
//        this.author = author;
//        this.text = text;
//    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    // ToString method
    @Override
    public String toString() {
        return "Recentquotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

}
