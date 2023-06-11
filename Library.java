import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager libraryManager = new LibraryManager();

        while (true) {
            displayMenu(); // Display the menu options
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Validate the choice
            while (choice < 0 || choice > 6) {
                System.out.println("Invalid Choice");
                System.out.print("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            }

            if (choice == 0) {
                return; // Exit the program
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    String book1 = scanner.nextLine();
                    libraryManager.addBook(book1); // Add a book to the library
                    break;

                case 2:
                    System.out.print("Enter Book Name: ");
                    String book2 = scanner.nextLine();
                    libraryManager.issueBook(book2); // Issue a book from the library
                    break;

                case 3:
                    System.out.print("Enter Book Name: ");
                    String book3 = scanner.nextLine();
                    libraryManager.returnBook(book3); // Return a book to the library
                    break;

                case 4:
                    libraryManager.showAvailableBooks(); // Display available books in the library
                    break;

                case 5:
                    libraryManager.showIssuedBooks(); // Display issued books from the library
                    break;

                case 6:
                    libraryManager.showTotalAddedBooks(); // Display the history of added books
                    break;
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\n1: Add Book");
        System.out.println("2: Issue Book");
        System.out.println("3: Return Book");
        System.out.println("4: Show Available Books");
        System.out.println("5: Show Issued Books");
        System.out.println("6: Show Total Added Books");
        System.out.println("0: Exit");
        System.out.print("Enter Choice: ");
    }
}

class LibraryManager {
    ArrayList<String> availableBooks = new ArrayList<>(); // To store Available Books
    ArrayList<String> issuedBooks = new ArrayList<>(); // To store Issued Books
    ArrayList<String> bookHistory = new ArrayList<>(); //  To store the total Added Books

    // Adding Book
    public void addBook(String bookName) {
        availableBooks.add(bookName); // Add book to the available books list
        bookHistory.add(bookName); // Add book to the history of added books

        int index = availableBooks.indexOf(bookName);

        if (index != -1) {
            System.out.println("\nSuccessfully Added Book");
        } else {
            System.out.println("!! ERROR !!");
        }
    }

    // Issue Book
    public void issueBook(String bookName) {
        int index = availableBooks.indexOf(bookName);

        if (index != -1) {
            availableBooks.remove(bookName); // Remove the book from the available books list
            System.out.println("\nSuccessfully Issued Book");
            issuedBooks.add(bookName); // Add the book to the issued books list
            System.out.println("Issued Books: " + issuedBooks);
        } else {
            System.out.println("\n                   !! ERROR !!\nThe book you are trying to issue is not in stock");
        }
    }

    // Return Book
    public void returnBook(String bookName) {
        int index = issuedBooks.indexOf(bookName);

        if (index != -1) {
            availableBooks.add(bookName); // Add the book to the available books list
            System.out.println("\nSuccessfully Returned Book");
            issuedBooks.remove(bookName); // Remove the book from the issued books list
            System.out.println("Issued Books: " + issuedBooks + "\n");
        } else {
            System.out.println("\n                 !! ERROR !!\nThe book you are trying to return is not issued");
        }
    }

    // Show Available books
    public void showAvailableBooks() {
        int size = availableBooks.size();

        if (size > 0) {
            System.out.println("\nAvailable Books: " + availableBooks + "\n");
        } else {
            System.out.println("Currently, there are no available books. Please add books first.");
        }
    }

    // Show Issued books
    public void showIssuedBooks() {
        int size = issuedBooks.size();

        if (size > 0) {
            System.out.println("Issued Books: " + issuedBooks + "\n");
        } else {
            System.out.println("Currently, there are no issued books.");
        }
    }

    // Show Total added books
    public void showTotalAddedBooks() {
        int size = bookHistory.size();

        if (size > 0) {
            System.out.println("History of Added Books: " + bookHistory + "\n");
        } else {
            System.out.println("Currently, no books have been added.");
        }
    }
}
