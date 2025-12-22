import java.util.ArrayList;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    // Java Collection: List/Set/Queue
    // ! Set (Avoid duplicates)
    HashSet<String> names = new HashSet<>();
    names.add("Tommy"); // return true
    names.add("Jenny"); // return true
    names.add("Tommy"); // return false
    System.out.println(names.size()); // 2
    System.out.println(names); // [Jenny, Tommy]

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(15);
    ages.add(30);
    ages.add(15);
    ages.add(45);
    System.out.println(ages);

    // ! Avoid Duplicated element by adding one by one
    HashSet<Integer> ageSet = new HashSet<>();
    for (Integer age : ages) {
      if (!ageSet.add(age)) { // ! Integer.equals() & hashCode()
        System.out.println("Duplicated element: " + age);
      }
      // ageSet.add(age); // ! performance: loop -> check duplicate? break
    }
    System.out.println("HashSet(ages) .add: " + ageSet);


    // // John 80, Jenny 70, John 80
    HashSet<Student> students = new HashSet<>();
    students.add(new Student("John", 80)); // equals() and hashCode()
    students.add(new Student("Jenny", 70));
    students.add(new Student("John", 80));
    System.out.println();
    System.out.println("Students size: " + students.size()); // 2
    // System.out.println(students);
    for (Student s : students)
      System.out.println(s.getName());


    // contains()
    // isEmpty()
    // size()
    // remove()
    HashSet<Integer> age3 = new HashSet<>(ages);
    System.out.println();
    System.out.println("HashSet(ages ArrayList): " + age3);

    System.out.println("Contains 30? " + age3.contains(30));
    System.out.println("Contains 80? " + age3.contains(80));
    System.out.println("isEmpty? " + age3.isEmpty()); // false
    System.out.println("Size: " + age3.size()); // 3
    // ! can't remove (index)
    // HashSet implements Set interface
    // ArrayList implements List interface
    // List, Queue, Set extends Collection: e.g. .contains()
    age3.remove(30);
    System.out.println("Removed 30: " + age3);

    HashSet<Integer> hs = new HashSet<>();
    hs.add(14);
    hs.add(23);
    hs.add(49);
    hs.add(58);
    hs.add(100);
    hs.add(120);
    // ! HashSet -> No Ordering
    // hashset has natural order (usually different from user's input order)
    System.out.println("hs: " + hs);

    ArrayList<Integer> al = new ArrayList<>();
    al.add(14);
    al.add(23);
    al.add(49);
    al.add(58);
    al.add(100);
    al.add(120);
    System.out.println("al: " + al);
  }
}
