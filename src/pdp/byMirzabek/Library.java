package pdp.byMirzabek;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        this.books = new Book[100];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        books[bookCount] = book;
        bookCount++;
        System.out.println("Book is added successfully");
    }

    public void viewBooks() {
        if (bookCount == 0){
            System.out.println("The library has no books!");
        } else {
            for (int i = 0; i < bookCount; i++){
                System.out.println(books[i].getISBN());
            }
        }
    }

    public void borrowBook(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                if (books[i] instanceof RegularBook) {
                    ((RegularBook) books[i]).borrowBook();
                    return;
                } else if (books[i] instanceof ReferenceBook) {
                    ((ReferenceBook) books[i]).borrowBook();
                }
            }
        }
    }

    public void returnBook(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(ISBN)) {
                if (books[i] instanceof RegularBook) {
                    ((RegularBook) books[i]).returnBook();
                    return;
                } else if(books[i] instanceof ReferenceBook) {
                    System.out.println("Book not found or it is not a regular book.");
                }
            }
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}
