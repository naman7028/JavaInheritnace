package Single;

// Superclass
class Book {
    String title;
    int publicationYear;

    // Constructor
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass
class Author extends Book {
    String name;
    String bio;

    // Constructor (super is used to call parent constructor)
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo to also show author details
    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test
public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("Java Programming", 2022, "James Gosling", "Father of Java");
        author.displayInfo();
    }
}

