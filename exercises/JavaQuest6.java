package exercises;

public class JavaQuest6 {
  public static void main(String[] args) {
    /**
     * Expected output: 0 1 1 2 3 5 8 13 21 ...
     * 
     */

    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence
    int n1 = 0;
    int n2 = 0;
    for (int i = 0; i < 15; i++) {
      if (i == 0) {
        System.out.print(first + " ");
      } else if (i == 1) {
        System.out.print(second + " ");
        n1 = second;
        n2 = first + second;
      } else {
        n2 = n1;
        System.out.print(n2 + " ");
      }
    }
  }
}
