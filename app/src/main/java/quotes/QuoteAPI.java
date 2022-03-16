package quotes;

public class QuoteAPI {
    protected String author;
    protected String likes;
    protected String text;

    public QuoteAPI(String author, String likes, String text) {
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    @Override
    public String toString() {
        return "QuoteAPI{" +
                "author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
