import java.util.Random;
import java.util.Scanner;

public class DemoBingo2Vincent {
  public static void main(String[] args) {
    // 1-100 (random number)
    // random: 73
    // One user
    // 0. Ask user to input a number between x and y
    // 1. compare user input (from scanner) to the random number
    // 1b. Out of the range, ask the question again, until input is valid
    // 2. if same -> end game.
    // 3. if not -> update the range for selection, e.g.
    // Round 1 user picks 69, range becomes 70-100
    // Round 2 user picks 90, range becomes 70-89
    // ...

    // Version 2: Support User A & B, show the winner
    // Ask user A to input a number between x and y
    // ...
    // User B wins

    Scanner scanner = new Scanner(System.in);
    int userInput = -1;
    int bingo = new Random().nextInt(99) + 1; // (0-99) + 1 -> (1-100)
    int min = 1;
    int max = 100;
    int round = 1;
    String user = "";

    while (userInput != bingo) {
      if (round++ % 2 == 1) {
        user = "User A";
      } else {
        user = "User B";
      }
      System.out.println(
          user + ", please input a number between " + min + " & " + max);
      userInput = scanner.nextInt();
      if (userInput < min || userInput > max) {
        continue;
      }
      if (bingo == userInput) {
        System.out.println("Bingo!");
      } else {
        if (bingo > userInput) {
          min = userInput + 1;
        } else if (bingo < userInput) {
          max = userInput - 1;
        }
      }
    }
    String winner = round % 2 == 1 ? "User A" : "User B";
    System.out.println(winner + " wins");

  }
}
