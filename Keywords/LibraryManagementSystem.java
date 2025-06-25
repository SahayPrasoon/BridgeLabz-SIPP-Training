public class LibraryManagementSystem {

    static class Book {
       
        static String libraryName = "City Central Library";
      
        public static void displayLibraryName() {
            System.out.println("Library Name: " + libraryName);
        }
       
        private final String isbn;
        
        private String title;
        private String author;
       
        public Book(String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
        }
        
        public void displayBookDetails() {
            if (this instanceof Book) {
                System.out.println("ISBN: " + isbn);
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
            } else {
                System.out.println("Invalid book object.");
            }
        }
    }

   
    public static void main(String[] args) {
        
        Book.displayLibraryName();
        System.out.println();
        
        Book book1 = new Book("ISBN001", "The Alchemist", "Paulo Coelho");
        Book book2 = new Book("ISBN002", "1984", "George Orwell");
        
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
    }
}
