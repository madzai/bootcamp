public class Librarian {
  public static int idCount = 0;

  private int staffId;
  private Library library;

  public Librarian() {
    this.staffId = ++Librarian.idCount;
  }

  public int getStaffId() {
    return this.staffId;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  // Instance method -> this (self)
  public Book findBook(int bookId) {
    if (this.library == null)
      return null;
    return this.library.searchBook(bookId);
  }

  public static void main(String[] args) {
    // new Librarian().getLibrary().getBooks()
    Librarian lb1 = new Librarian();
    System.out.println(lb1.getStaffId());

    Librarian lb2 = new Librarian();
    System.out.println(lb2.getStaffId());

    Library library = new Library();
    System.out.println(library.getId());
    lb2.setLibrary(library);
  }

}
