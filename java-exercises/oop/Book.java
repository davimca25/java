public class Book {

    private String title;
    private int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String displayInfo(String author) {
        return this.title + (", Pages: ") + this.pages + (", Author: ") + author;
    }
}
