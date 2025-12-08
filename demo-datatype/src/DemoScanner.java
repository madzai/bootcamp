import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number: ");
    int input = scanner.nextInt(); // ! Ask Question
    System.out.println("input = " + input);

    if (input % 2 == 0) {
      System.out.println("Even number");
    } else {
      System.out.println("Odd number");
    }

  }
}
