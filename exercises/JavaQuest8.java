package exercises;

import java.util.Arrays;

public class JavaQuest8 {
  public static void main(String[] args) {
    /**
     * Write a loop to find the second max number. Example Output for testCase1: Second Max = 230
     */
    int[] testCase1 = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] testCase2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] testCase3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] testCase4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here ...
    int[] testCase = testCase1;
    System.out.println(Arrays.toString(testCase));
    // int max = testCase[0];
    int tool;

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < testCase.length - 1 - i; j++) {
        if (testCase[j] > testCase[j + 1]) {
          tool = testCase[j + 1];
          testCase[j + 1] = testCase[j];
          testCase[j] = tool;
        }
      }
    }

    // System.out.println(Arrays.toString(testCase));
    secondMax = testCase[testCase.length - 2];
    System.out.println("2nd max: " + secondMax);

  }
}
