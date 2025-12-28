import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class DemoLinkedList {
  public static void main(String[] args) {

    // ! Java LinkedList: Double LinkedList
    LinkedList<String> names = new LinkedList<>();
    names.add("John");
    names.add("Sally");
    names.add("Leo");
    System.out.println("Names: " + names);
    System.out.println("Size: " + names.size());
    names.remove("John");
    System.out.println("Removed John: " + names);
    System.out.println("Contains Sally? " + names.contains("Sally"));
    System.out.println("Empty? " + names.isEmpty());

    // ! Java ArrayList vs LinkedList
    // add, remove, size, isEmpty, contains

    // get(index)
    System.out.println("Index 1: " + names.get(1)); // Leo
    // ! ArrayList.get() -> performance is good -> O(1)
    // ! LinkedList.get() -> performance not good -> O(n)

    // Polymorphism
    // Left: List is interface
    // Right: any type of List: inlcuding ArrayList, LinkedList, Vector, and Stack
    List<String> emails = new ArrayList<>();
    emails.add("x@gmail.com");
    emails = new LinkedList<>();
    emails.add("x@gmail.com");
    emails = new Vector<>();
    emails = new Stack<>();

    // Only need to change right side to e.g. change from LinkedList to ArrayList
    List<String> emails2 = new LinkedList<>();
    String[] rawEmails = new String[] {"abc@gmail.com", "x@gmail.com"};
    for (String email : rawEmails) {
      emails2.add(email);
    }

    // Polymorphism
    Set<Integer> integers = new HashSet<>();
    integers.add(45);
    integers.add(90);
    integers.add(45);
    System.out.println("Size of integers hashset: " + integers.size());

  }
}
