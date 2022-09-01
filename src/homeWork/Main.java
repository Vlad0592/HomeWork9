package homeWork;

import homeWork.Author;
import homeWork.Book;


public class Main {


    public static void main(String[] args) {


        //First homeWork.Book()

        Author author = new Author("L.N.", "Tolstoy");
        Book book = new Book("War and peace", 1867, author);
        String authorfirstName = author.getFirstName();
        String authorsecondName = author.getSecondName();
        //String NameBook = book.getNameBook();
        book.setYear0fPublication(1867);



        System.out.println(author);
        System.out.println(book);

        System.out.println();
        System.out.println("Книга 2");

        //Second homeWork.Book()

        Author authorBook2 = new Author("Viktor", " " + "Hugo");
        Book book2 = new Book("Outcast", 1862, author);

        System.out.println(authorBook2);
        System.out.println(book2);


        System.out.println();

        book2.setYear0fPublication(2000);
        //System.out.println("Год издания измененный- " + book2.getYear0fPublication());

    }


}

