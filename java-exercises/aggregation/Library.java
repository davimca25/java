public class Library {
    String name;
    Book[] books;

    Library (String name,  Book[] books) {
        this.name = name;
        this.books = books;
    }

    void displayInfo() {
        System.out.printf("Library name: %s",this.name);
        System.out.println("\nBooks available: ");
        for (Book book : books) {
            System.out.println("");
            System.out.println(book.displayInfo());
        }
    }


}
