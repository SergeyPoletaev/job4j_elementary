package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 10);
        Book book2 = new Book("Book #2", 123);
        Book book3 = new Book("Book #3", 45);
        Book book4 = new Book("Book #4", 12);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("name book is " + book.getName() + " - " + book.getNumberOfPages() + " pages");
        }
        System.out.println(System.lineSeparator());

        books[0] = book4;
        books[3] = book1;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("name book is " + book.getName() + " - " + book.getNumberOfPages() + " pages");
        }
        System.out.println(System.lineSeparator());

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean Code")) {
                System.out.println("name book is " + book.getName() + " - " + book.getNumberOfPages() + " pages");
            }
        }
    }
}
