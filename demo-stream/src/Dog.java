import java.util.Optional;

// College -> c1.getStudents
// Student -> s1.getCollege

// Customer has Orders, Order has Items
// Order -> Customer

public class Dog {
  // ! Incorrect usage
  // private Optional<String> email;

  private String email;
  private String name;
  private int age;

  public boolean isEmailEmpty() {
    return this.email == null;
  }

}
