import java.util.Arrays;

public class DemoLoop3 {
  public static void main(String[] args) {
    String s = "hello";
    // while loop
    int n = 0;
    System.out.println("While loop");
    while (n < s.length()) {
      System.out.println(s.charAt(n));
      n++;
    }

    // for loop
    // ! Same iteration: access more than 1 element (e.g. s.charAt(i) s.charAt(i + 1))
    // ! Read and Write
    System.out.println("For loop");
    for (int i = 0; i < s.length(); i++) {
      // System.out.println(s.charAt(i));
      System.out.println(s.charAt(s.length() - i - 1)); // not possible for for-each loop
    }

    // for-each (loop through all elements once)
    // ! Read ONLY
    System.out.println("For each");
    char[] chs = s.toCharArray();
    for (char ch : chs) {
      System.out.println(ch);
      // ch = 'x'; // ! meaningless: can't edit the array
    }
    System.out.println(Arrays.toString(chs)); // hello

    // int[] 4, -8, 100, 34
    // for-each print all elements
    System.out.println("For each");
    int[] arr = new int[] {4, -8, 100, 34};
    for (int x : arr) {
      System.out.println(x);
    }

    System.out.println("For each price");
    double[] prices = new double[] {4.5, 90.9, 23.3, 10.2};
    for (double price : prices) {
      System.out.println(price);
    }

    // do-while (the loop execute at least once)
    // DemoBingo -> do while
    n = 0;
    do {
      System.out.println("hello " + n); // n = 0 - 4
      n++;
    } while (n < 5);

    // String method: split()
    System.out.println("string split by space:");
    String email = "Dear Sir, I am writing to ...";
    String[] words = email.split(" "); // return String[]
    for (String word : words) {
      System.out.println(word);
    }


  }
}
