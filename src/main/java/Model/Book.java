package Model;

public class Book {

//book_id, title, author, category, published_year, quantity
    private String book_id;
    private String title;
    private String author;
    private String category;
    private int published_year;
    private int quantity;

    public Book(String book_id, String title, String author, String category, int published_year, int quantity) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.published_year = published_year;
        this.quantity = quantity;
    }

    public Book() {
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id='" + book_id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", published_year=" + published_year +
                ", quantity=" + quantity +
                '}';
    }
}
