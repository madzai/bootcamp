import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // ArrayList, HashSet, LinkedList

    // KEY -> VALUE
    // Student id -> Student
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("John", 30));
    students.add(new Student("Sally", 80));
    students.add(new Student("Leo", 90));

    // KEY: Student name, VALUE: Student
    Map<String, Student> studentMap = new HashMap<>();
    for (Student student : students) {
      studentMap.put(student.getName(), student);
    }

    // For Searching, just need get() to find target object
    // ! HashMap.get() -> use Key to find Value
    System.out.println("Sally's score: " + studentMap.get("Sally").getScore()); // 80
  }
}
