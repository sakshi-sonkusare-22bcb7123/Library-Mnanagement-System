import java.util.ArrayList;
//importing Collection ArrayList

import java.util.Scanner;
//taking user input

public class LibraryManagementSystem {

    //Library Book 
    //title, auther, isIssued    
    static class Book {
        private String title;
        private String author;
        private boolean isIssued;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.isIssued = false;
        }

        public String getTitle() {
            return title;
        }

        public boolean isIssued() {
            return isIssued;
        }

        public void issue() {
            isIssued = true;
        }

        public void returnBook() {
            isIssued = false;
        }

        @Override
        public String toString() {
            return title + " by " + author + (isIssued ? " (Issued)" : " (Available)");
        }
        //book is issued or Available.
    }

    //Library User
    //name, userId 
    static class User {
        private String name;
        private int userId;

        public User(String name, int userId) {
            this.name = name;
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public int getUserId() {
            return userId;
        }

        @Override
        public String toString() {
            return "User: " + name + " (ID: " + userId + ")";
        }
        //books in the Database.
    }

    //Library Management
    //which book with which user (Issued)
    //which book in the database (Available)
    static class Library {
        private ArrayList<Book> books = new ArrayList<>();
        private ArrayList<User> users = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
            System.out.println("Added: " + book);
        }

        public void addUser(User user) {
            users.add(user);
            System.out.println("User registered: " + user);
        }

        public void issueBook(String title, int userId) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                    book.issue();
                    System.out.println("Book issued to user ID " + userId + ": " + book);
                    return;
                }
            }
            System.out.println("Book not available or already issued.");
        }

        public void returnBook(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned: " + book);
                    return;
                }
            }
            System.out.println("Book not found or already returned.");
        }

        public void displayBooks() {
            System.out.println("\nAvailable Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }

        public void displayUsers() {
            System.out.println("\nRegistered Users:");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    //Main method 
    public static void main(String[] args) {
        Library library = new Library();

        //Sample data
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));
        library.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt and David Thomas"));
        library.addBook(new Book("Introduction to Algorithms","Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein"));
        library.addBook(new Book("Cracking The Coding Interview","Gayle Laakmann McDowell"));
        library.addBook(new Book("The Soul of a New Machine","Tracy Kidder"));
        library.addBook(new Book("Deep learning with Python","Francois Chollet"));
        library.addBook(new Book("The Mythical Man-Month","Fred Brooks"));
        library.addBook(new Book("Structure and Interpretation of Computer Programs","Harold Abelson and Gerald Jay Sussman with Julie Sussman"));
        library.addUser(new User("Sakshi", 1));
        library.addUser(new User("Vaibhav", 2));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-----Library Menu-----");
            System.out.println("1. Display Books");
            System.out.println("2. Display Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    library.displayUsers();
                    break;
                case 3:
                    System.out.print("Enter book title to issue: ");
                    String titleToIssue = sc.nextLine();
                    System.out.print("Enter your user ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    library.issueBook(titleToIssue, userId);
                    break;
                case 4:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = sc.nextLine();
                    library.returnBook(titleToReturn);
                    break;
                case 5:
                    System.out.println("Thankyou for using Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
