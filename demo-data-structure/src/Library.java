import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
  private static int bookIdCount = 0;
  // BookType -> a list of books
  // Book Id -> Book
  private Map<Integer, Book> bookMap1;
  private Map<BookType, List<Book>> bookMap2;

  public Library() {
    this.bookMap1 = new HashMap<>(); // ! if not typed -> null-pointer exceptino
    this.bookMap2 = new HashMap<>(); // !
  }

  public void add(BookType bookType, Book book) {
    int bookId = ++bookIdCount;
    book.setId(bookId);

    // List<Book> bookList = this.bookMap2.get(bookType);
    List<Book> bookList =
        this.bookMap2.getOrDefault(bookType, new ArrayList<>());
    bookList.add(book); // ! bug if no Book list for the BookType e.g. 1st book entry for the type
    this.bookMap2.put(bookType, bookList);

    bookMap1.put(bookId, book);
  }

  public Book search(int bookId) {
    return this.bookMap1.get(bookId);
  }

  public List<Book> search(BookType booktype) {
    return this.bookMap2.get(booktype);
  }

  @Override
  public String toString() {
    return "Book(" //
        + "id=" + this.id //
        + ",name=" + this.name //
        + ")";
  }

  public static enum BookType {
    FICTION, HISTORY, FINANCE, SPORTS
  }

  public static class Book {
    private Integer id;
    private String name;

    public Book(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public int getId() {
      return this.id;
    }

    public void setId(int id) {
      this.id = id;
    }
  }

  public static void main(String[] args) {
    Library l1 = new Library();
    l1.add(BookType.HISTORY, new Book("Abc"));
    l1.add(BookType.HISTORY, new Book("xyz"));
    l1.add(BookType.SPORTS, new Book("football"));
    l1.add(BookType.FINANCE, new Book("Stock market"));

    System.out.println(l1.search(BookType.HISTORY));
    System.out.println(l1.search(BookType.SPORTS));
  }
}
