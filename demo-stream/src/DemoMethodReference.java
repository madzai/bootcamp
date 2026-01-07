import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    List<String> names = List.of("Kelly", "Jenny", "Oscar");

    // ! Consumer (consume 1 parameter)
    // Lambda
    names.forEach(e -> System.out.println(e));

    // Method Reference
    names.forEach(System.out::println);

    String name = "John";
    Supplier<Integer> lengthSupplier = () -> name.length();
    System.out.println(lengthSupplier.get()); // 4

    Supplier<Integer> lengthSupplier2 = name::length;
    System.out.println(lengthSupplier2.get());


    List<String> words = Arrays.asList("apple", "banana", "cherry");
    // Lambda Expression
    Comparator<String> compareToIgnoreCase1 =
        (s1, s2) -> s1.compareToIgnoreCase(s2);

    // Method Reference (Default: s1.compareToIgnoreCase(s2))
    Comparator<String> compareToIgnoreCase2 = String::compareToIgnoreCase;

    Collections.sort(words, compareToIgnoreCase1);
    Collections.sort(words, compareToIgnoreCase2);
    System.out.println(words);


    //
    Function<String, Integer> stringToInteger = s -> Integer.valueOf(s);
    Function<String, Integer> stringToInteger2 = Integer::valueOf;
    System.out.println(stringToInteger.apply("100") + 50);
    System.out.println(stringToInteger2.apply("66") + 4);

    //
    BiFunction<Integer, String, Student> createStudentFunction =
        (id, stName) -> new Student(id, stName);
    BiFunction<Integer, String, Student> createStudentFunction2 = Student::new;
    Student s1 = createStudentFunction.apply(1, "John");
    Student s2 = createStudentFunction2.apply(2, "Peter");

  }

  public static class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

  }


}
