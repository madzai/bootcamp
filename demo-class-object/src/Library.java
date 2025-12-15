public class Library {
  // Librarian
  // Book
  // Each Library has one Librarian only
  // A Libarary has many books
  // Library -> id
  // Book -> id
  public static int idCount = 0;

  private int id;
  private Book[] books;

  public Library() {
    this.id = ++Library.idCount;
    this.books = new Book[0];
  }

  public int getId() {
    return this.id;
  }

  // setLibrarian - strange
  // public void setLibrarian(Librarian librarian) {
  // librarian.setLibrary(this);
  // }

  public void addBook(int id) {
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      newBooks[i] = this.books[i];
    }
    newBooks[newBooks.length - 1] = new Book();
    this.books = newBooks;
  }

  // public void setBooks(Book[] books) {
  // this.books = books;
  // }

  public Book[] getBooks() {
    return this.books;
  }

  public Book searchBook(int bookId) {
    for (Book book : this.getBooks()) {
      if (book.getId() == bookId)
        return book;
    }
    return null;
  }

  // public Book getBook(int id) {
  // if (this.books.length <= 0)
  // return null;

  // for (Book book : this.books) {
  // if (book.getId() == id)
  // return book;
  // }

  // return null;

  // }


  // public static void main(String[] args) {
  // // Librarian findBook by library id and book id
  // Library[] libraries = new Library[2];
  // Book[] books1 = new Book[10];
  // Book[] books2 = new Book[20];

  // for (int i = 0; i < libraries.length; i++) {
  // libraries[i] = new Library(i);
  // }


  // }
}
