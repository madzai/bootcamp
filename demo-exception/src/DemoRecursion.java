public class DemoRecursion {
  public static void main(String[] args) {
    // 5 + 4 + 3 + 2 + 1
    int sum = 0;
    for (int i = 5; i >= 1; i--)
      sum += i;
    System.out.println(sum); // 15

    System.out.println(sum(5)); // 15

    System.out.println(rSum(5)); // 15

    // 100 + 98 + 96 + 94 + ... + 2
    System.out.println(rSumEven(100));

    // 3 * 6 * 9 * 12 * n, given n is a 3 multiple
    System.out.println(rProduct3(9)); // 12

  }

  public static int rProduct3(int n) {
    if (n <= 3)
      return 3;
    return n * rProduct3(n - 3);
  }

  public static int rSumEven(int n) {
    if (n <= 2)
      return 2;
    return n + rSumEven(n - 2);
  }

  // ! Recursion (call itself)
  public static int rSum(int n) {
    // base criteria
    if (n <= 1)
      return 1;
    return n + rSum(n - 1); // 2 + rSum(2 - 1)
  }
  // ! Step 1: 5 + rSum(5 - 1)
  // ! Step 2: 4 + rSum(4 - 1)
  // ! Step 3: 3 + rSum(3 - 1)
  // ! Step 4: 2 + rSum(2 - 1)
  // ! Step 5: return 1

  // Given n >= 1
  // n + (n - 1) + (n - 2) + ... + 1
  public static int sum(int n) {
    int sum = 0;
    for (int i = n; i >= 1; i--)
      sum += i;
    return sum;
  }
}
