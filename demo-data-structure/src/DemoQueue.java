import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

  public static void main(String[] args) {
    // PriorityQueue -> Queue (-> implements)
    // ArrayDeque -> Deque
    // LinkedList -> Deque
    // ArrayDeque

    // ArrayDeque<String> names = new ArrayDeque<>();
    // Deque<String> names2 = new ArrayDeque<>(); // ! hiding
    // Queue<String> names3 = new ArrayDeque<>(); // ! hiding
    // Collection<String> names4 = new ArrayDeque<>(); // ! hiding

    // Collection<String> names4 = new ArrayDeque<>();
    // Queue<String> names3 = names4; // error: putting parent object for child class
    // ArrayDeque<String> names = new ArrayDeque<>();
    // Deque<String> names2 = names; // OK

    // All OK
    // ! We have only one object ArrayQueue
    // ! But we have 4 different object references
    ArrayDeque<String> names = new ArrayDeque<>();
    Deque<String> namesDeque = names;
    Queue<String> namesQueue = names; // ! hiding
    Collection<String> namesCollection = names; // ! hiding


    // What's the difference?
    namesDeque.poll();
    namesDeque.push("John");
    namesDeque.pollLast();
    namesDeque.pollFirst();

    namesQueue.poll();
    namesQueue.add("Sally");
    // namesQuque.push("John");
    // namesQueue.pollLast();
    // namesQueue.pollFirst();

    namesCollection.add("Leo");
    // namesCollection.poll();
    // namesCollection.push("John");
    // namesCollection.pollLast();
    // namesCollection.pollFirst();

    // Queue
    Queue<Student> studentQueue = new LinkedList<>(); // ! 90% scenario -> LinkedList for Queue
    studentQueue.add(new Student("Leo", 50)); // add to tail (addLast)
    studentQueue.add(new Student("Sally", 10));
    studentQueue.add(new Student("Peter", 99));

    // Peek the first student in the queue
    System.out.println(studentQueue.peek().getName()); // Leo

    Student queueHead = studentQueue.poll(); // remove first
    System.out.println(queueHead.getName()); // Leo
    System.out.println(studentQueue.peek().getName()); // Sally

    // poll() -> pick the head
    // add() -> add to the tail

    // Queue String
    // "apple", "orange", "kiwi", "banana"
    // Queue<String> fruitQueue = new LinkedList<>();
    Queue<String> fruitQueue = new ArrayDeque<>(); // same result as LinkedList to run Queue operations
    fruitQueue.add("apple");
    fruitQueue.add("orange");
    fruitQueue.add("kiwi");
    fruitQueue.add("banana");

    System.out.println(fruitQueue.contains("orange"));
    System.out.println(fruitQueue.isEmpty());
    System.out.println(fruitQueue.remove("kiwi")); // loop, but seldom used for Queue
    System.out.println(fruitQueue.size());
    System.out.println(fruitQueue.toString());

    // ! Queue Loop -> Consume (First IN First OUT)
    while (!fruitQueue.isEmpty()) {
      String fruit = fruitQueue.poll();
      // do something for the fruit
      System.out.println(fruit);
    }


  }
}
