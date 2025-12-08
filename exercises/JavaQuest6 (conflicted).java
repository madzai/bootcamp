package exercises;

public class JavaQuest6 {
  public static void main(String[] args) {
    /**
     * Expected output: 0 1 1 2 3 5 8 13 21 ...
     * 
     */

    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence
    int before = 0;
    int now = 0;
    int next = 0;

    for (int i = 0; i < 15; i++) {
      if (i == 0) {
        now = first;
      } else {
        if (i == 1) {
          before = first;
          now = second;
        } else {
          before = now;
          now = next;
        }
        next = before + now;
      }
      System.out.print(now + " ");
    }
  }
}
