public class Book {
  public static int idCount = 0;

  private int id;
  // private String title;

  public Book() {
    this.id = ++Book.idCount;
    // this.title = title;
  }

  public int getId() {
    return this.id;
  }

}
