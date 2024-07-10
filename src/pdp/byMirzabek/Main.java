package pdp.byMirzabek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();


        while (true) {
            System.out.println("Choose one of the options");
            System.out.println("1) Add a Book (Regular and Reference Book), 2) View All Books, 3) Borrow a Book, 4) Return a Book, 5) Exit: ");

            int userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case 1:
                    Book book = new Book();
                    System.out.println("Enter book type (regular/reference): ");
                    String type = scanner.nextLine().trim().toLowerCase();

                    System.out.println("Please enter title of the book");
                    String title = scanner.nextLine();
                    book.setTitle(title);

                    System.out.println("Please enter author name of the book");
                    String author = scanner.nextLine();
                    book.setAuthor(author);

                    System.out.println("Please enter an ISBN of the book");
                    String ISBN = scanner.nextLine();
                    book.setISBN(ISBN);

                    if (type.equals("regular")) {
                        library.addBook(new RegularBook(title, author, ISBN));
                    } else if(type.equals("reference")) {
                        library.addBook(new ReferenceBook(title, author, ISBN));
                    }else {
                        System.out.println("Invalid book type");
                    }
                    break;
                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.println("Enter ISBN of the book to borrow");
                    String borrowISBN = scanner.nextLine();
                    library.borrowBook(borrowISBN);
                    break;

                case 4:
                    System.out.println("Enter the ISBN of the book to return");
                    String returnISBN = scanner.nextLine();
                    library.returnBook(returnISBN);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}