import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {
  public static void main(String[] args) {
    // Queue<Student> studentQueue = new LinkedList<>();
    Deque<Student> studentQueue = new LinkedList<>();
    studentQueue.add(new Student("Leo", 50));
    studentQueue.add(new Student("Sally", 10));
    studentQueue.add(new Student("Peter", 99));
    studentQueue.addLast(new Student("Steve", 55)); // not available for Queue
    studentQueue.addFirst(new Student("Oscar", 93)); // not available for Queue

    System.out.println(studentQueue.poll().getName()); // pollFirst()
    System.out.println(studentQueue.pollLast().getName()); // ! Deque

    studentQueue.peek(); // peekFirst
    studentQueue.peekLast(); // ! Deque

    // Oscar, Leo, Sally, Peter, Steve
    // Leo, Sally, Peter, Steve
    // Leo, Sally, Peter
    Student target = null;
    while (!studentQueue.isEmpty()) {
      if (studentQueue.peekFirst().getScore() //
          > studentQueue.peekLast().getScore()) {
        target = studentQueue.pollFirst();
      } else {
        target = studentQueue.pollLast();
      }
      System.out.println(target.getName());
    }
    // Peter -> Leo -> Sally

    // ! Queue -> FIFO
    // ! Deque -> FIFO / LIFO

  }
}
