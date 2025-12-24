import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
  public static void main(String[] args) {
    // Java 5 ()
    String[] names = new String[3]; // fixed length
    ArrayList<String> strings = new ArrayList<>();

    // before Java 5
    List emails = new ArrayList(); // ! Java: type is not ensured in compile time
    // List<Object> obejcts = new ArrayList<>(); // ! smilar to List<Object>
    // Parent class is Object -> can't call child class methods
    emails.add("leo@gmail.com");
    emails.add("jenny@gmail.com");
    System.out.println(emails.size()); // 2

    emails.add(true); // can add any type
    emails.add(100);
    emails.add('c');
    // emails.get(0).charAt(0); // compile time error: type is not sure

    for (Object o : emails) {
      if (o instanceof String) { // ! check the type of object
        String s = (String) o; // ! Polymorphism, need to down cast to use child class methods
        System.out.println(s.charAt(0));
      } else if (o instanceof Boolean) {

      } else if (o instanceof Integer) {

      }
    }

    // After Java 5, declare data type -> can map methods for the data type
    List<String> passwords = new ArrayList<>();
    // passwords.add(100); // compile time error: can only add String
    passwords.add("abcd");
    passwords.add("1234aaa");

    // ! No longer need instanceof, the type of elements is ensured during compile time
    for (String p : passwords) {
      System.out.println(p.charAt(0));
    }



  }
}
