package Task_3.Management_System;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book\n2. Replace Book\n3. Display Books\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book ID, Title, Author:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String title = sc.nextLine();
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.println("Enter Book ID to replace:");
                    int replaceId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter New Title and Author:");
                    String newTitle = sc.nextLine();
                    String newAuthor = sc.nextLine();
                    library.replaceBook(replaceId, newTitle, newAuthor);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
