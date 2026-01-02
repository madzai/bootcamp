import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread {
  // ! int -> non-thread-safe
  // ! Primitive, ArrayList, LinkedList, HashSet, HashMap, Array, Wrapper Class

  // private int x;
  private AtomicInteger x = new AtomicInteger(0);

  public int getX() {
    // return this.x;
    return this.x.get();
  }

  // ! sychronized method supports mutli-threading
  public void addOne() {
    // public synchronized void addOne() {
    // this.x++; // x++ -> read and write
    this.x.getAndIncrement(); // x++ for AtomicInteger
  }

  public static void main(String[] args) {
    // main thread (worker 0)

    DemoThread box = new DemoThread();
    // System.out.println(box.getX()); // 0

    // Task
    // anonymus class -> define and create the object at Runtime
    Runnable addOneTask = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100_000; i++) {
          box.addOne();
        }
      }
    };

    Thread t1 = new Thread(addOneTask); // worker 1
    Thread t2 = new Thread(addOneTask); // worker 2

    // ! main thread tells t1 to start working
    try {
      t1.start(); // start() -> task.run()
      t2.start(); // start() -> task.run()
      // ! Concept: No one knows which thread is faster for execution
      // ! Concept: Thread-safe
      t1.join(); // main thread to wait for t1 to come back (x becomes 100_000 now)
      t2.join(); // main thread to wait for t2 to come back
    } catch (InterruptedException e) {

    }

    // ! By default, main thread won't wait for other threads to come back
    System.out.println(box.getX()); // < 200_000

  }
}
