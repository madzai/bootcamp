import java.util.ArrayList;

public class DemoArrayList {
  public static void main(String[] args) {
    // ! Array Disadvantages:
    // 1. Fixed Length
    int[] arr = new int[3];

    // ! Data Structure -> array and linkedlist (memory)
    // ! High level Structure -> ArrayList
    // ArrayList<String> names = new ArrayList<String>(); // older ways to write code
    ArrayList<String> names = new ArrayList<>(); // Constructor "ArrayList<>()"
    names.add("John"); // in theory, loop, especially when adding to a large-sized array
    names.add("Steve"); // in theory, loop
    names.add("Mary"); // in theory, loop
    names.add(new String("Mary"));
    names.add(new String("Mary"));
    System.out.println(names); // built-in method: ArrayList.toString()

    ArrayList<Integer> scores = new ArrayList<>();
    scores.add(83);
    scores.add(25);
    scores.add(100);
    System.out.println(scores);

    // 2. remove() (equals, remove the first element)
    names.remove("Mary"); // remove() -> String.equals()
    // still works if there's another names.add(new String("Mary"))
    // because String .equals() method is overriden by comparing String content (instead of object address)
    names.remove(new String("Mary"));
    System.out.println(names);

    names.remove(1); // array index

    // Class (name, score) -> ArrayList of the Class
    // John 83, Elsa 25, Steve 100
    Student s1 = new Student("John", 80);
    ArrayList<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(new Student("Steve", 25));
    students.add(new Student("Mary", 100));

    //
    s1.setScore(90);
    System.out.println(students.get(0).getScore()); // 90

  }
}
