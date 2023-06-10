import java.util.ArrayList;
import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lib book = new Lib();
        while (true) {
            choices();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            while (choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4) {
                System.out.println("Invalid Choice");
                System.out.print("Choice: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            }

            if (choice == 0) {
                return;
            }



            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    String book1 = scanner.nextLine();
                    book.addBook(book1);
                    break;

                case 2:
                    System.out.print("Enter Book Name: ");
                    String book2 = scanner.nextLine();
                    book.issueBook(book2);
                    break;

                case 3:
                    System.out.print("Enter Book Name: ");
                    String book3 = scanner.nextLine();
                    book.returnBook(book3);
                    break;

                case 4:
                    book.showBook();
                    break;
            }
        }
    }

    public static void choices() {
        System.out.println("\n1: Add Book");
        System.out.println("2: Issue Book");
        System.out.println("3: Return Book");
        System.out.println("4: Show Available Book");
        System.out.println("0: Exit | Stop");
        System.out.print("Enter Choice: ");
    }
}

class Lib {
    ArrayList<String> strings = new ArrayList<>();
    ArrayList<String> backup = new ArrayList<>();

    // Adding Book
    public void addBook(String bookname) {
        strings.add(bookname); // Add book to the ArrayList

        int index = strings.indexOf(bookname);

        if (index != -1) {
            System.out.println("\nSuccessfully Added Book");
        } else {
            System.out.println("!! ERROR !!");
        }
    }

    // Issue Book
    public void issueBook(String bookname) {
        int index = strings.indexOf(bookname);

        if (index != -1) {
            strings.remove(bookname);
            System.out.println("\nSuccessfully Issue Book");
            backup.add(bookname);
            System.out.println("Issued Book: " + backup);
        } else {
            System.out.println("\n                   !! ERROR !!\nThe book you are trying to issue is not in stock");
        }
    }

    // Return Book
    public void returnBook(String bookname) {
        int index = backup.indexOf(bookname);

        if (index != -1) {
            strings.add(bookname); // Add book to the ArrayList
            System.out.println("\nSuccessfully Return");
            backup.remove(bookname);
            System.out.println("Issued Book: " + backup + "\n");
        } else {
            System.out.println("\n                 !! ERROR !!\nThe book you are trying to return is not issued");
        }
    }

    // Show Available book
    public void showBook() {
        int size = strings.size();

        if (size != -1) {
            System.out.println("\nAvailable Books: " + strings + "\n");
        } else {
            System.out.println("Currently you don't have books\nAdd books first");
        }
    }
}
