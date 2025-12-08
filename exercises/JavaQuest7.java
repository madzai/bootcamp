package exercises;

public class JavaQuest7 {
  public static void main(String[] args) {
    /**
     * The sum is 55
     */
    // Sum values of an array

    // Declare a int array, with value 1 to 10
    // code here
    int[] integers = new int[10];
    for (int i = 0; i < 10; i++) {
      integers[i] = i + 1;
      System.out.print(i + 1 + " ");
    }

    int sum = 0;

    // Write a loop to sum up all value in the int array
    // code here ...
    for (int i = 0; i < 10; i++) {
      sum += integers[i];
    }
    System.out.println("has sum " + sum);

  }
}
