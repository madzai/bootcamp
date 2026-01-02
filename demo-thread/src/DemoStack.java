import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // Stack
    // ! LIFO (push and pop), similar to Deque
    Stack<String> names = new Stack<>();
    names.push("John");
    names.push("Leo");
    names.push("Sally");
    System.out.println(names.pop()); // Sally
    System.out.println(names.pop()); // Leo
    System.out.println(names.pop()); // John

    // ! Stack is Thread-safe, while LinkedList is non Thread-safe
    Stack<Integer> queue = new Stack<>();
    // Deque<Integer> queue = new LinkedList<>();

    Runnable insertOneTask = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100_000; i++) {
          queue.add(i);
        }
      }
    };

    Thread t1 = new Thread(insertOneTask);
    Thread t2 = new Thread(insertOneTask);
    try {
      t1.start();
      t2.start();
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(queue.size()); // LinkedList: 140566 vs Stack: 200000


  }
}
