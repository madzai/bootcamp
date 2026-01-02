import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoThread2 {

  public static void main(String[] args) {
    // ! ArrayList is not Thread-safe -> all of its methods are not thread-safe
    // ArrayList<Integer> integers = new ArrayList<>();
    List<Integer> integers = new Vector<>(); // ! Vector is a synchronized version of ArrayList

    // tasks loop i: 0-9999, add i into ArrayList
    Runnable insertOneTask = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100_000; i++) {
          // ! add() is not thread-safe
          integers.add(i);
        }
      }
    };

    // Thread 1 and 2
    long before = System.currentTimeMillis();
    Thread t1 = new Thread(insertOneTask); // worker 1
    Thread t2 = new Thread(insertOneTask); // worker 2

    try {
      t1.start();
      t2.start();
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }
    long after = System.currentTimeMillis();

    // < 200_000
    System.out.println(integers.size());
    // System.out.println(integers.get(integers.size() - 1));
    System.out.println("time used=" + (after - before)); // 12 ms for Vector, 2 ms for ArrayList (may have error sometimes for arrays)


  }

}
