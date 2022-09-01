package homeWork;

import java.util.Objects;

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

    //public int getYear0fPublication() {
    //    return year0fPublication;
   // }

    public void
    setYear0fPublication(int year0fPublication) {
        this.year0fPublication = year0fPublication;
    }




    @Override
    public String toString() {
        return
                NameBook + " " +  year0fPublication;



    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year0fPublication == book.year0fPublication && author.equals(book.author) && NameBook.equals(book.NameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, year0fPublication, NameBook);
    }
}

