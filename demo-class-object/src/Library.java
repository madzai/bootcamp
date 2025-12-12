public class Library {
  // Librarian
  // Book
  // Each Library has one Librarian only
  // A Libarary has many books
  // Library -> id
  // Book -> id

  private int id;
  private Book[] books;

  public Library(int id) {
    this.id = id;
    this.books = new Book[0];
  }

  public void addBook(int id) {
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      newBooks[i] = this.books[i];
    }
    newBooks[newBooks.length - 1] = new Book(id);
    this.books = newBooks;
  }

  public void setBooks(Book[] books) {
    this.books = books;
  }

  public int getId() {
    return this.id;
  }

  public Book[] getBooks() {
    return this.books;
  }

  public Book getBook(int id) {
    if (this.books.length <= 0)
      return null;

    for (Book book : this.books) {
      if (book.getId() == id)
        return book;
    }

    return null;

  }


  public static void main(String[] args) {
    // Librarian findBook by library id and book id
    Library[] libraries = new Library[2];
    Book[] books1 = new Book[10];
    Book[] books2 = new Book[20];

    for (int i = 0; i < libraries.length; i++) {
      libraries[i] = new Library(i);
    }


  }
}
