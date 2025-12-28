import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    Queue<String> names = new PriorityQueue<>(); // Priority Queue -> natural order
    names.add("Jenny");
    names.add("Anson");
    names.add("John");
    names.add("Ben");
    names.add("Peter");
    names.add("Alex");
    System.out.println("names: " + names);

    // ordering: when happen? (not when add)
    // ! Every poll -> perform sorting -> then remove (therefore slow)
    System.out.println(names.poll()); // Alex
    System.out.println(names.poll()); // Anson
    System.out.println(names.poll()); // Ben
    names.add("Candy");
    System.out.println(names.poll()); // Candy
    System.out.println(names.poll()); // Jenny
    System.out.println(names.poll()); // John
    System.out.println(names.poll()); // Peter

    //
    // Queue<Integer> ages = new PriorityQueue<>();


  }
}
