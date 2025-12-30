import java.util.ArrayList;
import java.util.List;

// String -> T
public class Database<T> {
  private List<T> values;

  public Database() {
    this.values = new ArrayList<>();
  }

  public boolean add(T t) {
    this.values.add(t);
  }

  public String remove(T t) {
    return this.values.remove(t);
  }

  public boolean search(T t) {
    // return this.values.contains(t);

    if (this.values.contains(t)) {
      return true;
    }
    throw new NotFoundException(SysCode.USERNAME_NOT_FOUND);
  }

  public static void main(String[] args) {
    Database<String> usernames = new Database<>();
    usernames.add("johnwong");
    usernames.add("stevechan");
    usernames.add("cherrycheung");

    try {
      usernames.search("leochan");
    } catch (BusinessRuntimeException e) {
      System.out.println(e.getMessage());
    }


  }
}
