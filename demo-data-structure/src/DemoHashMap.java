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
      studentMap.put(student.getName(), student); // add Entry
    }

    // For Searching, just need get() to find target object
    // ! HashMap.get() -> use Key to find Value
    System.out.println("Sally's score: " + studentMap.get("Sally").getScore()); // 80

    // A Map has many entries
    System.out.println("for loop: print key + value");
    for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
      System.out.println(entry.getKey() + ", " + entry.getValue());
    }

    // ! HashMap use get() to find target object, while ArrayList use loop to find target object
    Student leo = studentMap.get("Leo"); // ! risky (.get can give null result)
    if (leo != null) {
      System.out.println("Leo exists: " + leo.getName() + "/" + leo.getScore());
    } else {
      System.out.println("Leo does not exist");
    }


  }
}
