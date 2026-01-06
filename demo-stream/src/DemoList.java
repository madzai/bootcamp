import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    // ! Approaches to create ArrayList Object
    List<String> names4 = new ArrayList<>(List.of("John", "Peter"));

    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Peter");

    // read
    System.out.println(names.get(0));
    // add
    names.add("Sally");
    // update
    names.set(1, "Steven");
    System.out.println(names);

    List<String> names2 = List.of("John", "Peter");
    // read
    System.out.println(names2.get(0));
    // add
    // names2.add("Sally"); // ! cannot add
    // update
    // names2.set(1, "Steven"); // ! cannot update
    System.out.println(names2.contains("John"));
    System.out.println(names2);

    List<String> names3 = Arrays.asList("John", "Peter");
    // read
    System.out.println(names3.get(0));
    // add
    // names3.add("Sally"); // ! cannot add
    // update
    names3.set(1, "Steven");
    System.out.println(names3);

    // 1. Read element
    // 2. Add element (Sally)
    // 3. Update element: Peter -> Steven

    // ! Stream -> create a completely new Structure to return
    // List.of() -> stream -> collect -> ArrayList()


  }
}
