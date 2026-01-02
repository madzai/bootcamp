import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashTable {
  public static void main(String[] args) {
    // HashTable vs HashMap
    // ! HashTable is thread-safe, while HashMap is not
    // Map<Integer, String> map = new HashMap<>();
    Map<Integer, String> map = new Hashtable<>();

    // task
    Runnable addInteger1 = new Runnable() {
      @Override
      public void run() {
        for (int i = 1; i <= 100_000; i++) {
          map.put(i, String.valueOf(i));
        }
      }
    };

    Runnable addInteger2 = new Runnable() {
      @Override
      public void run() {
        for (int i = 1; i <= 100_000; i++) {
          map.put(i, String.valueOf(i));
        }
      }
    };

    // put()
    Thread t1 = new Thread(addInteger1);
    Thread t2 = new Thread(addInteger2);
    try {
      t1.start();
      t2.start();
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }

    System.out.println(map.size());


  }
}
