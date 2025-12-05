import java.util.Arrays;

public class DemoArray2 {
  public static void main(String[] args) {
    // array -> for loop
    String name1 = "John"; // name1 is an address, John is an object
    String name2 = "Cathy";
    String name3 = "Jenny";

    String[] students = new String[3];
    students[0] = name1; // ! students[0] is an object reference (address), pointing to an object (object pointed by name1, instead of name1 which is an address)
    students[1] = name2;
    students[2] = name3;

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i]);
    }

    name1 = "Leo"; // ! change the address, pointing to Leo
    System.out.println();
    System.out.println(students[0]); // John instead of Leo
    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i]);
    }

    // Algorithm
    // 1. Swap
    int a = 10;
    int b = 20;
    System.out.println("a, b = " + a + ", " + b);

    int c = a;
    a = b;
    b = c;
    System.out.println("a, b = " + a + ", " + b);

    // 2. Max/Min
    int[] scores = new int[] {23, 8, 97, 56};
    int max = scores[0];
    int min = scores[0];
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > max) {
        max = scores[i];
      }
      if (scores[i] < min) {
        min = scores[i];
      }
    }
    System.out.println("Min, Max = " + max + ", " + min);

    // 3. Move the Max value to tail
    // 23, 100, 8, 97, 56
    // 23, 8, 100, 97, 56
    // 23, 100, 8, 97, 56
    // 23, 100, 8, 97, 56
    // 23, 100, 8, 97, 56
    scores = new int[] {23, 100, 8, 97, 56};
    int backup = -1;

    for (int i = 0; i < scores.length - 1; i++) {
      if (scores[i] > scores[i + 1]) {
        backup = scores[i];
        scores[i] = scores[i + 1];
        scores[i + 1] = backup;
      }
    }

    System.out.println("After moving max to the tail:");
    for (int i = 0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }

    // 4. Algorithm - Bubble Sort
    // x, x, x, x, 100
    // x, x, x, 97, 100
    // x, x, 56, 97, 100
    // x, 23, 56, 97, 100
    scores = new int[] {23, 100, 8, 97, 56};
    backup = -1;
    for (int i = 0; i < scores.length - 1; i++) {
      for (int j = 0; j < scores.length - i - 1; j++) {
        if (scores[j] > scores[j + 1]) {
          backup = scores[j];
          scores[j] = scores[j + 1];
          scores[j + 1] = backup;
        }
      }
    }

    System.out.println("After bubble sorting:");
    System.out.println(Arrays.toString(scores));

  }
}
