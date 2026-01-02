public class App {
  public static void main(String[] args) throws Exception {
    // worker 0 (main thread)

    int x = 3;
    x++; // 4 task 1 -> worker 1
    x++; // 5 task 2 -> worker 2
    System.out.println(x); // 5
  }
}
