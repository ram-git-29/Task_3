package Task_3.Management_System;

public class Library {
    private Book[] books;
    private int count = 0;

    public Library() {
        books = new Book[5]; // fixed-size array
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full.");
        }
    }

    public void replaceBook(int bookID, String newTitle, String newAuthor) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = new Book(bookID, newTitle, newAuthor);
                System.out.println("Book replaced.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}

