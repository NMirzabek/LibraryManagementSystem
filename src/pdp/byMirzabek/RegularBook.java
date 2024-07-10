package pdp.byMirzabek;

public class RegularBook extends Book{
    private boolean isBorrowed;

    public RegularBook(String title, String author, String ISBN) {
        super(title, author, ISBN);
        this.isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("The book has been borrowed.");
        } else {
            System.out.println("The book is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("The book has been returned.");
        } else {
            System.out.println("The book was not borrowed.");
        }
    }


    public String toString() {
        return super.toString() + ", isBorrowed=" + isBorrowed;
    }
}
