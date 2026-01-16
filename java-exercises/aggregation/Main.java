public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Think and grow rich", 400);
        Book book2 = new Book("Outwitting the Devil", 300);

        Book[] books = {book1, book2};
        Library library = new Library("Livraria da Travessa", books);

        library.displayInfo();

    }
}