public class Book {
    private Author author;
    private int year0fPublication;
    private String NameBook;

    public Book(String NameBook, int yearOfPublication, Author author) {
        this.author = author;
        this.year0fPublication = yearOfPublication;
        this.NameBook = NameBook;
    }

    public String getNameBook() {
        return NameBook;

    }

    public int getYear0fPublication() {
        return year0fPublication;
    }

    public void
    setYear0fPublication(int year0fPublication) {
        this.year0fPublication = year0fPublication;
    }

    public Book() {

    }

}

