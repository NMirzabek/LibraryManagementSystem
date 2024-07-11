package pdp.byMirzabek;

public class ReferenceBook extends Book{
    public ReferenceBook(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }
    public boolean borrowBook() {
        System.out.println("Reference book cannot be borrowed!");
        return false;
    }

}
