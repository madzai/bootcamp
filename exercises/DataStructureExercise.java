package exercises;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    ArrayList<Integer> numbers = new ArrayList<>();
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    for (int i = 1; i < 6; i++)
      numbers.add(i * 10);
    // 1c. Print all the elements in the list.
    System.out.println(numbers);
    // 1d. Remove the number 30 from the list.
    numbers.remove(2);
    // 1e. Print the size of the list.
    System.out.println(numbers.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    ArrayList<String> fruits = new ArrayList<>();
    String[] fruitsStr = new String[] {"Apple", "Banana", "Mango", "Orange"};
    for (String f : fruitsStr)
      fruits.add(f);
    // 2b. Check if "Grapes" exists in the list.
    System.out.println(fruits.contains("Grapes"));
    // 2c. If it doesn’t exist, add it to the list.
    if (!fruits.contains("Grapes"))
      fruits.add("Grapes");
    // 2d. Update "Mango" to "Peach".
    fruits.set(2, "Peach");
    // 2e. Print the final list.
    System.out.println(fruits);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    ArrayList<Integer> q3 = new ArrayList<>();
    q3.add(10);
    q3.add(20);
    q3.add(10);
    q3.add(30);
    q3.add(40);
    q3.add(20);
    q3.add(50);
    // System.out.println(q3);
    // 3b. Remove duplicates from the list using a HashSet.
    HashSet<Integer> q3Hs = new HashSet<>(q3);
    // 3c. Print the list after removing duplicates.
    System.out.println(q3Hs);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    HashSet<String> q4 = new HashSet<>();
    q4.add("USA");
    q4.add("India");
    q4.add("China");
    q4.add("Japan");
    // 4b. Add "Canada" to the set.
    q4.add("Canada");
    // 4c. Add "India" again. Print the result.
    System.out.println(q4.add("India"));
    // 4d. Print all elements in the set.
    System.out.println(q4);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    HashSet<Double> q5 = new HashSet<>();
    q5.add(1.1);
    q5.add(2.2);
    q5.add(3.3);
    q5.add(4.4);
    q5.add(5.5);
    System.out.println(q5);
    // 5b. Check if the set contains the number 3.3
    System.out.println(q5.contains(3.3));
    // 5c. Remove the number 2.2 from the set.
    q5.remove(2.2);
    // 5d. Print the size of the set.
    System.out.println(q5.size());

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    HashSet<Integer> q6a = new HashSet<>();
    HashSet<Integer> q6b = new HashSet<>();
    for (int i = 1; i < 5; i++)
      q6a.add(i * 10);

    for (int i = 3; i < 7; i++)
      q6b.add(i * 10);

    // System.out.println(q6a);
    // System.out.println(q6b);
    // 6d. Find the common numbers of the two sets.
    HashSet<Integer> q6 = new HashSet<>();
    for (int i = 1; i < 7; i++)
      if (q6a.contains(10 * i) && q6b.contains(10 * i))
        q6.add(i * 10);
    // 6e. Print the resulting set.
    System.out.println(q6);

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    HashSet<String> q7a = new HashSet<>();
    q7a.add("Cherry");
    q7a.add("Steve");
    q7a.add("Chole");
    q7a.add("Jenny");
    q7a.add("Vicky");
    // 7b. Convert the HashSet to an ArrayList.
    ArrayList<String> q7b = new ArrayList<>(q7a);
    // 7c. Print the converted list.
    System.out.println(q7b);

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    ArrayList<Student> students = new ArrayList<>();
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));
    // 8b. Iterate over the ArrayList and print each student's details.
    for (Student s : students)
      System.out.println(s.getId() + ": " + s.getName());
    // 8c. Remove the student Bob.
    for (Student s : students)
      if (s.getName() == "Bob")
        students.remove(s);
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    System.out.println(findStudent(1, students));
    System.out.println(findStudent(3, students));
    System.out.println(findStudent(5, students));
    // 8e. Create another ArrayList to store student with name starts with 'A'
    ArrayList<Student> namesA = new ArrayList<>();
    findNamesStartWith('A', students, namesA);
    System.out.println(namesA);

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    HashSet<Student> q9a1 = new HashSet<>();
    HashSet<Student> q9a2 = new HashSet<>();
    q9a1.add(new Student(1, "Alice"));
    q9a1.add(new Student(2, "Bob"));
    q9a1.add(new Student(3, "Charlie"));

    q9a2.add(new Student(2, "Bob"));
    q9a2.add(new Student(3, "Charlie"));
    q9a2.add(new Student(4, "David"));
    // 9b. Find the common students of the two sets
    HashSet<Student> q9b = new HashSet<>();
    // 9c. Print the result.

  }

  public static void findNamesStartWith(char ch, ArrayList<Student> students,
      ArrayList<Student> matches) {
    for (Student s : students)
      if (s.getName().charAt(0) == ch)
        matches.add(new Student(s.getId(), s.getName()));
  }

  public static String findStudent(int id, ArrayList<Student> students) {
    for (Student s : students)
      if (s.getId() == id)
        return s.getName();
    return "Student not found";
  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    // getter, setter, etc.

    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Student(id=" + this.id //
          + ",name=" + this.name + ")";
    }
  }
}
